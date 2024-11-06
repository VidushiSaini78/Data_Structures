class Solution {
    public boolean canSortArray(int[] nums) 
    {
        HashMap<Integer,Byte> mapp = findSetBits(nums);
        short pmax = 0, cmin = 0, cmax = 0;
        byte pcnt = 0;
        for (final int v : nums) {
            final byte ccnt = mapp.get(v);
            
            if (pcnt == ccnt) { 
                cmin = cmin > v ? (short) v : cmin; 
                cmax = cmax < v ? (short) v : cmax; 
            } else if (cmin < pmax) { 
                return false;  
            } else {
               
                pmax = cmax;
                cmin = cmax = (short) v;
                pcnt = ccnt;  
            }
        }
        return cmin >= pmax;
        
    }
    static HashMap<Integer, Byte > findSetBits(int[] nums) {
        HashMap<Integer, Byte> mapp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            byte value = countBits(nums[i]);
            mapp.put(nums[i], value); 
        }
        return mapp;
    }
    static byte countBits(int num) {
        byte count = 0;
        while (num > 0) {
            count += num & 1; 
            num >>= 1;
        }
        return count;
    }
}

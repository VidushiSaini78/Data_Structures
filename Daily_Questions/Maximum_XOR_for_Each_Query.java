class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int mask =(1 << maximumBit) - 1;
        int xor = 0;
        for(int i=0;i<nums.length ;i++)
        {
            xor ^= nums[i];
        }        
        int ans[]=new int[nums.length];
        for(int i=0; i<nums.length ; i++)
        {
            int k = xor ^ mask ;
            ans[i] = k;
            xor = (xor^nums[nums.length-i-1]);
        
        }
    return ans;
        
    }
}

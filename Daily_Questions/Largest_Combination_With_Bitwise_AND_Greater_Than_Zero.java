class Solution {
    public int largestCombination(int[] candidates) {
        int max = 0 ;
       for(int bit_position=0 ; bit_position<24 ; bit_position++)
       {
            int count = 0 ;
            for(int num : candidates)
            {
                if((num & 1<<bit_position)!=0)
                count++;
            }
            max = Math.max(count  , max);

       }
    return max;
    }
    
}

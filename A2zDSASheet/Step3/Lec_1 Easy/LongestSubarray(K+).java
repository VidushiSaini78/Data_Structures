import java.util.HashMap;

public class Solution {
    public static int longestSubarrayWithSumK(int[] ar, long k) {
        HashMap<Long, Integer> mapp = new HashMap<>();
        Long prefixSum =0L;
        int maxLength =0;
        for(int i=0 ; i<ar.length;i++)
        {
            prefixSum += ar[i];
            if(prefixSum == k)
                maxLength = Math.max(maxLength , i+1);
            Long find= prefixSum-k;
            if(mapp.containsKey(find))
            {
                int index = mapp.get(find);
                maxLength = Math.max(maxLength , i-index);
            }
            if(!mapp.containsKey(prefixSum))
            {
                mapp.put(prefixSum , i);
            }
        }
        return maxLength;
    }
}

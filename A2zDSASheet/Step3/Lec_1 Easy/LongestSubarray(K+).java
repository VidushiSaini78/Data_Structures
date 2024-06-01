import java.util.HashMap;

public class Solution {
    // Solution 3 applicable to both types of arrays 1) containing only positive 2) Containing +ve or -ve
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
    // Solution 4 most optimized (Only valid for array having only positive number)
    static int longest(int ar[], int k) {
        int maxLength = -1;
        int start = 0;
        int end = 0;
        int current_sum = 0;
        while (end < ar.length) {
            current_sum += ar[end];
            if (current_sum == k)
                maxLength = Math.max(maxLength, end - start + 1);
            else if (current_sum > k) {
                current_sum -= ar[start];
                start++;
            }
            end++;
        }
        return maxLength;
    }
}

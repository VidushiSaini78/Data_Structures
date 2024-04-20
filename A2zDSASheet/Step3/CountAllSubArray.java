import java.util.* ;
import java.io.*; 
public class Solution {
    public static int findAllSubarraysWithGivenSum(int arr[], int s) {
        int n = arr.length; // size of the given array.
        Map<Integer, Integer> mpp = new HashMap<>();
        int preSum = 0, cnt = 0;

        mpp.put(0, 1);
        for (int i = 0; i < n; i++) {
            preSum += arr[i];
            int remove = preSum - s;
            cnt += mpp.getOrDefault(remove, 0);
            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }
         return cnt;

    }
}
/*
TC : O(N)
*/

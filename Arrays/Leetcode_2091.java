import java.util.*;

class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if (n == 1) return 1; // Special case: If there's only one element, we need one deletion.

        // Initial indexes for min and max elements.
        int minIndex = 0;
        int maxIndex = 0;

        // Finding the indexes of min and max elements.
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }

        // Ensure minIndex is less than maxIndex for convenience.
        if (minIndex > maxIndex) {
            int temp = minIndex;
            minIndex = maxIndex;
            maxIndex = temp;
        }

        // Case 1: Removing from the front.
        int fromFront = maxIndex + 1;

        // Case 2: Removing from the back.
        int fromBack = n - minIndex;

        // Case 3: Removing min from the front and max from the back.
        int both = (minIndex + 1) + (n - maxIndex);

        // Return the minimum of the three cases.
        return Math.min(fromFront, Math.min(fromBack, both));
    }
}
TC : O(N)
SC : None 

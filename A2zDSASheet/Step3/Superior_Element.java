/*
BRUTE FORCE : TC : O(N^2) using 2 for loops
OPTIMAL : TC : O(N)
*/
import java.util.*;
public class Solution {
    public static List< Integer > superiorElements(int []ar) {
        List<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i=ar.length-1; i>=0 ; i--)
        {
            if(ar[i] > max)
                ans.add(ar[i]);
            if(max < ar[i])
                max = ar[i];
        }
        Collections.sort(ans);
        return ans;
    }
}

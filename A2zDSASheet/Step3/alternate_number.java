public class Solution {
    public static int[] alternateNumbers(int []a) {
        // Write your code here.
        int ans[] = new int[a.length];
        int positive = 0;
        int negative = 1;
        for(int i=0 ; i<a.length ; i++)
        {
            if(a[i] <0)
            {
                ans[negative] = a[i];
                negative +=2;
            }
            else
            {
                ans[positive] = a[i];
                positive +=2;
            }
        }
        return ans;
    }
}

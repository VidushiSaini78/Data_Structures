/*
Brute Force -> using 2 loops  TC: O(n) SC:O(1)
Better Approach -> using Hashmap to store frequency of each occurence in the array TC : O(N) SC: O(N)
Best Appraoch -> Tc : O(N) SC : O(1)
*/
public class Solution {
    public static int majorityElement(int []ar) {
        // Write your code here
        int counter = 0;
        int previous = 0;
        for(int i=0 ; i<ar.length ; i++)
        {
            if(counter==0)
            {
                counter++;
                previous = ar[i];
            }
            else if(ar[i]==previous )
                counter++;
            else if(ar[i] != previous)
                counter--;
        }
        return previous;
    }
}

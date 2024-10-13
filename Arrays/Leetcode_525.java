package October_13;
// longest subarray having equal number of 1s and 0s
// https://www.geeksforgeeks.org/largest-subarray-with-equal-number-of-0s-and-1s/
import java.util.*;
public class Longest_Subarray_II {
    public static void main(String[] args) {
        int ar[] =  { 1, 0, 0, 1, 0, 1, 1 };
        System.out.println(brute_force(ar));
        System.out.println(optimal(ar));
    }
    static int brute_force(int ar[])
    {
        int start = 0 ; 
        int end = 0 ; 
        int max_len = 0;
        // We are replacing  0 with -1 if we get cumulative sum=0 then we have equal number of  0 and 1
        for (int i=0 ; i<ar.length;  i++)
        {
            int sum = (ar[i] == 0) ? -1 : 1;
            for(int j = i+1 ; j<ar.length; j++)
            { 
                if (ar[j] == 0) sum += -1;
                else sum +=1;
                // if there exist 0 sum subarray then further comparing it with maxLen 
                if(sum ==0 && max_len  < j-i +1)
                {
                    max_len = j-i+1;
                    start =i;
                }
            }
        }
        end =  (start +max_len-1);
        System.out.println("Start Index " + start);
        System.out.println("Ending Index " +end);
        return max_len;
    }
    static int optimal(int ar[])
    {
        HashMap<Integer , Integer> mapp = new HashMap<>();
        int maxLen = 0 ;
        int sum = 0 ;
        mapp.put(0 , -1);
        for(int i=0 ; i<ar.length; i++)
        {
            if(ar[i] == 0) sum += -1;
            else sum += 1;
            if(mapp.containsKey(sum))
            {
                int index = mapp.get(sum);
                if(maxLen < i - index+1) maxLen = i-index;
            }
            else mapp.put(sum , i);
        }
    return maxLen;
    }
}

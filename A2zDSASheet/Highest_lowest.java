/*
Problem statement
Given an array 'v' of 'n' numbers.
Your task is to find and return the highest and lowest frequency elements.
If there are multiple elements that have the highest frequency or lowest frequency, pick the smallest element.
Example:
Sample Input 1 :
6
1 2 3 1 1 4
Sample Output 1 :
1 2
*/
import java.util.*;
public class Solution {
    public static int[] getFrequencies(int []v) {
        // Write Your Code Here
        Map<Integer , Integer> mapp = new HashMap<>();
        for(int i=0 ; i<v.length ; i++)
        {
            if(mapp.containsKey(v[i]))
            {
                int previousFrequency = mapp.get(v[i]);
                previousFrequency++;
                mapp.put(v[i] , previousFrequency);
            }
            else
            {
                mapp.put(v[i] , 1);
            }
        }
        int minelement = 0;
        int maxelement = 0;
        int minFrequency =v.length;
        int maxFrequency =0;
        for(Map.Entry<Integer , Integer>entry:  mapp.entrySet())
        {
            int count = entry.getValue();
            int element = entry.getKey();
            if(count > maxFrequency)
            {
                maxFrequency= count;
                maxelement= element;
            }
            if(count <minFrequency)
            {
                
                minFrequency=count;
                minelement = element;
            }
            if(count==minFrequency && element<minelement)
            {
                minelement=element;
            }
            if(count==maxFrequency && element<maxelement)
            maxelement = element;
        }
        int ans[] = new int[2];
        ans[0] = maxelement;
        ans[1] = minelement;
    return ans;
    }
}

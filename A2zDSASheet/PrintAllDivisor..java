import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class Solution{
    public static List< Integer > printDivisors(int n) {
        // Write your code here
        List<Integer> list  = new ArrayList<>();
        for(int i=1 ; i<= (int)Math.sqrt(n) ; i++)
        {
            if(n%i==0)
            {
                list.add(i);
                if(n/i != i)
                list.add(n/i);
            }
        }
        Collections.sort(list);
        return list;
    }
}
TC : o(log(n))

/*
TBRUTE FORCE : using 2 loops. TC : O(N^2)
OPTIMAL : TC: O(N)
*/
import java.util.*;
public class practise
{
    public static void main(String[] args)
    {
        int ar[] = {7, 1, 5, 4, 3, 6};
        System.out.println(karcha(ar));
    }
    static int karcha(int ar[])
    {
        int miniElement = Integer.MAX_VALUE;
        int Maxprofit = 0;
        for(int i=0; i<ar.length ; i++)
        {
            miniElement = Math.min(miniElement , ar[i]);
            Maxprofit = Math.max(Maxprofit , ar[i] - miniElement);
        }
        return Maxprofit;
    }
}

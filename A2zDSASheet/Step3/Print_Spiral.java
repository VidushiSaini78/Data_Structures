/*
TC : O(N * M ) 
*/
import java.util.*;
public class practise
{
    public static void main(String[] args) {
        int ar[][] ={{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        printSpiral(ar);
    }
    static void printSpiral(int ar[][])
    {
        ArrayList<Integer> ans = new ArrayList<>();
        int Top = 0;
        int Bottom = ar.length-1;
        int Left = 0 ;
        int Right = ar[0].length-1;
        while(Top <=Bottom && Left<=Right)
        {
            for(int i=Left ; i<=Right ; i++)
            {
                ans.add(ar[Top][i]);
            }
            Top++;
            for(int i=Top ; i<=Bottom ; i++)
            {
                ans.add(ar[i][Right]);
            }
            Right--;
            if(Top<=Bottom)
            {
                for (int i = Right; i >= Left; i--)
                    ans.add(ar[Bottom][i]);

                Bottom--;
            }
            if(Left <= Right)
            {
                for(int i=Bottom ; i>=Top; i--)
                {
                    ans.add(ar[i][Left]);
                }
                Left++;
            }

        }
        display(ans);

    }
    static void display(ArrayList<Integer> ans)
    {
        for(int i=0 ; i<ans.size() ; i++)
        {
            System.out.print(ans.get(i) + " ");
        }
    }

}

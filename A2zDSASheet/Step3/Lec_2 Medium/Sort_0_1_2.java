/*
Given an array containing 0 , 1 and 2
Brute Force : - Sorting technique (NlogN)
Better Approach : Count no of 0 ,1 and 2 TC:- o(N) + o(N)
Optimized Appraoch :- TC : O(N)
*/
import java.util.Arrays;
import java.util.Scanner;
public class practise
{
    static  Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int size = input.nextInt();
        int ar[] = new int[size];
        input(ar);
        sort(ar);
    }
    static void input(int ar[] )
    {
        for(int i=0 ; i<ar.length ; i++)
        {
            ar[i] = input.nextInt();
        }
    }
    // TC : O(N) SC: O(1)
    static void sort(int ar[])
    {
        int Low = 0 ;
        int Mid = 0;
        int High = ar.length-1;
        while(Mid <= High)
        {
            int value =  ar[Mid];
            if(value==1)
                Mid++;
            else if(value ==0)
            {
                ar[Mid] = ar[Low];
                ar[Low]=value;
                Low++;
                Mid++;
            }
            else
            {
                ar[Mid] = ar[High];
                ar[High] = value;
                High--;

            }
        }
        
        System.out.println(Arrays.toString(ar));
    }
}

/*
BruteForce : Tc : O(N^3)
Better : Tc : O(N^2)
Optimized : Tc : O(N)
*/
import java.util.Scanner;
public class practise
{
    static  Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int ar[] = {-2,1,-3,4,-1,2,1,-5,4};
        bruteForce(ar);
        better(ar);
        optimized(ar);
    }
    static void bruteForce(int ar[])
    {

        int sum =0 ;
        int max = 0;
        for(int i=0 ; i<ar.length ; i++)
        {
            for(int j=0 ; j<ar.length ; j++)
            {
                sum = 0;
                for(int k=i ; k<=j ; k++)
                {
                    sum += ar[k];
                    max = Math.max(max , sum);
                }
            }
        }
        System.out.println(max);
    }
    static void better(int ar[])
    {
        int Max = Integer.MIN_VALUE;
        for(int i=0 ; i<ar.length ; i++)
        {
            int sum =0;
            for(int j = i ; j<ar.length ; j++)
            {
                sum += ar[j];
                Max = Math.max(sum , Max);
            }
        }
        System.out.println(Max);
    }
    static void optimized(int ar[])
    {
        int sum = 0;
        int MaxSum = Integer.MIN_VALUE;
        for(int i=0 ; i<ar.length ; i++)
        {
            sum += ar[i];
            if(sum <0)
                sum =0;
            MaxSum = Math.max(MaxSum , sum);
        }
        System.out.println(MaxSum);
    }

}

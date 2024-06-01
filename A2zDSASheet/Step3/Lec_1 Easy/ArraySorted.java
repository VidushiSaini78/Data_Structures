package Arrays;
/*
Problem statement
You have been given an array ‘a’ of ‘n’ non-negative integers.You have to check whether the given array is sorted in the non-decreasing order or not.
Your task is to return 1 if the given array is sorted. Else, return 0.
Example :
Input: ‘n’ = 5, ‘a’ = [1, 2, 3, 4, 5]
Output: 1
The given array is sorted in non-decreasing order; hence the answer will be 1.
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1 :
4
0 0 0 1
Sample Output 1 :

TC : O(n)
 */
import java.util.Scanner;

public class ArraySorted
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter no of element -> ");
        int num = input.nextInt();
        int ar[] = takeInput(num);
        System.out.println(check(ar));

    }
    static boolean check(int ar[])
    {
        for(int i=1 ; i<ar.length;i++)
        {
            if(ar[i-1] >ar[i])
                return false;
        }
        return true;
    }
    static int[] takeInput(int size)
    {
        int temp[] = new int[size];
        for(int i=0 ; i<size ; i++)
        {
            temp[i] = input.nextInt();
        }
        return temp;
    }

}

package Arrays;
/*
Take as input N, the size of array. Take N more inputs and store that in an array.
Take as input “target”, a number.
Write a function which prints all pairs of numbers which sum to target.
Sample Input
5
1
3
4
2
5
5
Sample Output
1 and 4
2 and 3
 */
import java.util.*;
public class Array_target_Sum_Pair
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter no of element -> ");
        int num = input.nextInt();
        int ar[] = takeInput(num);
        System.out.println("enter the target element -> ");
        int target = input.nextInt();
        findPair(ar, target);

    }
    //TC: O(N) SC:O(1)
    static void findPair(int ar[] , int target)
    {
        Arrays.sort(ar);
        int start = 0;
        int end = ar.length-1;
        while(start < end)
        {
            if(ar[start] + ar[end]==target)
            {
                System.out.println(ar[start] + " and "+ ar[end]);
                start++;
                end--;
            }
            else if(ar[start]+ ar[end]<target)
                start++;
            else
                end--;
        }
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

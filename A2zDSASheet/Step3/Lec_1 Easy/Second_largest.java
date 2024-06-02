package Arrays;
import java.util.Scanner;
/*
Problem statement(Question DSA sheet)
You have been given an array ‘a’ of ‘n’ unique non-negative integers.
Find the second largest and second smallest element from the array.
Return the two elements (second largest and second smallest) as another array of size 2.
Example :
Input: ‘n’ = 5, ‘a’ = [1, 2, 3, 4, 5]
Output: [4, 2]
The second largest element after 5 is 4, and the second smallest element after 1 is 2.
 */
public class Second_largest
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter no of element -> ");
        int num = input.nextInt();
        int ar[] = takeInput(num);
        System.out.println(getMax(ar));
    }

    static int getMax(int ar[])
    {
        int firstMax = ar[0];
        int secondMax = -1;
        for(int i =1 ; i<ar.length;i++)
        {
            if(ar[i]>firstMax)
            {
                secondMax= firstMax;
                firstMax = ar[i];
            }
            else if(ar[i]>secondMax && ar[i]<firstMax)
                secondMax = ar[i];
        }
        return secondMax;
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

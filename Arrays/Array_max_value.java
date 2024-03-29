package Arrays;
/*
Take an input N, the size of array. Take N more inputs and store that in an array. Write a function which returns the maximum value in the array. Print the value returned.
1.It reads a number N.
2.Take Another N numbers as input and store them in an Array.
3.calculate the max value in the array and return that value.
 */
import java.util.Scanner;
public class Array_max_value
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter no of element -> ");
        int num = input.nextInt();
        int ar[] = takeInput(num);
        System.out.println(getMax(ar));

    }
    static int getMax(int ar[])
    {
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<ar.length; i++)
        {
            if(ar[i]>max)
                max = ar[i];
        }
        return max;
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

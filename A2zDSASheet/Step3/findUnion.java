package Arrays;
/*
Problem Statement: Given two sorted arrays, arr1, and arr2 of size n and m.
Find the union of two sorted arrays.

The union of two arrays can be defined as the common and distinct elements in the two arrays.
NOTE: Elements in the union should be in ascending order.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class findUnion
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter size of array 1 -> ");
        int num = input.nextInt();
        System.out.println("Enter Element -> ");
        int ar[] = takeInput(num);
        System.out.println("Enter size of array 2 -> ");
        int num1 = input.nextInt();
        System.out.println("Enter Element -> ");
        int ar1[] = takeInput(num1);
        merge(ar, ar1);
    }
    static void merge(int array1[] , int array2[])
    {
        //Two pointer approach
        int index1 = 0;
        int index2 = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(index1<array1.length && index2<array2.length)
        {
            if(array1[index1]==array2[index2])
            {
                if(ans.size()==0 || ans.get(ans.size()-1) != array1[index1])
                    ans.add(array1[index1]);
                index2++;
                index1++;
            }
            else if(array1[index1] < array2[index2])
            {
                if(ans.size()==0 || ans.get(ans.size()-1) != array1[index1])
                    ans.add(array1[index1]);
                index1++;
            }
            else
            {
                if(ans.size()==0 || ans.get(ans.size()-1) != array2[index2])
                    ans.add(array2[index2]);
                index2++;
            }
        }
        while(index1<array1.length)
        {
            if(ans.size()==0 || ans.get(ans.size()-1) != array1[index1])
                ans.add(array1[index1]);
            index1++;
        }
        while(index2<array2.length)
        {
            if(ans.size()==0 || ans.get(ans.size()-1) != array2[index2])
                ans.add(array2[index2]);
            index2++;
        }
        for(int i=0 ; i<ans.size() ; i++)
        {
            System.out.print(ans.get(i) + " ");
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

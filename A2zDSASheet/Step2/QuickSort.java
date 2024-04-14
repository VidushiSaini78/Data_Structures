import java.util.*;
public class Solution {
    static Scanner input= new Scanner(System.in);
    public static void main(String[] args) {
        int no_of_input = input.nextInt();
        int ar[] = taking_input(no_of_input);
        quickSort(ar ,0 , ar.length-1);
        display(ar);
    }
    static int[] taking_input(int n)
    {
        int ar[] = new int[n];
        for(int i=0 ; i<n ; i++)
        {
            ar[i] = input.nextInt();
        }
        return ar;
    }
    static void display(int ar[])
    {
        for(int i=0 ; i<ar.length ; i++)
        {
            System.out.print(ar[i] + " ");
        }
    }
    static void quickSort(int ar[] , int low , int high)
    {
        if(low  < high)
        {
            int partitionIndex = part(ar , low , high);
            quickSort(ar , low , partitionIndex-1);
            quickSort(ar , partitionIndex+1 , high);
        }
    }
    static int part(int ar[] , int low , int high)
    {
        int i = low ;
        int j = high;
        while(i<j)
        {
            while(ar[i]<=ar[low] && i<=high-1)
            {
                i++;
            }
            while(ar[j] > ar[low])
            {
                j--;
            }
            if(i<j) swap(ar , i , j);
        }
        swap(ar , j, low);
        return j;
    }
    static void swap(int ar[] , int i , int j)
    {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
}

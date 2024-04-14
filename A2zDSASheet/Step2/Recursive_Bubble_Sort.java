import java.util.*;
public class Solution{
    static Scanner input= new Scanner(System.in);
    public static void main(String[] args) {
        int no_of_input = input.nextInt();
        int ar[] = taking_input(no_of_input);
        bubbleSort(ar , no_of_input-1);
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
    static void bubbleSort(int ar[],int end)
    {
        if(end==0)
            return;
        for(int i=0 ; i<end ; i++)
        {
            if(ar[i] > ar[i+1])
                swap(ar , i , i+1);
        }
        bubbleSort(ar , end-1);

    }
    static void swap(int ar[] , int i , int j)
    {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
}

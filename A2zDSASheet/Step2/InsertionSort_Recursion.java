import java.util.*;
public class practise {
    static Scanner input= new Scanner(System.in);
    public static void main(String[] args) {
        int no_of_input = input.nextInt();
        int ar[] = taking_input(no_of_input);
        insertion_sort(ar ,  0  , ar.length);
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
    static void insertion_sort(int arr[] , int i , int n)
    {
        if (i == n) return;

        int j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }

        insertion_sort(arr, i + 1, n);
    }
    static void swap(int ar[] , int i , int j)
    {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
}

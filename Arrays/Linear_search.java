package Arrays;

import java.util.Scanner;

public class Linear_search
{
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter no of element -> ");
        int num = input.nextInt();
        int ar[] = takeInput(num);
        System.out.println("enter the target element -> ");
        int target = input.nextInt();
        System.out.println(search(ar , target)+1);
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
    static int search(int ar[] ,  int target)
    {
        for(int i=0 ; i<ar.length ; i++)
        {
            if(ar[i]==target) return i;
        }
        return -1;
    }
}

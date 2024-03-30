package Arrays;
import java.util.*;
/*
You are given an array of integers, your task is to move all the zeros in the array to the end of the array and
 move non-negative integers to the front by maintaining their order.
 */
public class movaAllZeros
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter no of element -> ");
        int num = input.nextInt();
        System.out.println("Enter Element -> ");
        int ar[] = takeInput(num);
        ar = move(ar);
        display(ar);
    }
    static void display(int ar[])
    {
        for(int i=0 ; i<ar.length; i++)
        {
            System.out.print(ar[i] + " ");
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
    static int[] move(int ar[])
    {
        int i= -1;
        for(int k =0 ; k<ar.length;k++)
        {
            if(ar[k]==0)
            {
                i=k;
                break;
            }
        }
        if(i==-1) return ar;
        for(int j=i+1; j<ar.length;j++)
        {
            if(ar[j] !=0)
            {
                int temp = ar[i];
                ar[i]= ar[j];
                ar[j] = temp;
                i++;
            }
        }
        return ar;
    }
}

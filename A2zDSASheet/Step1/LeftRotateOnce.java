package Arrays;
import java.util.*;
public class LeftRotateOnce
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter no of element -> ");
        int num = input.nextInt();
        int ar[] = takeInput(num);
        rotateonce(ar);
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
    static void rotateonce(int ar[])
    {
        int first_element = ar[0];
        for(int i=1; i<ar.length;i++)
        {
            ar[i-1] = ar[i];
        }
        ar[ar.length-1]=first_element;
        display(ar);
    }
    static void display(int ar[])
    {
        for(int i=0 ; i<ar.length; i++)
        {
            System.out.print(ar[i] + " ");
        }
    }

}

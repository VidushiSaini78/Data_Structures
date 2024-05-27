package Arrays;
/*
Left rotation for arr[]=[1,2,3,4,5]
1 rotation -> [2,3,4,5,1]
2 rotation -> [3,4,5,1,2]
3 rotation -> [4,5,1,2,3]
4 rotation -> [5,1,2,3,4]
5 rotation -> [1,2,3,4,5]
Right Rotation
1 rotation -> [5,1,2,3,4]
2 rotation -> [4.5,1,2,3]
3 rotation -> [3,4,5,1,2]
4 rotation -> [2,3,4,5,1]
5 rotation -> [1,2,3,4,5]
 */
import java.util.Scanner;

public class KtimesRotate
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter no of element -> ");
        int num = input.nextInt();
        System.out.println("Enter Element -> ");
        int ar[] = takeInput(num);
        System.out.println("Enter how many rotation you want -> ");
        int rotations = input.nextInt();
        System.out.println("Enter 1 for left rotation and 0 for right");
        int select = input.nextInt();
        if(rotations>ar.length)
        {
            rotations = Math.abs(rotations/ar.length) ;
        }
        ar = rotate(ar , rotations,select);
        display(ar);
    }
    // taking input
    static int[] takeInput(int size)
    {
        int temp[] = new int[size];
        for(int i=0 ; i<size ; i++)
        {
            temp[i] = input.nextInt();
        }
        return temp;
    }
    // Optimized Method TC : O(N) SC: O(1)
    static int[] rotate(int ar[] , int k , int value )
    {
        if(value==1)
        {
            System.out.println("Left Rotation -> ");
            ar = reverse(0,k-1,ar);
            ar = reverse(k,ar.length-1,ar);
            ar = reverse(0,ar.length-1,ar);
        }
        else
        {
            System.out.println("Right Rotation -> ");
            ar = reverse(ar.length-k , ar.length-1,ar);
            ar = reverse(0,ar.length-1-k,ar);
            ar = reverse(0,ar.length-1,ar);
        }
        return ar;
    }
    // Reverse the array 
    static int[] reverse(int start , int end, int ar[])
    {
        while(start <end)
        {
            int temp = ar[start];
            ar[start] = ar[end];
            ar[end] = temp;
            start++;
            end--;
        }
        return ar;
    }
    // Display Function 
    static void display(int ar[])
    {
        for(int i=0 ; i<ar.length; i++)
        {
            System.out.print(ar[i] + " ");
        }
    }
    // BRUTE FORCE : TC : O(N) SC: O(M)
    static void rotate(int ar[] , int k)
    {
        int temp[] = new int[k];
        for(int i=0 ; i<k ; i++)
        {
            temp[i] = ar[i];
        }
        int index= -1;
        for(int i=k ; i<ar.length ; i++)
        {
            ar[++index] = ar[i];
        }
        index=-1;
        for(int i= ar.length-k ; i<ar.length;i++)
        {
            ar[i] = temp[++index];
        }
        display(ar);
    }

}

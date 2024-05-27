// Problem Statement: Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array.
import java.util.Scanner;
public class maximum_consecutive
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter the size of array ->  ");
        int size = input.nextInt();
        int ar[] = takeInput(size);
        System.out.println(maximum(ar));
    }
    static int[] takeInput(int size)
    {
        int temp[] = new int[size];
        for(int i=0;i<size;i++)
        {
            temp[i] = input.nextInt();
        }
        return temp;
    }
    //TC : O(n)
    static int maximum(int ar[])
    {
        int count = 0;
        int ans= 0;
        for(int i=0 ; i<ar.length;i++)
        {
            count = ar[i]==1 ? ++count : 0;
            ans = (int)Math.max(ans, count);
        }
        return ans;
    }

}

package Arrays;
/*
ar[] = {1,2,3,-3,1,1,1,4,2,-3}
count =8
 */
import java.util.*;
public class countNoOfSubarrayWithSumK
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the size of array ->");
        int size = sc.nextInt();
        System.out.println("Enter Element of array -> ");
        int ar[] = takeInput(size);
        System.out.println("Enter sum -> ");
        int sum = sc.nextInt();
        System.out.println("Output -> ");
        System.out.println(countSubarray(ar, sum));
    }
    static int[] takeInput(int size)
    {
        int temp[] = new int[size];
        for(int i=0;i<size;i++)
        {
            temp[i] = sc.nextInt();
        }
        return temp;
    }
    //Brute Force Method :- tc = O(n)
    static int countSubarray(int ar[], int K)
    {
        int count=0;
        for(int i=0;i<ar.length;i++)
        {
            int sum=0;
            for(int j=i; j<ar.length;j++)
            {
                sum += ar[j];
                if(sum==K)
                {
                    count++;
                }
            }
        }
        return count;
    }
    //TC : O(n)
    static int prefixSumSolution(int ar[] , int k)
    {
        int count =0;
        int prefix_sum=0;
        HashMap<Integer, Integer> mapp = new HashMap<>();
        mapp.put(prefix_sum,1);
        for(int i=0;i<ar.length;i++)
        {
            prefix_sum+= ar[i];
            int remove = k-prefix_sum;
            if(mapp.containsKey(remove)) count+= mapp.get(remove);
            mapp.put(prefix_sum, 1);

        }
        return count;
    }
}

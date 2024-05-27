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
    //TAKING INPUT
    static int[] takeInput(int size)
    {
        int temp[] = new int[size];
        for(int i=0 ; i<size ; i++)
        {
            temp[i] = input.nextInt();
        }
        return temp;
    }

    // SOLTUION 1 TC : O(N) SC: O(N+M)
    static ArrayList<Integer> merge(int array1[] , int array2[])
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
        return ans;
    }
    // Solution 2 TC: O(N+M)LOG(N+M) SC: O(N+M)
    static ArrayList<Integer> union(int ar[] , int ar1[])
    {
        HashMap<Integer , Integer> mapp = new HashMap<>();
        for(int i=0 ; i<ar.length ; i++)
        {
            mapp.put(ar[i] , mapp.getOrDefault(ar[i], 0) +1);
        }
        for(int j=0 ; j<ar1.length ; j++)
        {
            mapp.put(ar1[j] , mapp.getOrDefault(ar1[j] , 0) +1);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(Integer ele : mapp.keySet())
        {
            ans.add(ele);
        }
        return ans;
    }
    // SOLTUON 3 TC : O(N+M) SC = O(N+M)
    static ArrayList<Integer> union1(int ar[] , int ar1[])
    {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0 ; i<ar.length ; i++)
        {
            set.add(ar[i]);
        }
        for(int i=0 ; i<ar1.length ; i++)
        {
            set.add(ar1[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(Integer ele : set)
        {
            ans.add(ele);
        }
        return ans;
    }
}

package Arrays;
/*
Problem Statement: Given a non-empty array of integers arr, every element appears twice except for one. Find that single one.
BRUTE FORCE METHOD
Doing linear search. Tc: o(N^2)
for(i=0-> ar.length)
{
    count=0;
    for(int j=1 -> ar.length)
    {
        if(ar[i]==ar[j]) count++;
    }
    if(count==1) return;
}
BETTER APPROACH :-
can use hashmap to store frequency of number.
HashMap<Integer , Integer> mapp = new HashMap<>();
TC : O(n)
Space Complexity : size of hashmap

OPTIMAL APPROACH :-
TC = O(N)
Space Complexity : O(1)

 */
import java.util.Scanner;
public class NumAppearOnce
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the size of array ->  ");
        int size = input.nextInt();
        System.out.println("Enter Element of array -> ");
        int ar[] = takeInput(size);
        count(ar);
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
    static void count(int ar[])
    {
            int xor= 0;
            for(int i=0 ; i<ar.length;i++)
            {
                xor = xor^ar[i];
            }
        System.out.println(xor);
    }
}

package Arrays;
/*
BRUTE FORCE METHOD-> Using linear search. TC : O(n^2)
for(int i=1 ;i<=n ; i++) {
    boolean flag = true;
    for(int j=0;j<ar.length;j++){
        if(ar[j]==i)
        {
            flag = false;
            break;
        }
    }
    if(!flag) return i;
}
BETTER APPROACH METHOD -> using hashing Tc : O(n)+O(n)
int n = 5; (means range of 1 to n)
int ar[]={1,2,4,5};
int hash[] = new int[n+1];
for(int i=0;i<ar.length;i++) { hash[ar[i]]++; }
for(int i=1;i<hash.length;i++) { if(hash[i]==0) return i; }
return -1;

OPTIMAL APPROACH METHOD 1 TC : o(n)
Summation formula 1 to N : sum = (N*(N+1))/2
Array element = sum1;
Missing element = sum-sum1;

OPTIMAL APPROACH METHOD 2 TC : O(N)
 */
import java.util.*;
public class findMissingNum
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter the range 1 to n" );
        int n = input.nextInt();
        System.out.println("Enter the size of the array");
        int size = input.nextInt();
        System.out.println("Enter element : ");
        int ar[] = takeInput(size);
        System.out.println(optimal1(ar,n));
        System.out.println(missingNumber(ar, n));


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
    static int optimal1(int ar[], int n)
    {
        int sum1 = (n*(n+1))/2;

        int sum2=0;
        for(int i=0;i<ar.length;i++)
        {
            sum2+=ar[i];
        }
        return sum1-sum2;
    }
    public static int missingNumber(int []a, int N) {

        int xor1 =0;
        int xor2 =0;
        for (int i = 0; i < N - 1; i++) {
            xor2 = xor2 ^ a[i]; // XOR of array elements
            xor1 = xor1 ^ (i + 1); //XOR up to [1...N-1]
        }
        xor1 = xor1 ^ N; //XOR up to [1...N]

        return (xor1 ^ xor2);
    }
}

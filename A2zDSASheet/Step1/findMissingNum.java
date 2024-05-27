import java.util.*;
public class findMissingNum
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        int array[] = {1,2,4,5};
        int n = 5;
        System.out.println(method1(array,n));
        System.out.println(method2(array,n));
        System.out.println(method3(array,n));
        System.out.println(method4(array,n));
    }
    // linear search tc = O(N^2) 
    static int method1(int ar[] , int n)
    {
        for(int i=1 ; i<=n ; i++)
        {
            boolean check = false;
            for(int j=0 ; j<ar.length ; j++)
            {
                if(ar[j] == i) check = true;
            }
            if(!check)
            return i;
        }
    return -1;
    }
    // BETTER TC= O(N+N) SC= O(N)
    static int method2(int ar[] , int n )
    {
        int hash[] = new int[n+1];
        for(int i=0 ; i<ar.length ; i++)
        {
            hash[ar[i]]++;
        }
        for(int i=0 ; i<hash.length ; i++)
        {
            if(hash[i] ==0) return i;
        }
        return -1;   
    }
    // OPTIMIZE 1 TC = O(N) SC= O(1)
    static int method3(int ar[] , int n )
    {
        int required_Sum = (n*(n+1))/2;
        int sum =0;
        for(int i =0 ; i<ar.length ; i++)
        {
            sum += ar[i];
        }
        return required_Sum-sum;
    }
    // OPTIMIZE 2 TC = O(N) SC = O(1)
    static int method4(int ar[] ,  int n)
    {
        int XOR_1 = 0;
        int XOR_2 = 0;
        for(int i=0 ; i<ar.length ; i++)
        {
            XOR_1 = XOR_1 ^ ar[i];
            XOR_2 = XOR_2 ^ (i+1);
        }
        XOR_2= XOR_2 ^ N;
        return XOR_1 ^ XOR_2; 
        
    }
    
    
    
    
}

import java.util.*;
public class practise
{
    public static void main(String[] args) {
        int ar[] = {1,1,5};
        ar = nextPermutation(ar);
        System.out.println(Arrays.toString(ar));
    }

    static int[] nextPermutation(int ar[])
    {
        int partitionIndex= -1;
        for(int i =ar.length-1; i>0 ; i--)
        {
            if(ar[i-1] <ar[i])
            {
                partitionIndex = i-1;
                break;
            }
        }

        if(partitionIndex==-1)
        {
            reverse(ar);
            return ar;
        }
        int next_min =-1;
        for(int i=ar.length-1 ; i>partitionIndex ; i--)
        {
            if(ar[i] > ar[partitionIndex])
            {
                int temp = ar[i];
                ar[i] = ar[partitionIndex];
                ar[partitionIndex] = temp;
                break;
            }
        }
        Arrays.sort(ar , partitionIndex+1 , ar.length);
        return ar;
    }
    static void reverse(int ar[])
    {
        int i=0 ;
        int  j =ar.length-1;
        while(i<j)
        {
            int temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
            i++;
            j--;
        }
    }
}

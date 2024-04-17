import java.util.*;
public class practise
{
    public static void main(String[] args) {
        int ar[] = {2,1,5,4,3,0,0};
        ar = nextPermutation(ar);
        display(ar);
    }
    static void display (int ar[])
    {
        for(int i=0 ; i<ar.length ; i++)
        {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }
    static int[] nextPermutation(int ar[])
    {
        int partitionIndex= -1;
        for(int i =0 ; i<ar.length-1 ; i++)
        {
            if(ar[i] <ar[i+1])
            {
                partitionIndex = i;
                break;
            }
        }
        if(partitionIndex==-1)
        {
            Collections.reverse(Arrays.asList(ar));
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

}

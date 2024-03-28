/*
Given a series of N Integers, check if it is possible to split sequence into two sequences -
s1 to si and si to sN such that first sequence is strictly decreasing and second is strictly increasing.
Print true/false as output.
Sample Input
5
1
2
3
4
5
Sample Output
true
 */
import java.util.*;
public class Increasing_decreasing
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("No of Inputs -> ");
        int n = sc.nextInt();
        int ar[] = createArray(n);
        System.out.println(sequenceExist(ar));

    }
    static int[] createArray(int size)
    {
        int temp[] = new int[size];
        for(int i=0 ;i<size;i++)
        {
            temp[i] = sc.nextInt();
        }
        return temp;
    }
    static boolean sequenceExist(int ar[])
    {
        boolean ans= true;
        //finding point where increasing sequence starts
        if(ar.length<2)
            return ans;
        else
        {
            int index=1;
            int pre= 0;
            while(index<ar.length)
            {
                if(ar[index]>=ar[pre])
                {
                    break;
                }
                pre = index;
                index++;
            }
            pre= index;
            index ++;
            System.out.println(pre);
            while(index<ar.length)
            {
                if(ar[index]<=ar[pre])
                {
                    ans= false;
                    break;
                }
                index++;
            }


        }
        return ans;
    }
}

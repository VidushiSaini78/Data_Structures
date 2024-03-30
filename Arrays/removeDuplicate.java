package Arrays;
import java.util.*;
public class removeDuplicate
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter no of element -> ");
        int num = input.nextInt();
        int ar[] = takeInput(num);
        //Brute Force Method
        ArrayList<Integer> list = bruteforce(ar);
        System.out.println("Brute Force -> ");
        for(int i=0 ; i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println("\nOptimal Approach -> ");
        //Optimal Approach
        int length = optimal(ar);
        for(int i=0;i<=length;i++)
        {
            System.out.print(ar[i] + " ");
        }
    }
    static int[] takeInput(int size)
    {
        int temp[] = new int[size];
        for(int i=0 ; i<size ; i++)
        {
            temp[i] = input.nextInt();
        }
        return temp;
    }
    static ArrayList<Integer> bruteforce(int ar[])
    {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<ar.length;i++)
        {
            set.add(ar[i]);
        }
        Iterator<Integer> pointer = set.iterator();
        while(pointer.hasNext())
        {
            list.add(pointer.next());
        }
        return list;
    }
    static int optimal(int ar[])
    {
        int i = 0 ;
        int j = i+1;
        while(j<ar.length)
        {
            if(ar[i]!=ar[j])
            {
                int temp = ar[i+1];
                ar[i+1] = ar[j];
                ar[j] = temp;
                i++;
                j++;
            }
            else j++;

        }
        return i;
    }
}

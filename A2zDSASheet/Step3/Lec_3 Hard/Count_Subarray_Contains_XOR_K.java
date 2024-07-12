import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class practise
{
    public static void main(String[] args) {
        int ar[] = {4,2,2,6,4};
        optimal(ar , 6);
    }
    static void optimal(int ar[] , int N)
    {
        // < XOR , Count>
        HashMap<Integer , Integer> poppy = new HashMap<>();
        int xor =0 ;
        int count = 0;
        poppy.put(xor , 1);
        for(int i=0 ;i<ar.length;i++)
        {
            xor = xor ^ ar[i];
            int x = xor^N;
            if(!poppy.isEmpty() && poppy.containsKey(x))
            {
                count += poppy.get(x);
            }
            int value =  poppy.getOrDefault(xor, 0) + 1;
            poppy.put(xor, value);
        }
        System.out.println(count);
    }
    // TC: O(N^2) SC: O(1)
    static void better(int ar[] , int N)
    {
        List<List<Integer>> ans = new ArrayList<>();
        // Generate all subarrays and check xor of all the subarrays 
        for(int i=0;i<ar.length ; i++)
        {
            int Xor = 0 ;
            for(int j=i;j<ar.length;j++)
            {
                Xor = Xor ^ ar[j];
                if(Xor == N)
                    // Storing the starting and ending index of the subarray in the ans list
                    ans.add(Arrays.asList(i , j));
            }
        }
        display(ans , ar);
    }

    // TC : O(n^3) SC: o(1)
    static void brute_force(int ar[] , int N)
    {
        List<List<Integer>> ans = new ArrayList<>();
        // Generate all subarrays and check xor of all the subarrays 
        for(int i=0;i<ar.length ; i++)
        {
            for(int j=i;j<ar.length;j++)
            {
                int Xor = 0 ;
                for(int k =i ; k<= j ; k++)
                {
                    Xor = Xor ^ ar[k];
                }
                if(Xor == N)
                    // Storing the starting and ending index of the subarray in the ans list
                    ans.add(Arrays.asList(i , j));
            }
        }
        display(ans , ar);

    }
    static void display(List<List<Integer>> ans , int ar[])
    {
        System.out.println("Subarrays");
        for(int i=0;i<ans.size() ; i++)
        {
            System.out.print("{ ");
            for(int start= ans.get(i).get(0) ; start<= ans.get(i).get(1) ; start++ )
            {
                System.out.print(ar[start] + " ");
            }
            System.out.println("}");
        }
    }
}

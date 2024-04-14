import java.util.Scanner;
/* TC : o(n)
Alternate Method : sort the array and then print the last element in the array
TC : nlogn (for sorting)
*/

public class practise
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ar[] = {23,13,41,67,81};
        System.out.println(greatest(ar));
    }
    static int greatest(int ar[])
    {
        int max = ar[0];
        for(int i=0; i <ar.length ; i++)
        {
            if(ar[i] > max)
                max = ar[i];
        }
        return max;
    }
}

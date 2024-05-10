import java.util.Scanner;

public class Pascal_Triangle
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no of rows in pascal tree ");
        int no = input.nextInt();
        printTree(no);
        printParticular(5);
        printParticular1(4);
    }
    static void printTree(int n)
    {
        for(int r=1 ; r<=n ; r++)
        {
            int countSpace = n-r;
            while(countSpace>0)
            {
                System.out.print(" ");
                countSpace--;
            }
            long res = 1;
            System.out.print(res + " ");
            for(int col=1 ; col<r ; col++)
            {
                res = res * (r-col);
                res = res/ (col);
                System.out.print(res+ " ");
            }
            System.out.println();
        }
    }
   //Print the particular row of the pascal triangle when the row number is given  
   static void printParticular(int row)
   {
       System.out.print(1+ " ");
       int res = 1;
       for(int i=1 ; i<row ; i++)
       {
           res = res*(row-i);
           res = res / i;
           System.out.print(res + " ");
       }
   }
   // Print the particular row of pascal triangle when row index is given
    static void printParticular1(int row)
    {
        int res = 1;
        System.out.print(res+ " ");
        for(int i=1 ; i<=row; i++)
        {
            res = res*(row-i+1);
            res = res / i;
            System.out.print(res+ " ");
        }
    }
}

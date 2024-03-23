import java.util.Scanner;

public class Q7
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        pattern(input);
    }
    static void pattern(int input)
    {
        int row = 1;
        while(row <= input)
        {
            int countStar = input;
            while(countStar>0)
            {
                if(countStar==1 || countStar== input || row==1 || row==input)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
                countStar--;
            }
            row++;
            System.out.println();
        }
    }
}

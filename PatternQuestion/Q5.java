import java.util.Scanner;

public class Q5
{
    static void pattern(int input)
    {
        int row = 0 ;
        while(row< input)
        {
            int countSpace = row;
            while(countSpace>0)
            {
                System.out.print("\t");
                countSpace--;
            }
            int countStar = input-row;
            while(countStar>0)
            {
                System.out.print("*\t");
                countStar--;
            }

            row++;
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        pattern(input);

    }
}

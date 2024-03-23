import java.util.Scanner;

public class Q4
{
    static void pattern(int input)
    {
        int row = 1 ;
        while(row <= input)
        {
            int countSpace = input - row;
            while(countSpace>0)
            {
                System.out.print("\t");
                countSpace--;
            }
            int countStar= row;
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

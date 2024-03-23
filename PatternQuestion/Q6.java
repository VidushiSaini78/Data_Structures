import java.util.Scanner;

public class Q6
{
    static void pattern(int input)
    {
        int space = 0;
        int row =input;
        int Space =0;
        while(row >0)
        {
            int countSpace = space;
            while(countSpace>0)
            {
                System.out.print("\t");
                countSpace--;
            }

            int countStar = row;
            while(countStar>0)
            {
                System.out.print("*\t");
                countStar--;
            }

            space +=2;
            row--;
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

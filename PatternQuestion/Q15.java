import java.util.Scanner;

public class Q15
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        pattern(input);
    }
    static void pattern(int input)
    {
        int row = 1;
        int space = 0;
        int star = input;
        while(row <= input*2 -1)
        {
            int countSpace = space;
            while(countSpace>0)
            {
                System.out.print("\t");
                countSpace--;
            }
            int countStar = star;
            while(countStar >0)
            {
                System.out.print("*\t");
                countStar--;
            }

            if(row < input)
            {
                space += 2;
                star--;
            }
            else
            {
                space -= 2;
                star++;
            }
            row++;
            System.out.println();
        }
    }
}

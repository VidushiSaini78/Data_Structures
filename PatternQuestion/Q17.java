import java.util.Scanner;

public class Q17
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
        int star = input/2;
        int space = 1;

        while(row <= input)
        {
            int countStar = star;
            while(countStar >0)
            {
                System.out.print("*\t");
                countStar--;
            }
            int countSpace = space;
            while(countSpace>0)
            {
                System.out.print("\t");
                countSpace--;
            }
            countStar = star;
            while(countStar >0)
            {
                System.out.print("*\t");
                countStar--;
            }
            if(row <= input/2)
            {
                star--;
                space +=2;
            }
            else
            {
                star++;
                space -=2;
            }
            row++;
            System.out.println();
        }
    }
}

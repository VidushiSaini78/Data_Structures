import java.util.Scanner;

public class Q21
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
        int star= 1;
        int space = input*2 -3;
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
            if(space==-1)
            {
                System.out.print("*\t");
            }
            countStar = star;
            while(countStar >0)
            {
                System.out.print("*\t");
                countStar--;
            }
            space-=2;
            if(row < input-1)
            {
                star++;
            }
            row++;
            System.out.println();

        }

    }
}

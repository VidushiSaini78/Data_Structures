import java.util.Scanner;

public class Q19
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        pattern(input);
    }
    static void pattern(int n)
    {
        int row =1;
        int star = n/2;
        int space = 0;
        while(row <= n)
        {
            int countStar = star;
            while (countStar > 0) {
                System.out.print("*\t");
                countStar--;
            }
            int countSpace = space;
            while (countSpace > 0) {
                System.out.print("\t");
                countSpace--;
            }
            if(row==1 || row==n)
                System.out.print("*\t");
            countStar = star;
            while (countStar > 0) {
                System.out.print("*\t");
                countStar--;
            }

            if(row==1)
            {
                space++;
            }
            else if(row <= n/2)
            {
                space +=2;
                star--;
            }
            else
            {
                space-=2;
                star++;
            }
            row++;
            if(row==n)
            {
                star--;
            }
            System.out.println();
        }
    }
}
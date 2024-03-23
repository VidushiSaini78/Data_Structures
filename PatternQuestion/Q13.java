import java.util.Scanner;

public class Q13
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
        int star = 1;
        while(row <= input*2-1) {

            int countStar = star;
            while (countStar > 0) {
                System.out.print("*\t");
                countStar--;
            }
            if (row < input)
                star++;
            else
                star--;
            row++;
            System.out.println();
        }
    }
}

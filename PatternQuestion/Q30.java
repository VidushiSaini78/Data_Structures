import java.util.Scanner;

public class Q30
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
            int countStar = 1;
            int print = 5;
            while(countStar<= input)
            {
                System.out.print(print+"\t");
                print--;
                countStar++;
            }
            row++;
            System.out.println();
        }
    }
}

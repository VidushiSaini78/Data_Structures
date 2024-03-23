import java.util.Scanner;

public class Q31
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        pattern(input);
    }
    static void pattern(int input)
    {

        int row = 1;
        int check = input;
        while(row <= input)
        {
            int countStar = 1;
            int print = input;
            while(countStar<=input)
            {
                if(countStar == check)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print(print +"\t");
                }
                print--;
                countStar++;

            }
            check--;
            row++;
            System.out.println();
        }
    }
}

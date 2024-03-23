import java.util.Scanner;

public class Q26
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
        int star =1;
        while(row <= input) {
            int space = input - row;
            while (space > 0) {
                System.out.print("\t");
                space--;
            }
            int count = 1;
            int countStar = star;
            while (countStar > 0) {
                System.out.print(count + "\t");
                countStar--;
                count++;
            }
            star += 2;
            row++;
            System.out.println();
        }

    }
}

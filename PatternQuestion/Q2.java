import java.util.*;
public class Q2
{
    static void pattern(int input)
    {
        int row = 0 ;
        while(row < input)
        {
            int column =0;
            while(column <= row)
            {
                System.out.print("*\t");
                column++;
            }
            System.out.println();
            row++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        pattern(input);
    }
}

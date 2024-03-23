import java.util.*;
public class Q3
{
    static void pattern(int input)
    {
        int row =input ;
        while(row >0)
        {
            int column =0;
            while(column < row)
            {
                System.out.print("*\t");
                column++;
            }
            row--;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        pattern(input);
    }
}

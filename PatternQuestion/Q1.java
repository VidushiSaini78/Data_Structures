import java.util.*;
public class Q1
{
    static void pattern(int input)
    {
        int row = 0 ; 
        while(row < input)
        {
            int column =0;
            while(column < input)
            {
                System.out.print("*\t");
                column++;
            }
            row++;
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        pattern(input);
    }
}
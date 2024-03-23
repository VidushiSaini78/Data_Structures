import java.util.Scanner;

public class Q10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        pattern(input);
    }
    static void pattern(int input)
    {
        int row = input;
        int space = 0;
        while(row >0)
        {
            int countSpace = space;
            while(countSpace>0)
            {
                System.out.print("\t");
                countSpace--;
            }
            int star = row*2-1;
            while(star >0)
            {
                System.out.print("*\t");
                star--;
            }
            space++;
            row--;
            System.out.println();
        }
    }
}

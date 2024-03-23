import java.util.Scanner;

public class Q20
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        pattern(input);
    }
    static void pattern(int input)
    {
        int row =1;
        int star = 1;
        int space = input/2 ;
        while(row <= input)
        {
            int countSpace = space;
            while(countSpace>0)
            {
                System.out.print("\t");
                countSpace--;
            }
            int countStar = star;
            while(countStar >0)
            {
                if(countStar==1 || countStar==star)
                System.out.print("*\t");
                else
                    System.out.print("\t");
                countStar--;
            }
            if(row<=input/2)
            {
                space--;
                star+=2;
            }
            else
            {
                space++;
                star -=2;
            }
            row++;
            System.out.println();
        }
    }
}

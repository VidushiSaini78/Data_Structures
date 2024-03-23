import java.util.Scanner;

public class Q12
{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    pattern(input);
}
    static void pattern(int input)
    {
        int row = 1 ;
        int space = input-1;
        int star = 1;
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
                if(countStar%2 ==0)
                    System.out.print("!\t");
                else
                    System.out.print("*\t");
                countStar--;
            }
            star +=2;
            space--;
            row++;
            System.out.println();
        }
    }
}

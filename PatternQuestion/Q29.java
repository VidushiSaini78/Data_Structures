import java.util.Scanner;

public class Q29
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        pattern(input);
    }
    static void pattern(int input)
    {
        int row= 1;
        int star = 1;
        int space = input-1;
        while(row <= input)
        {
            int countSpace = space;
            while(countSpace>0)
            {
                System.out.print("\t");
                countSpace--;
            }
            int countStar = star;
            while(countStar>0)
            {
                if(countStar==1 || countStar== star)
                {
                    System.out.print(row+"\t");
                }
                else
                    System.out.print("0\t");
                countStar--;
            }
            space--;
            star +=2 ;
            row++;
            System.out.println();
        }
    }
}

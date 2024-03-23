import java.util.Scanner;

public class Q28
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        pattern(input);
    }
    static void pattern(int input)
    {
        int row = 1;
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
            int countStar = 1;
            int print  = row;
            int mid = star/2+1;
            while(countStar <= star)
            {
                System.out.print(print + "\t");
                if(countStar <= mid)
                    print++;
                else
                    print--;
                countStar++;
            }
            star +=2;
            space--;
            row++;
            System.out.println();
        }
    }

}
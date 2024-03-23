import java.util.Scanner;

public class Q22
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        pattern(input);
    }
    static void pattern(int input)
    {
        int row = 1;
        int space = 0;
        int star = input-1;
        while(row <= input)
        {
            int countStar = 1;
            while(countStar <= star)
            {
                System.out.print("*\t");
                countStar++;
            }
            if(row==1)
            {
                System.out.print("*\t");
            }
            int countSpace= 1;
            while(countSpace<= space)
            {
                countSpace++;
                System.out.print("\t");
            }
            countStar = 1;
            while(countStar <= star)
            {
                System.out.print("*\t");
                countStar++;
            }
            if(row>1)
            {
                star-=1;
                space+=2;
            }
            else{
                space+=1;
            }
            row++;
            System.out.println();
        }
    }
}

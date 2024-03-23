import java.util.Scanner;

public class Q8
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
            while(row <= input)
            {
                int column=1;
                while(column <= input)
                {
                    if(row ==column || row+column == input+1)
                        System.out.print("*\t");
                    else
                        System.out.print("\t");
                    column++;
                }
                row++;
                System.out.println();
            }
        }

}

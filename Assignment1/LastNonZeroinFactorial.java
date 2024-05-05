import java.util.Scanner;
public class Question_1
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(findLastDigit(num));
    }
    static int findLastDigit(int num)
    {
        int factorial = 1;
        // Finding factorial 
        for(int i=1; i<=num ; i++)
        {
            factorial *= i ;
            // Eliminating the zeros to avoid overflow.
            while(factorial%10 ==0)
            {
                factorial /= 10;
            }
        }
        return factorial%10;
    }
}

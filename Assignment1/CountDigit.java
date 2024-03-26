package Assignment1;
/*
COUNT DIGITs
Take the following as input.
A number
A digit
Write a function that returns the number of times digit is found in the number. Print the value returned.
Sample Input
5433231
3
Sample Output
3
Explanation
The digit can be from 0 to 9. Assume decimal numbers.In the given case digit 3 is occurring 3 times in the given number.
 */
import java.util.Scanner;
public class CountDigit
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int digit = input.nextInt();
        System.out.println( count(num , digit));

    }
    static int count(int num , int digit)
    {
        int counter = 0;
        while(num !=0 )
        {
            int lastDigit = num%10;
            if(lastDigit== digit) counter++;
            num /= 10; //Updated Number;
        }
        return counter;
    }
}

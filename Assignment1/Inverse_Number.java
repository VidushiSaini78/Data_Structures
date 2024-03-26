package Assignment1;
/*
Take the following as input.
A number
Assume that for a number of n digits, the value of each digit is from 1 to n and is unique. E.g. 32145 is a valid input number.

Write a function that returns its inverse, where inverse is defined as follows

Inverse of 32145 is 12543. In 32145, “5” is at 1st place, therefore in 12543, “1” is at 5th place; in 32145, “4” is at 2nd place, therefore in 12543, “2” is at 4th place.
Sample Input
32145
Sample Output
12543
 */
import java.util.Scanner;

public class Inverse_Number
{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int num = input.nextInt();
        inverse(num);
    }
    static void inverse(int num)
    {
        int ans= 0;
        int pos = 1;
        while(num!=0)
        {
            int digit = num%10;
            int multiplier = (int)Math.pow(10 , digit-1);
            ans += pos*multiplier;
            num/=10;
            pos++;
        }
        System.out.println(ans);
    }
}

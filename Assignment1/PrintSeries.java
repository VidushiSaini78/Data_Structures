package Assignment1;

import java.util.Scanner;
/*
Take the following as input.

A number (N1)
A number (N2)
Write a function which prints first N1 terms of the series 3n + 2 which are not multiples of N2.
Sample Input
10
4
Sample Output
5   11  14  17  23  26  29  35  38  41
Explanation
The output will've N1 terms which are not divisible by N2.
 */
public class PrintSeries
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        series(num1 , num2);
    }
    static void series(int num1 , int num2)
    {
        int counter = 0; //used to count 10 digits
        int value = 1;
        while(counter !=10)
        {
            int sum = 3*(value++) + 2;
            if(sum%num2 != 0)
            {
                counter++;
                System.out.println(sum);
            }
        }
    }
}

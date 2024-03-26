package Assignment1;
/*
Take N as input. Print Nth Fibonacci Number, given that the first two numbers in the Fibonacci Series are 0 and 1.
Sample Input
10
Sample Output
55
 */
import java.util.Scanner;

public class Nth_Fibonacci
{
    public static void main(String[] args) {
        Scanner input=  new Scanner(System.in);
        int num = input.nextInt();
        get(num);
    }
    static void get(int num)
    {
        int a=0;
        int b=1;
        while(num!=0)
        {
            int c = a+b;
            a=b;
            b=c;
            num--;
        }
        System.out.println(a);
    }
}

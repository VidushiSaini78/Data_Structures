package Assignment1;
/*
Take N as input, Calculate it's reverse also Print the reverse.
 */
import java.util.Scanner;

public class Print_Reverse
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Long num = input.nextLong();
        reverse(num);
    }
    static void reverse(Long num)
    {
        while (num!=0)
        {
            System.out.print(num%10);
            num/=10;
        }
    }
}

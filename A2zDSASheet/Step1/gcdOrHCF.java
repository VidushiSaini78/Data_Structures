import java.util.Scanner;

public class gcdOrHCF
{
    public static int gcd(int a,int b)
    {
        // Write your code here
        int divisor = 2;
        int commonDivisor = 1;
        while(a!=1 && b!=1)
        {
            if(a%divisor==0 && b%divisor==0)
            {
                a/= divisor;
                b/= divisor;
                commonDivisor *= divisor;
            }
            else if(a%divisor ==0)
            {
                while(a%divisor ==0)
                {
                    a = a/divisor;
                }

            }
            else if(b%divisor==0)
            {
                while(b%divisor ==0)
                {
                    b = b/divisor;
                }
            }
            divisor ++;

        }
        return commonDivisor;
    }
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        int num1 = input.nextInt();
        int num2= input.nextInt();
        System.out.println(gcd(num1 , num2));

    }
}

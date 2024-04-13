import java.util.Scanner;

public class gcdOrHCF_1
{
    public static int gcd(int a,int b)
    {
        while(a!=0 && b!=0)
        {
            if(a>b)
                return gcd(a%b , b);
            else
                return gcd(a, b%a);
        }
        if(a==0) return b ;
    return a;
    }
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        int num1 = input.nextInt();
        int num2= input.nextInt();
        if(num1>num2) System.out.println(gcd(num1 , num2));
        else System.out.println(gcd(num2,num1));
    }
}

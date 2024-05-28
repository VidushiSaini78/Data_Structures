import java.util.Scanner;

public class gcdOrHCF
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

    static int gcd1(int n, int m) {
        int ans = 1;
        for (int i = 2; i < (int) Math.min(n, m); i++) {
            if (n % i == 0 && m % i == 0)
                ans = i;
        }
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        int num1 = input.nextInt();
        int num2= input.nextInt();
        if(num1>num2) System.out.println(gcd(num1 , num2));
        else System.out.println(gcd(num2,num1));
        System.out.println(gcd1(num1 , num2));
    }
}

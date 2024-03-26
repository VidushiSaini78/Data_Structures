package Assignment1;
/*
A Boston number is a composite number, the sum of whose digits is the sum of the digits of its prime factors obtained as a result of prime factorization (excluding 1 ).
The first few such numbers are 4,22 ,27 ,58 ,85 ,94 and 121 . For example, 378 = 2 × 3 × 3 × 3 × 7 is a Boston number since 3 + 7 + 8 = 2 + 3 + 3 + 3 + 7. Write a program to check whether a given integer is a Boston number
Sample Input
378
Sample Output
1
 */
import java.util.Scanner;
public class BostonNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(check(num));
    }
    static int check(int num)
    {
        int digitSum = sum(num); //containing sum of digits
        int primefactorSum = prime(num); //containing sum of prime factors
        if(digitSum==primefactorSum) return 1; //returns according to the condition
        return 0;
    }
    static int sum(int num)
    {
        int ans =0;
        while(num!=0)
        {
            ans += num%10;
            num /= 10;
        }
        return ans;
    }
    static int prime(int num)
    {
        int ans= 0 ;
        int divisor = 2;
        while(num!=1)
        {
            if(num%divisor==0)
            {
                if(isPrime(divisor))
                {
                    while(num%divisor==0)
                    {
                        num/= divisor;
                        ans += sum(divisor);
                    }
                }

            }
            divisor++;

        }
        return ans;
    }
    static boolean isPrime(int num)
    {
        for(int i=2; i<=num/2 ; i++)
        {
            if(num%i==0)
                return false;
        }
        return true;
    }
}

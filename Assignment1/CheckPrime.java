package Assignment1;
/*
Take as input a number N, print "Prime" if it is prime if not Print "Not Prime".
 */
import java.util.Scanner;

public class CheckPrime
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String ans = check(num) ? "PRIME" : "NOT PRIME";
        System.out.println(ans);
    }
    static boolean check(int n)
    {
        int count =0;
        for(int i=2; i<=n/2 ; i++)
        {
            if(n%i==0) count++;
        }
        if(count==0) return true;
        return false;
    }
}

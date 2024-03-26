package Assignment1;

import java.util.Scanner;

public class Chewbacca_And_Number
{
    public static void main(String[] args) {
        Scanner input=  new Scanner(System.in);
        long num = input.nextInt();
        function(num);
    }
    static void function(long num)
    {
        long ans = 0;
        int multiplier = 1;
        while(num !=0)
        {
            int digit = (int) num%10;
            if(digit>=5 && digit!=9) digit = 9-digit;
            ans = ans + digit*multiplier;
            num/=10;
            multiplier*=10;
        }
        System.out.println(ans);
    }

}

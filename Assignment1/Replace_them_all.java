package Assignment1;

import java.util.Scanner;

/*
Given a integer as a input and replace all the '0' with '5' in the integer
 */
public class Replace_them_all
{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int num = input.nextInt();
        replace(num);
    }
    static void replace(int num)
    {
        int ans=  0;
        int multiplier = 1;
        while(num!=0)
        {
            int lastDigit = num%10;
            if(lastDigit==0) lastDigit=5;
            ans += lastDigit*multiplier;
            num /=10;
            multiplier*=10;
        }
        System.out.println(ans);
    }
}

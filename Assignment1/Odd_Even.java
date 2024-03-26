package Assignment1;
/*
Due to an immense rise in Pollution, Kejriwal is back with the Odd and Even Rule in Delhi. 4
The scheme is as follows, each car will be allowed to run on Sunday if the sum of digits which are even is divisible by 4 or sum of digits which are odd in that number is divisible by 3.
However to check every car for the above criteria can't be done by the Delhi Police. You need to help Delhi Police by finding out if a car numbered N will be allowed to run on Sunday?
 */
import java.util.Scanner;

public class Odd_Even
{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(check(num));
    }
    static boolean check(int num)
    {
        int odd_sum =0;
        int even_sum =0;
        while(num!=0)
        {
            int digit = num%10;
            if(digit%2==0) even_sum+= digit;
            else odd_sum+=digit;
            num/=10;
        }

        if(odd_sum%3==0||even_sum%4==0)
            return true;
        return false;
    }
}

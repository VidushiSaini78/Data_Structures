package Assignment1;
/*
Decimal To Octal Conversion
 */
import java.util.Scanner;
public class Decimal_to_Octal
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(convert(num));

    }
    static int convert(int num)
    {
        int ans=0;
        int multiplier = 1;
        while(num!=0)
        {
            int quoitent= num/8;
            int remainder =  num%8;
            ans += remainder*multiplier;
            multiplier*=10;
            num = quoitent;
        }
        return ans;
    }
}

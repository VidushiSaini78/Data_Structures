import java.util.Scanner;

public class Armstrong_Number
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number -> ");
        int num  = sc.nextInt();
        System.out.println(isArmstrong(num) );
    }
    static boolean isArmstrong(int n)
    {
        String str = Integer.toString(n);
        int length = str.length();
        int sum =0;
        int orginial  = n;
        while(n!=0)
        {
            int lastDigit = n%10;
            sum += (int)Math.pow(lastDigit,length );
            n/=10;
        }
        return sum==orginial;
    }
}

package Assignment1;
/*
Take digits one by one and make a single number by concatenating them.
Digits are given from Left Most place.
Sample Input
5
8
5
3
1
4
Sample Output
85314
 */
import java.util.Scanner;
public class Make_number_from_Digit2
{
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        create(n);
    }
    static void create(int n)
    {
        int ans =0;
        while(n!=0)
        {
            int num = sc.nextInt();
            int multiplier =(int) Math.pow(10 , n-1);
            ans += num*multiplier;
            n--;
        }
        System.out.println(ans);
    }
}

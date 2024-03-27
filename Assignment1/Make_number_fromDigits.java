package Assignment1;
/*
Take digits one by one and make a single number by concatenating them.
Digits are given from 1's place.
Sample Input
5
8
5
3
1
4
Sample Output
41358
 */
import java.util.Scanner;
public class Make_number_fromDigits
{
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args)
    {
        int n = sc.nextInt();
        create(n);
    }
    static void create(int n)
    {
        int multiplier =1;
        int ans = 0;
        while(n!=0)
        {
            int num= sc.nextInt();
            ans += num*multiplier;
            multiplier*=10;
            n--;
        }
        System.out.println(ans);
    }
}

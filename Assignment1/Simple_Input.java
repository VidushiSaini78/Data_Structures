package Assignment1;
/*
Given a list of numbers, stop processing input after the cumulative sum of all the input becomes negative.
 Sample Input
1
2
88
-100
49
Sample Output
1
2
88
 */
import java.util.Scanner;
public class Simple_Input
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while(true)
        {
            int num = input.nextInt();
            if(sum+num<0) break;
            sum += num;
            System.out.println(num);
        }
    }
}

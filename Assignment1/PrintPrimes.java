package Assignment1;

import java.util.Scanner;

/*
Take N as input. Print all prime numbers from 2 to N.
Sample Input
10
Sample Output
2
3
5
7
Explanation
Each output should be on separate line. A prime number is that number which is divisible by one or itself.
 */
import java.util.Scanner;
public class PrintPrimes
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        //if a number apart from 1 or itself is divisible by any other number than it is not a prime number.
        for(int i = 2 ; i<= num ; i++)
        {
            int count= 0;
            for(int j = i/2 ; j>=2 ; j--)
            {
                if(i%j ==0)
                {
                    count++;
                    break;
                }
            }
            if (count==0)
                System.out.println(i);
        }


    }
}

package Assignment1;
/*
Greatest Common Divisor (HCF)
Euclid Algorithm
 */
import java.util.Scanner;

public class GCD
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int num1= input.nextInt();
        if(num1>num) euclidAlgo(num1,num);
        else euclidAlgo(num , num1);
    }
    static void euclidAlgo(int num , int num1)
    {
        while(num1!=0)
       {
           int remainder = num%num1;
           num= num1;
           num1=remainder;
       }
        System.out.println(num);
    }
}

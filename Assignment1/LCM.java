package Assignment1;
/*
LCM(Least Common Multiple)
Using Formula :- a*b/gcd(a,b)
 */
import java.util.*;
public class LCM
{
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = sc.nextInt();
        System.out.println(find(num , num1));
    }
    static int find(int n , int m)
    {
        int gcd;
        if(n>m)
            gcd= euclidAlgo(n,m);
        else gcd =euclidAlgo(m,n);
        return (n*m)/gcd;
    }
    static int euclidAlgo(int num , int num1)
    {
        while(num1!=0)
        {
        int remainder = num%num1;
        num= num1;
        num1=remainder;
        }
    return num;
    }
}

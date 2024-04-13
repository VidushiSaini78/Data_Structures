public class Solution {
    public static boolean palindromeNumber(int n){
        int orignal = n ; 
        int reversed_Num= 0;
        while(n>0)
        {
            int lastDigit = n%10;
            reversed_Num = reversed_Num*10 + lastDigit;
            n/=10;
        }
        if(reversed_Num == orignal) return true;
        return false;
    }
}

public class Count_Digit
{
    public static void main(String[] args) 
    {
      int a = 7789;
      System.out.println(count(a));
    }
    // Brute Force : TC -> O(n) SC -> O(1)
    static int count(int num)
    {
        int count = 0;
        while(num !=0)
        {
            count ++;
            num /=10;
        }
        return count;
    }
    // Optimized Approach TC: O(1) SC : O(1)
    static int count1(int num)
    {
        return (int) (Math.log10(num) + 1);
    }
    
}

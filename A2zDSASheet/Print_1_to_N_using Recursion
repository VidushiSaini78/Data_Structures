public class Solution {
    static int ans[];
    public static int[] printNos(int x) 
    {
        ans = new int[x];
        print(ans , x, ans.length-1);
        return ans;
    }
    static void print(int ar[] , int x , int index)
    {
        if(x==0)
        return;;
           
        print(ar , x-1 , index-1);
        ar[index]=x;
    }
}

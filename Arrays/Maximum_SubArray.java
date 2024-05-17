class Solution {
    public int maxSubArray(int[] ar) 
    {
        if(ar.length==1) return ar[0];
        int sum =0;
        int ans = Integer.MIN_VALUE;
        for(int i=0 ; i<ar.length;i++)
        {
            sum += ar[i];
            ans = Math.max(ans , sum);
            if(sum<0)
            sum=0;
        }
        return ans;
        
    }
}
/*
Used KEDANE algorithm TC  : O(N) SP: O(!)
*/

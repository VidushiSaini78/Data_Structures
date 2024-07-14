class Solution {
    public int[] searchRange(int[] nums, int target) {
        int lb = lower_bound(nums , target);
        if(lb == nums.length || nums[lb] != target)
             return new int[]{-1, -1};
        int ub = upper_bound(nums , target);
    return new int[]{lb , ub-1};
    }
        
    
     static int upper_bound(int ar[] , int x)
    {
        int low = 0 ;
        int ans = ar.length;
        int high =  ar.length-1;
        while(low <= high)
        {
            int mid = (low+high)/2;
            if(ar[mid] > x)
            {
                ans = mid;
                high = mid-1;
            } 
            else low = mid+1;   

        }
    return ans;
    }
    static int lower_bound(int ar[] , int x)
    {
        int low = 0 ;
        int ans = ar.length;
        int high =  ar.length-1;
        while(low <= high)
        {
            int mid = (low+high)/2;
            if(ar[mid] >= x)
            {
                ans = mid;
                high = mid-1;
            } 
            else low = mid+1;   

        }
    return ans;
    }

}

public class practise
{
    public static void main(String[] args) 
    {
        int ar[] = {10 , 20 ,30 ,40 , 50};
        System.out.println("Floor : " + floor(ar, 34));
        System.out.println("Ceil : " + ceil(ar, 34));
        
    }
    // Smallest Number in array >= x
    static int ceil(int ar[] , int target)
    {
        int ans = -1;
        int low = 0 ;
        int high = ar.length-1;
        while(low <= high)
        {
            int mid = (low+high)/2;
            if(ar[mid] >= target)
            {
                ans = ar[mid];
                high = mid-1;
            }
            else low = mid+1;
        }
    return ans;
    }
    // Largest number in array <= x
    static int floor(int ar[] , int target)
    {
        int ans = -1;
        int low = 0 ;
        int high = ar.length-1;
        while(low <= high)
        {
            int mid = (low+high)/2;
            if(ar[mid] <= target)
            {
                ans = ar[mid];
                low = mid+1;
            }
            else high = mid -1;
        }
    return ans;
    }
}

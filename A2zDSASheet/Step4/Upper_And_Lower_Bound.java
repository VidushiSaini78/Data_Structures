public class practise
{
    public static void main(String[] args) {
        int ar[] = {1,2,3,3,5,8,9,11};
        System.out.println(upper_bound(ar , 9));
    }
    static int upper_bound(int ar[] , int x)
    {
        int low = 0 ;
        int ans = -1;
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
        int ans = -1;
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

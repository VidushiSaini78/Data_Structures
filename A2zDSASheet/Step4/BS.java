public class practise
{
    public static void main(String[] args) {
        int ar[] = {3,4,6,7,9,12,16,17};
        System.out.println(iterative(ar , 7));
        System.out.println(recursive(ar , 0 , ar.length-1 , 7 ));
    }
    static int iterative(int ar[] , int target)
    {
        int low = 0 ;
        int high = ar.length-1;
        while(low <= high)
        {
            int mid = (low+high)/2;
            if(ar[mid] == target) return mid;
            else if(ar[mid] > target) high = mid-1;
            else low = mid +1;
        }
    return -1;
    }
    static int recursive(int ar[] , int low , int high , int target)
    {
        if(low >high) return -1;
        int mid =  (low+high)/2;
        if(ar[mid] > target) 
            return recursive(ar, mid+1, high, target);
        else if(ar[mid] < target) 
            return recursive(ar, low, mid-1, target);
        else
            return mid;
    }
}

import java.util.ArrayList;

public class practise
{
    public static void main(String[] args) {
        int ar[] = {5,4,3,2,1};
        brute_force(ar);
        optimal(ar);
    }
    static void optimal(int ar[])
    {
        int count = mergeSort(ar,0,ar.length-1);
        System.out.println(count);
        
    }
    private static int merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); 
        int left = low;     
        int right = mid + 1;   
        int cnt = 0;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                cnt += (mid - left + 1); 
                right++;
            }
        }
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
        return cnt; 
    }

    public static int mergeSort(int[] arr, int low, int high) {
        int cnt = 0;
        if (low >= high) return cnt;
        int mid = (low + high) / 2 ;
        cnt += mergeSort(arr, low, mid);  
        cnt += mergeSort(arr, mid + 1, high); 
        cnt += merge(arr, low, mid, high);  
        return cnt;
    }
    // TC : O (N square)
    static void brute_force(int ar[])
    {
        int count = 0;
        for(int i=0 ; i<ar.length ; i++)
        {
            for(int j=i+1; j<ar.length ; j++)
            {
                if(ar[i] > ar[j]) count++;
            }
        }
        System.out.println(count);
    }
}

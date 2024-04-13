import java.util.ArrayList;

public class Solution {

    public static void mergeSort(int[] arr, int low, int high){
        // Write your code here
        if(low >= high) return ;
        int mid = (low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low , mid , high);
    }
    static void merge(int ar[] , int low , int mid , int high)
    {
        ArrayList<Integer> al = new ArrayList<>();
        int i = low;
        int j = mid+1;
        while(i<=mid && j <=high)
        {
            if(ar[i] <= ar[j])
            {
                al.add(ar[i]);
                i++;
            }
            else
            {
                al.add(ar[j]);
                j++;
            }
        }
        while(i<=mid)
        {
            al.add(ar[i]);
            i++;
        }
        while(j<=high)
        {
            al.add(ar[j]);
            j++;
        }
        for(int k=low ;k<=high ; k++)
        {
            ar[k] = al.get(k-low);
        }
    }
}

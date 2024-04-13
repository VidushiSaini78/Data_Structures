public class Solution {
    public static void selectionSort(int[] arr) {
        //Your code goes here
        for(int i=0 ; i<arr.length-1 ; i++)
        {
            int minIndex = i;
            for(int j=i+1 ; j<arr.length ; j++)
            {
                if(arr[j] < arr[minIndex])
                    minIndex = j;
            }
            if(minIndex != i)
            {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i] ; 
                arr[i] = temp;
            }
        }
    }
}

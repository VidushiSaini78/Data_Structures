public class Solution {
    public static void insertionSort(int[] ar, int size) {
        //Your code goes here
        for(int i=1 ; i<size ; i++)
        {
                int index = i-1;
                int ele = ar[i];
                while(index>=0 && ar[index] > ele)
                {
                    ar[index+1] = ar[index];
                    index--;
                }
                ar[index+1] = ele;
            
        }
    }
}

/*
Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same.
If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result. It does not matter what you leave beyond the first k elements.
TC : O(n)
SC : O(1)
*/
public class practise {
    public static void main(String[] args) {
        int ar[] = {1, 1, 2, 2, 2, 3, 3};
        int k = remove(ar);
        for (int i = 0; i <= k; i++) {
            System.out.print(ar[i] + " ");
        }
    }
    static int remove(int ar[])
    {
        int i =0 ;
        int j = i+1;
        while(j < ar.length)
        {
            if(ar[i] != ar[j] && i+1 !=j)
            {
                ar[i+1] = ar[j];
                i++;
            }
            j++;
        }
        return i;
    }
}

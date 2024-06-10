import java.util.*;

public class practise {
    public static void main(String[] args) {
        int ar[] = { 1, -1, 3, 2, -2, -8, 1, 7, 10, 23 };
        method1(ar);
        method2(ar);
    }
    // Brute Force : Generating all the subarray and checking the sum
    static void method1(int ar[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < ar.length; i++) {
            int sum = 0, count = 0;
            for (int j = i; j < ar.length; j++) {
                sum += ar[j];
                count++;
                if (sum == 0)
                    max = Math.max(max, count);

            }
        }
        System.out.println(max);
    }
    // Optimized TC: O(N) SC:O(N)
    static void method2(int ar[]) {
        HashMap<Integer, Integer> mapp = new HashMap<>();
        int prefix_sum = 0;
        int max_length = 0;
        for (int i = 0; i < ar.length; i++) {
            prefix_sum += ar[i];
            if (prefix_sum == 0)
                max_length = i + 1;
            else if (mapp.containsKey(prefix_sum))
                max_length = Math.max(max_length, i - mapp.get(prefix_sum));
            else
                mapp.put(prefix_sum, i);
        }
        System.out.println(max_length);
    }
}

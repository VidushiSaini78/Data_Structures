import java.util.*;

public class practise {
    public static void main(String[] args) {
        int ar[] = { -1, 0, 1, 2, -1, -4 };
        method1(ar);
        method2(ar);
        method3(ar);
    }

    static void display(Set<List<Integer>> ans) {
        for (List<Integer> triplet : ans) {
            System.out.print(triplet + " ");
        }
        System.out.println();
    }

    // Brute Force TC : O(N^3)
    static void method1(int ar[]) {
        Set<List<Integer>> ans = new HashSet<>();
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                for (int k = j + 1; k < ar.length; k++) {
                    int sum = ar[i] + ar[j] + ar[k];
                    if (sum == 0) {
                        List<Integer> temp = Arrays.asList(ar[i], ar[j], ar[k]);
                        temp.sort(null);
                        ans.add(temp);
                    }
                }
            }
        }
        display(ans);
    }
    // Better Approach TC : N^2 
    static void method2(int ar[]) {
        Set<List<Integer>> ans = new HashSet<>();
        for (int i = 0; i < ar.length; i++) {
            Set<Integer> hash = new HashSet<>();
            for (int j = i + 1; j < ar.length; j++) {
                int third = -(ar[i] + ar[j]);
                if (hash.contains(third)) {
                    List<Integer> temp = Arrays.asList(ar[i], ar[j], third);
                    temp.sort(null);
                    ans.add(temp);
                }
                hash.add(ar[j]);

            }
        }
        display(ans);
    }
    // Optimized Approach TC  : nlogn(sorting) + n *n  SC : O(1)
    static void method3(int ar[]) {
        Set<List<Integer>> ans = new HashSet<>();
        Arrays.sort(ar);
        for (int i = 0; i < ar.length; i++) {

            if (i != 0 && ar[i] == ar[i - 1])
                continue;
            int j = i + 1;
            int k = ar.length - 1;
            while (j < k) {
                int sum = ar[i] + ar[j] + ar[k];
                if (sum == 0) {
                    List<Integer> temp = Arrays.asList(ar[i], ar[j], ar[k]);
                    temp.sort(null);
                    ans.add(temp);
                    j++;
                    k--;
                } else if (sum < 0)
                    j++;
                else
                    k--;
            }

        }
        display(ans);
    }

}

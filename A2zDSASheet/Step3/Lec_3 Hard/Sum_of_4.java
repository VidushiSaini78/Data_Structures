import java.util.*;

public class practise {
    public static void main(String args[]) {
        int ar[] = { 4, 3, 3, 4, 4, 2, 1, 2, 1, 1 };
        System.out.println("Brute Force Method -> ");
        method1(ar, 9);
        System.out.println("Better Appraoch -> ");
        method2(ar, 9);
        System.out.println("Optimized Approach -> ");
        method3(ar, 9);
    }

    static void method1(int ar[], int target) {
        List<List<Integer>> myans = new ArrayList<>();
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                for (int k = j + 1; k < ar.length; k++) {
                    for (int l = k + 1; l < ar.length; l++) {
                        int sum = ar[i] + ar[j] + ar[k] + ar[l];

                        if (sum == target) {
                            List<Integer> temp = Arrays.asList(ar[i], ar[j], ar[k], ar[l]);
                            temp.sort(null);
                            if (!myans.contains(temp))
                                myans.add(temp);
                        }
                    }
                }
            }
        }
        display(myans);
    }

    static void display(List<List<Integer>> ans) {
        for (List<Integer> ele : ans) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    static void method2(int ar[], int target) {
        List<List<Integer>> myans = new ArrayList<>();
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                HashSet<Integer> hashset = new HashSet<>();
                for (int k = j + 1; k < ar.length; k++) {
                    int sum = ar[i] + ar[j] + ar[k];
                    int l = target - sum;
                    if (hashset.contains(l)) {
                        List<Integer> temp = Arrays.asList(ar[i], ar[j], ar[k], l);
                        temp.sort(null);
                        if (!myans.contains(temp))
                            myans.add(temp);

                    }
                    hashset.add(ar[k]);

                }
            }
        }
        display(myans);
    }

    static void method3(int ar[], int target) {
        List<List<Integer>> myans = new ArrayList<>();
        Arrays.sort(ar);
        for (int i = 0; i < ar.length; i++) {
            if (i != 0 && ar[i] == ar[i - 1])
                continue;
            for (int j = i + 1; j < ar.length; j++) {
                if (j > i + 1 && ar[j] == ar[j - 1])
                    continue;
                int k = j + 1;
                int l = ar.length - 1;
                while (k < l) {
                    long sum = ar[i] + ar[j] + ar[l] + ar[k];
                    if (sum == target) {
                        List<Integer> temp = Arrays.asList(ar[i], ar[j], ar[k], ar[l]);
                        myans.add(temp);
                        k++;
                        l--;
                        while (k < l && ar[k] == ar[k - 1])
                            k++;
                        while (k < l && ar[l] == ar[l + 1])
                            l--;
                    } else if (sum < target)
                        k++;
                    else
                        l--;
                }
            }
        }
        display(myans);
    }
}

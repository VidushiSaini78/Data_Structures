import java.util.*;

public class practise {
    public static void main(String args[]) {
        int ar[] = { 1, 1, 1, 1, 1, 1, 1 };
        method1(ar);
        method2(ar);
        method3(ar);
    }

    // Brute Force TC : O(N)
    static void method1(int ar[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < ar.length - 1; i++) {
            if (!ans.contains(ar[i])) {
                int count = 1;
                for (int j = i + 1; j < ar.length; j++) {
                    if (ar[i] == ar[j])
                        count++;
                }
                if (count > ar.length / 3)
                    ans.add(ar[i]);
            }
        }
        display(ans);
    }

    static void display(ArrayList<Integer> ans) {
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }

    // Better Approach TC : O(N) SC : O(N)
    static void method2(int ar[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> mapp = new HashMap<>();
        for (int i = 0; i < ar.length; i++) {
            mapp.put(ar[i], mapp.getOrDefault(ar[i], 0) + 1);
            if (mapp.get(ar[i]) > ar.length / 3 && !ans.contains(ar[i]))
                ans.add(ar[i]);
        }
        display(ans);
    }
    // Optimized TC : O(N)
    static void method3(int ar[]) {
        int count1 = 0;
        int count2 = 0;
        int ele1 = 0;
        int ele2 = 0;
        for (int i = 0; i < ar.length; i++) {
            if (count1 == 0 && ar[i] != ele2) {
                count1++;
                ele1 = ar[i];
            } else if (count2 == 0 && ar[i] != ele1) {
                count2++;
                ele2 = ar[i];
            } else if (ele1 == ar[i])
                count1++;
            else if (ele2 == ar[i])
                count2++;
            else {
                count1--;
                count2--;
            }
        }
        if (count1 > ar.length / 3)
            System.out.println(ele1);
        if (count2 > ar.length / 3)
            System.out.println(ele2);
    }
}

import java.util.*;

public class practise {
    public static void main(String args[]) {
        int ar[] = { 10, 22, 12, 3, 0, 6 };
        ArrayList<Integer> ans = leader(ar);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }

    }
    // TC : O(N) SC:O(1) apart from storing ans 
    static ArrayList<Integer> leader(int ar[]) {
        int max = ar[ar.length - 1];
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(ar[ar.length - 1]);
        for (int i = ar.length - 1; i >= 0; i--) {
            if (max < ar[i])
                ans.add(ar[i]);
            max = Math.max(ar[i], max);
        }
        return ans;
    }
}

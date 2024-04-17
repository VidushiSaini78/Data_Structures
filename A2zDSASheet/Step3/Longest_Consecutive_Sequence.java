/*
BRUTE FORCE : TC -> O(N2) Doing linear search to check whether the next consecutive is present in the Array
BETTER : We can sort the array and then find the longest. TC -> O(NlogN)  + O(N) {Sorting + searching for longest}
OPTIMAL : TC -> O(N) + O(2N) {Putting in the set + tranversing further twice in order to find the starting of consecutive sequence}
*/
import java.util.*;
public class practise
{
    public static void main(String[] args) {
        int ar[] = {100, 200, 1, 3, 2, 4};
        System.out.println(get(ar));
    }
    static int get(int a[])
    {
        int n = a.length;
        if (n == 0)
            return 0;

        int longest = 1;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }
        for (int it : set) {
            if (!set.contains(it - 1)) {
                int cnt = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;

    }
}

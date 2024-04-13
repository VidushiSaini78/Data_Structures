// Leetcode 7 (Reverse Integer )
import java.util.*;
class Solution {
    public int reverse(int n) {
        long ans = 0L;
        while (n != 0) {
            int remainder = n % 10;
            ans = ans * 10 + remainder;
            n /= 10;
        }
        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
            return 0; 
        }
        return (int) ans; 
    }

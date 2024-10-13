// Most Optimized TC : O(N) SC: O(1)
public int climbStairs(int n) {
        if(n==0 || n==1) return 1;
        int curr = 1 ; int prev = 1;
        int ans = 0;
        for(int i=2 ; i<=n ; i++)
        {
            ans  =  curr + prev;
            prev = curr;
            curr = ans;
        }
    return ans;
    }
// Tabulation Method TC: O(N) SC: O(N)
public int climbStairs(int n) {
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2; i<=n ; i++)
        {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
// Memorization TC : ~ O(2 raise to power N) SC: ~O(N)
 public int climbStairs(int n) {
        HashMap<Integer, Integer> mapp = new HashMap<>();
    return climbHigh(n, mapp);
    }
    public static int climbHigh(int n , HashMap<Integer, Integer> mapp)
    {
        if(n==0 || n==1) return 1;
        if(!mapp.containsKey(n))
        {
            mapp.put(n , climbHigh(n-1, mapp) + climbHigh(n-2, mapp));
        }
    return mapp.get(n);
    }
// Recursion TC: O(2 raise to power N) 
static HashMap<Integer, Integer> mapp = new HashMap<>();
    public int climbStairs(int n) {
        
        if(n==0 || n==1) return 1;
    return climbStairs(n-1) + climbStairs(n-2);
    }

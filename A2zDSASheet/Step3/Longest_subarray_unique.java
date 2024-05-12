class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> mystack = new HashMap<>();
        int left = 0 ;
        int right = 0 ;
        int length = s.length();
        int Max_length = 0;
        while(right < length )
        {
            if(mystack.containsKey(s.charAt(right)))
            {
                left = Math.max(mystack.get(s.charAt(right))+1 , left);
            }
            mystack.put(s.charAt(right) , right);
            Max_length = Math.max(Max_length , right-left+1);
            right++;
        }
        return Max_length;
    }
}

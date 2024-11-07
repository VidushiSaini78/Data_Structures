class Solution {
    public boolean rotateString(String s, String goal) {
       if (s.length() != goal.length()) return false;
       StringBuilder str = new StringBuilder(s);
       for(int i=0 ; i<s.length() ; i++)
       {
            if(str.toString().equals(goal)) return true;
            char ch = str.charAt(0);
            str.deleteCharAt(0);
            str.append(ch);
       }
    return false;
    }
}

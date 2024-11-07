class Solution {
    public String makeFancyString(String s) {
        if(s=="") return s;
        StringBuilder str = new StringBuilder();
        char prev = s.charAt(0);
        int count = 1;
        str.append(prev);
        for(int i=1 ; i<s.length() ; i++)
        {
            char current = s.charAt(i);
            if(current != prev)
            {
                count =1 ;prev = current;
            }
            else 
            {
                count++;
            }
            if(count <3) str.append(current);
            
        }
    return str.toString();
    }
}

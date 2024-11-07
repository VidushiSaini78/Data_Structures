class Solution {
    public String compressedString(String word) {
        if(word.length() ==1) 
            return "1" + word.charAt(0);
        char current_ch = word.charAt(0);
        int count = 1;
        StringBuilder str = new StringBuilder();
        for(int i=1 ; i<word.length() ; i++)
        {

            if(word.charAt(i) == current_ch  && count <9) count ++ ;
            else
            {
                str.append(count);
                str.append(current_ch);
                count = 1 ;
                current_ch = word.charAt(i);
            }
        }
        if(count >0)
        {
            str.append(count);
            str.append(current_ch);
        }
    return str.toString();
    }
}

public int strStr(String haystack, String needle) {
        for(int i=0 ; i<=haystack.length() - needle.length() ; i++)
        {
            String str1 = haystack.substring(i, i+needle.length());
          
            if(str1.equals(needle)) return i ;
        }
        return -1;
    }

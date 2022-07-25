// Runtime: 308 ms
// Memory Usage: 39.5 MB

class Solution {
    public int strStr(String haystack, String needle) {
        int n = needle.length();
        
        if(n == 0)
            return 0;
        if(n > haystack.length())
            return -1;
        
        for(int i = 0; i < haystack.length()-n+1; i++){ // aaa
                if(haystack.substring(i,i+n).equals(needle)){
                    return i;
                }
        }
        return -1;
    }
}
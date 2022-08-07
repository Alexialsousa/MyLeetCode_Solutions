// Runtime: 0 ms
// Memory Usage: 37.2 MB

class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        s = s.trim();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                return count;
            } else {
                count++;
            }
        }
        return count;
    }
}
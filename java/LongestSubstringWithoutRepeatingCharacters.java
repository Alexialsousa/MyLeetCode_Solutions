// Runtime: 102 ms
// Memory Usage: 39.3 MB

import java.util.Hashtable;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Hashtable<Character, Integer> table = new Hashtable<>();
        int longest = 0;
        int origin = 0;

        if (s.length() == 1)
            return 1;
        else if (s.length() == 0)
            return 0;

        for (int i = 0; i < s.length(); i++) {
            if (table.containsKey(s.charAt(i))) {
                if ((i - origin) > longest) {
                    longest = i - origin;
                }
                origin = table.get(s.charAt(i)) + 1;
                i = origin - 1;
                table.clear();
            } else {
                table.put(s.charAt(i), i);
                longest = Math.max(longest, i - origin + 1);
            }
        }
        return longest;
    }
}
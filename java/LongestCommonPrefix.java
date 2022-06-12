// Runtime: 1 ms
// Memory Usage: 37 MB

class Solution {
    public String longestCommonPrefix(String[] strs) {

        int shortest_length = 201;
        int shortest_index = 0;

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < shortest_length) {
                shortest_length = strs[i].length();
                shortest_index = i;
            }
        }

        String prefix = strs[shortest_index];

        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < prefix.length(); j++) {
                if (strs[i].charAt(j) != prefix.charAt(j)) {
                    prefix = prefix.substring(0, j);
                    break;
                }
            }
        }

        return prefix;
    }
}
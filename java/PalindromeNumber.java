// Runtime: 19 ms
// Memory Usage: 41.8 MB

class Solution {
    public boolean isPalindrome(int x) { // 12221

        String input = Integer.toString(x);
        int length = input.length();

        for (int i = 0; i <= length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
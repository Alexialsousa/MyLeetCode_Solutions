// Runtime: 0 ms
// Memory Usage: 37.3 MB

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = 0; i < n; i++) {
            if (digits[n - 1 - i] != 9) {
                digits[n - 1 - i]++;
                return digits;
            } else {
                digits[n - 1 - i] = 0;
            }
        }

        int[] arr = new int[n + 1];
        arr[0] = 1;

        return arr;
    }
}
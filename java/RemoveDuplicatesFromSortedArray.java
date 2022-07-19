// Runtime: 1 ms
// Memory Usage: 40.5 MB

class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        int n = nums.length;

        if (n == 0) {
            return 0;
        }

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[index++] = nums[i];
            }
        }

        nums[index] = nums[n - 1];
        return index + 1;
    }
}
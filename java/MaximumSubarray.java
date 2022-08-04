// Runtime: 1 ms
// Memory Usage: 49.2 MB

class Solution {
    public int maxSubArray(int[] nums) {
        // -1 2 -3 4 -1
        int current_sum = 0;
        int max_sum = nums[0];

        for (int i = 0; i < nums.length; i++) {
            current_sum += nums[i];
            if (current_sum > max_sum) {
                max_sum = current_sum;
            }

            if (current_sum < 0) {
                current_sum = 0;
            }
        }
        return max_sum;
    }
}
package java;

// Runtime: 3 ms
// Memory Usage: 39 MB

import java.util.Hashtable;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        Hashtable<Integer, Integer> table = new Hashtable<>();

        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (table.containsKey(difference)) {
                int[] array = { i, table.get(difference) };
                return array;
            } else {
                table.put(nums[i], i);
            }
        }
        return null;
    }
}
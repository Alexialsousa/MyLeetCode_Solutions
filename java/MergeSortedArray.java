// Runtime: 0 ms
// Memory Usage: 39.2 MB

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m + n];

        int j = 0;
        int i = 0;
        int index = 0;

        while (i < m && j < n) {
            if (nums1[i] >= nums2[j]) {
                arr[index] = nums2[j];
                j++;
            } else {
                arr[index] = nums1[i];
                i++;
            }
            index++;
        }

        if (n != 0) {
            if (j < n) {
                while (index < m + n) {
                    arr[index] = nums2[j];
                    index++;
                    j++;
                }
            }
        }

        while (index < m + n) {
            arr[index] = nums1[i];
            index++;
            i++;
        }

        for (int k = 0; k < arr.length; k++) {
            nums1[k] = arr[k];
        }
    }
}
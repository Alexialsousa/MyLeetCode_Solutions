# Runtime: 107 ms
# Memory Usage: 14.9 MB

class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        count = 0

        if len(nums) == 1:
            return 1

        for i in range(len(nums)-1):
            if nums[i] != nums[i+1]:
                nums[count] = nums[i]
                count = count + 1

        nums[count] = nums[len(nums)-1]
        return count + 1

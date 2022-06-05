# Runtime: 56 ms
# Memory Usage: 14.2 MB

class Solution:
    def isPalindrome(self, x: int) -> bool:
        x = str(x)

        for i in range(int(len(x)/2)):
            if(x[i] != x[len(x)-1-i]):
                return False
        return True

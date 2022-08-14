// Runtime: 19 ms
// Memory Usage: 36.2 MB

class Solution {
    public int mySqrt(int x) {
        long i = 0;

        while (true) {
            if (i * i > x) {
                return (int) i - 1;
            }
            i++;
        }

    }
}
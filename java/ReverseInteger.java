// Runtime: 7 ms
// Memory Usage: 38.5 MB

class Solution {
    public int reverse(int x) {
        boolean neg = false;

        if (x < 0) {
            neg = true;
            x = Math.abs(x);
        }

        char[] number = String.valueOf(x).toCharArray();

        for (int i = 0; i < number.length / 2; i++) {
            char temp = number[i];
            number[i] = number[number.length - 1 - i];
            number[number.length - 1 - i] = temp;
        }

        String num = "";

        if (neg) {
            num += "-";
        }

        num += String.valueOf(number);

        try {
            return Integer.parseInt(num);
        } catch (NumberFormatException e) {
            return 0;
        }

    }
}
// Runtime: 7 ms
// Memory Usage: 39.1 MB

class Solution {
    public String addBinary(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        int difference = 0;
        String bigger = "";
        String zeros = "";
        String result = "";

        if (lenA > lenB) {
            difference = lenA - lenB;
            bigger = a;
        } else if (lenA < lenB) {
            difference = lenB - lenA;
            bigger = b;
        }

        for (int i = 0; i < difference; i++) {
            zeros += "0";
        }

        if (bigger == a) {
            zeros += b;
            b = zeros;

        }

        else if (bigger == b) {
            zeros += a;
            a = zeros;
        }

        int carry = 0;
        int r = 0;
        int first = 0;
        int second = 0;

        for (int i = a.length() - 1; i >= 0; i--) {
            first = Character.getNumericValue(a.charAt(i));
            second = Character.getNumericValue(b.charAt(i));
            r = first + second + carry;

            if (r == 2) {
                result = '0' + result;
                carry = 1;
            } else if (r == 3) {
                result = '1' + result;
                carry = 1;
            } else {
                result = r + result;
                carry = 0;
            }
        }

        if (carry == 1) {
            result = "1" + result;
        }

        return result;
    }
}
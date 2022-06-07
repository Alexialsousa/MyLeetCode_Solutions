// Runtime: 6 ms
// Memory Usage: 39.6 MB

import java.util.Hashtable;

class Solution {
    public int romanToInt(String s) {
        Hashtable<String, Integer> roman = new Hashtable<String, Integer>();
        roman.put("I", 1);
        roman.put("V", 5);
        roman.put("X", 10);
        roman.put("L", 50);
        roman.put("C", 100);
        roman.put("D", 500);
        roman.put("M", 1000);

        int number = 0;
        int firstDigit = 0;
        int secondDigit = 0;

        for (int i = 0; i < s.length(); i++) {
            firstDigit = roman.get(Character.toString(s.charAt(i)));

            if (i == s.length() - 1) {
                secondDigit = 0;
            } else {
                secondDigit = roman.get(Character.toString(s.charAt(i + 1)));
            }

            if (firstDigit < secondDigit) {
                number += (secondDigit - firstDigit);
                i++;
            } else {
                number += firstDigit;
            }
        }
        return number;

    }
}
// Runtime: 10 ms
// Memory Usage: 43.3 MB

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> output = new LinkedList();
        Hashtable<Character, Character[]> table = new Hashtable<Character, Character[]>();

        if (digits.length() == 0) {
            return output;
        }

        table.put('2', new Character[] { 'a', 'b', 'c' });
        table.put('3', new Character[] { 'd', 'e', 'f' });
        table.put('4', new Character[] { 'g', 'h', 'i' });
        table.put('5', new Character[] { 'j', 'k', 'l' });
        table.put('6', new Character[] { 'm', 'n', 'o' });
        table.put('7', new Character[] { 'p', 'q', 'r', 's' });
        table.put('8', new Character[] { 't', 'u', 'v' });
        table.put('9', new Character[] { 'w', 'x', 'y', 'z' });

        output.add("");

        for (int i = 0; i < digits.length(); i++) {
            Character[] nums = table.get(digits.charAt(i));
            while (output.peek().length() == i) {
                String og = output.remove();
                for (char c : nums) {
                    output.add(og + c);
                }
            }
        }
        return output;

    }
}
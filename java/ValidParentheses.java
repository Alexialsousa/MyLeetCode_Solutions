// Runtime: 1 ms
// Memory Usage: 37.2 MB

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        if (s.length() % 2 != 0) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else {
                if (stack.empty()) {
                    return false;
                }
                char symbol = s.charAt(i);

                switch (symbol) {

                    case '}':
                        if (stack.pop() != '{') {
                            return false;
                        }
                        break;
                    case ')':
                        if (stack.pop() != '(') {
                            return false;
                        }
                        break;
                    case ']':
                        if (stack.pop() != '[') {
                            return false;
                        }
                        break;
                }
            }
        }
        return stack.empty();

    }
}
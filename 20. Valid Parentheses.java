class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> validpar = new Stack<>();
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '(') {
                validpar.push(')');
            }
            else if (s.charAt(i) == '{') {
                validpar.push('}');
            }
            else if (s.charAt(i) == '[') {
                validpar.push(']');
            }
            else {
                if (validpar.isEmpty() || validpar.pop() != s.charAt(i)) {
                    return false;
                }
            }
            i++;
        }
        if (validpar.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
}

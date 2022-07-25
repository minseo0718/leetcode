package per.kim;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> stackS1 = new Stack<>();

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
                stackS1.push(s.charAt(i));
            }
            if (stackS1.isEmpty()) {
                return false;
            }
            if (s.charAt(i) == '(') {
                if (stackS1.peek() == ')') {
                    stackS1.pop();
                }
                else {
                    return false;
                }
            }
            if (s.charAt(i) == '{') {
                if (stackS1.peek() == '}') {
                    stackS1.pop();
                }
                else {
                    return false;
                }
            }
            if (s.charAt(i) == '[') {
                if (stackS1.peek() == ']') {
                    stackS1.pop();
                }
                else {
                    return false;
                }
            }

        }
        if (stackS1.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("()()()"));
        System.out.println(isValid("({)}"));
        System.out.println(isValid("({})"));
        System.out.println(isValid("{"));

    }


}

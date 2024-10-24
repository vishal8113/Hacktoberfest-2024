import java.util.*;

public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;
                if ((ch == ')' && stack.peek() != '(') ||
                    (ch == ']' && stack.peek() != '[') ||
                    (ch == '}' && stack.peek() != '{')) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        if (isValid(s)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

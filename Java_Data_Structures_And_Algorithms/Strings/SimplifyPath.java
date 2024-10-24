import java.util.Stack;

public class SimplifyPath {
    
    public static String simplifyPath(String path) {
        path += "/"; 
        Stack<String> stack = new Stack<>();
        StringBuilder temp = new StringBuilder();
        
        for (int i = 0; i < path.length(); i++) {
            char c = path.charAt(i);
            if (c == '/') {
                if (temp.toString().equals("..")) {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                } else if (!temp.toString().equals(".") && temp.length() > 0) {
                    stack.push(temp.toString());
                }
                temp = new StringBuilder();
            } else {
                temp.append(c);
            }
        }
        
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, "/" + stack.pop());
        }
        
        return result.length() == 0 ? "/" : result.toString();
    }

    public static void main(String[] args) {
        String path = "/home//foo/";
        System.out.println(simplifyPath(path));
    }
}

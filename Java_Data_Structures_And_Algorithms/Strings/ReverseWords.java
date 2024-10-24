import java.util.Stack;

public class ReverseWords {

    public static String reverseWords(String s) {
        Stack<String> st = new Stack<>();
        String word = "";
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (!word.isEmpty()) {
                    st.push(word);
                    word = "";
                }
            } else {
                word += s.charAt(i);
            }
        }
        if (!word.isEmpty()) {
            st.push(word);
        }

        while (!st.isEmpty()) {
            ans.append(st.pop());
            if (!st.isEmpty()) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }
}

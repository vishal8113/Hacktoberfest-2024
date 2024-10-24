import java.util.*;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(List<String> strs) {
        Collections.sort(strs);
        String ans = "";
        String firstElement = strs.get(0);
        String lastElement = strs.get(strs.size() - 1);
        int len = Math.min(firstElement.length(), lastElement.length());
        
        for (int i = 0; i < len; i++) {
            if (firstElement.charAt(i) != lastElement.charAt(i)) {
                return ans;
            }
            ans += firstElement.charAt(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        List<String> v = Arrays.asList("flower", "flow", "flight");
        System.out.println(longestCommonPrefix(v));
    }
}

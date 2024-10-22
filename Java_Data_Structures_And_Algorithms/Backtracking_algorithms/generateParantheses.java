//Problem statement -
//Given n pairs of parentheses, we need to write a function to generate all combinations of well-formed parentheses.

import java.util.ArrayList;
import java.util.List;

public class generateParantheses {

    private static void backtrack(List<String> ans, String curr, int open, int close, int max) {
        if(curr.length() == max*2) {
            ans.add(curr);
            return;
        }
        if(open < max) {
            backtrack(ans, curr + '(', open + 1, close, max);
        }
        if(close < open) {
            backtrack(ans, curr + ')', open, close + 1, max);
        }
    }

    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backtrack(ans, "", 0, 0, n);
        return ans;
    }

    public static void main(String[] args) {
        //Example
        int n = 4;
        System.out.println(generateParenthesis(n));
    }
}
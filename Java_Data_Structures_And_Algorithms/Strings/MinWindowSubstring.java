import java.util.HashMap;

public class MinWindowSubstring {
    
    public static String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();
        
        if (m > n) return "";
        
        HashMap<Character, Integer> orig = new HashMap<>();
        HashMap<Character, Integer> cnt = new HashMap<>();
        
        for (int i = 0; i < m; i++) {
            orig.put(t.charAt(i), orig.getOrDefault(t.charAt(i), 0) + 1);
            cnt.put(t.charAt(i), 0);
        }
        
        int len = orig.size();
        int sz = 0;
        int final_i = -1;
        int final_j = -1;
        int i = 0;
        int j = 0;
        int ans = Integer.MAX_VALUE;
        
        while (j < n) {
            char temp = s.charAt(j);
            if (orig.containsKey(temp)) {
                cnt.put(temp, cnt.get(temp) + 1);
                if (cnt.get(temp).equals(orig.get(temp))) {
                    sz++;
                }

                while (len == sz) {
                    if (j - i + 1 <= ans) {
                        ans = j - i + 1;
                        final_i = i;
                        final_j = j;
                    }
                    if (orig.containsKey(s.charAt(i))) {
                        cnt.put(s.charAt(i), cnt.get(s.charAt(i)) - 1);
                        if (cnt.get(s.charAt(i)) < orig.get(s.charAt(i))) {
                            sz--;
                        }
                    }
                    i++;
                }
            }
            j++;
        }

        if (final_i == -1 || final_j == -1) return "";
        return s.substring(final_i, final_j + 1);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t));  // Output: "BANC"
    }
}

public class ValidNumber {

    public static boolean isNumber(String s) {
        return isValidNumber(s);
    }

    public static boolean isValidNumber(String s) {
        if (s.isEmpty()) return false;

        int i = 0;
        int n = s.length();
        
        if (s.charAt(i) == '+' || s.charAt(i) == '-') i++;

        boolean hasIntegerPart = false;
        while (i < n && Character.isDigit(s.charAt(i))) {
            hasIntegerPart = true;
            i++;
        }

        boolean hasDecimalPart = false;
        if (i < n && s.charAt(i) == '.') {
            i++;
            while (i < n && Character.isDigit(s.charAt(i))) {
                hasDecimalPart = true;
                i++;
            }
        }

        if (i < n && (s.charAt(i) == 'e' || s.charAt(i) == 'E')) {
            i++;
            if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) i++;

            if (i == n || !Character.isDigit(s.charAt(i))) return false;
            while (i < n && Character.isDigit(s.charAt(i))) {
                i++;
            }
        }

        return i == n && (hasIntegerPart || hasDecimalPart);
    }

    public static void main(String[] args) {
        String s1 = "0";
        System.out.println(isNumber(s1)); 
    }
}

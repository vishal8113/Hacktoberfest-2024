public class NumberToWords {

    private static final String[] digitString = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String[] teenString = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] tenString = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private static final String[] bigString = {"Thousand", "Million", "Billion"};

    public static String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }

        String result = numberToWordsHelper(num % 1000);
        num /= 1000;

        for (int i = 0; i < 3; i++) {
            if (num > 0 && num % 1000 > 0) {
                result = numberToWordsHelper(num % 1000) + bigString[i] + " " + result;
            }
            num /= 1000;
        }

        return result.trim();
    }

    private static String numberToWordsHelper(int num) {
        StringBuilder result = new StringBuilder();

        if (num > 99) {
            result.append(digitString[num / 100]).append(" Hundred ");
        }

        num %= 100;
        if (num < 20 && num > 9) {
            result.append(teenString[num - 10]).append(" ");
        } else {
            if (num >= 20) {
                result.append(tenString[num / 10]).append(" ");
            }
            num %= 10;
            if (num > 0) {
                result.append(digitString[num]).append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        int num = 1234567;
        System.out.println(numberToWords(num));  
    }
}


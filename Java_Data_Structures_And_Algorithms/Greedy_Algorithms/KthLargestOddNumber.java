public class KthLargestOddNumber {
    public String largestOddNumber(String num) {
        if (num == null || num.isEmpty()) {
            return ""; 
        }

        for (int i = num.length() - 1; i >= 0; i--) {
            if (Character.getNumericValue(num.charAt(i)) % 2 == 1) {
                return num.substring(0, i + 1); 
            }
        }
        return ""; 
    }

    public static void main(String[] args) {
        KthLargestOddNumber finder = new KthLargestOddNumber();
        String num = "123456789";
        System.out.println("Largest odd number substring: " + finder.largestOddNumber(num)); 
    }
}

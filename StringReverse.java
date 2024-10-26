public class StringReverse {

public static void revstr(String str, int ind) {
        if (ind==0) {
            System.out.print(str.charAt(ind));
            return;
        }
        System.out.print(str.charAt(ind));
        revstr(str, ind-1);
    }
    public static void main(String[] args) {

        String str = "abcd";
        revstr(str, str.length()-1);
    }
}

// time complexity --> O(n)   (string reversing)
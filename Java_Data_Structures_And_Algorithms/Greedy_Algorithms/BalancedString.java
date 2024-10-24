public class BalancedString {
    public int countBalancedStrings(String s) {
        int sum = 0, count = 0;
        for(char c : s.toCharArray()){
            if(c == 'R'){
                count ++;
            }else{
                count--;
            }
            if(count == 0){
                sum +=1;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        BalancedString bs = new BalancedString();
        String s = "RLRRLLRLRL";
        System.out.println(bs.countBalancedStrings(s));  // Output: 4
    }
}

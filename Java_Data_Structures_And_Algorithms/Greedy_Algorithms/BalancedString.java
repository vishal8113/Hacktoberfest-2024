public class BalancedString {
    public int balancedStringSplit(String s) {
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
}

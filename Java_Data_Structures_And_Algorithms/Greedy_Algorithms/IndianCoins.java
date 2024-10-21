import java.util.*;

public class IndianCoins {
    public static void main(String[] args) {
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};
        int N = 590;

        Arrays.sort(coins, Comparator.reverseOrder());

        int count = 0;
        ArrayList<Integer> arr = new ArrayList<>();


        for(int i=0;i<coins.length;i++){
            if(coins[i] <= N){
                while(coins[i] <= N){
                    count++;
                    arr.add(coins[i]);
                    N -= coins[i];
                }
            }
        }
        System.out.println(count);

        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
    }
}

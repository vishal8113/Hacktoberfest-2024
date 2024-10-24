import java.util.*;

public class IndianCoins {
    public static void main(String[] args) {
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};
        int N = 590;

        Arrays.sort(coins, Comparator.reverseOrder());

        int count = 0;
        ArrayList<Integer> usedCoins = new ArrayList<>();


        for(int i=0;i<coins.length;i++){
            if(coins[i] <= N){
                while(coins[i] <= N){
                    count++;
                    usedCoins.add(coins[i]);
                    N -= coins[i];
                }
            }
        }
        System.out.println(count);

        for(int coin : usedCoins){
            System.out.print(coin + " ");
        }
        System.out.println();
    }
}

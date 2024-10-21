import java.util.*;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int val[] = {10, 20, 120};
        int weight[] = {10, 20, 30};
        int W = 50;

        double ratio[][] = new double[val.length][2];
        //0th col -> idx and 1st col -> items ratio

        for(int i=0;i<val.length;i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)weight[i];
        }

        // Sorting is done in ascending order.
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = W;
        int sum = 0;

        for(int i=ratio.length-1;i>=0;i--){
            int idx = (int)ratio[i][0];
            if(capacity >= weight[idx]){ // include all the full items.
                sum += val[idx];
                capacity -= weight[idx];
            }else{
                // include fractional value
                sum += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println(sum); // this sum will print the maximum value
    }
}
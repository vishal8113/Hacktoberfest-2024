package Java_DSA.Problems.Arrays;
import java.util.*;
public class HighestLowestFreqElement
{
//    public static int[] getFrequencies(int[] v) {
//        int ans[] = new int[2];
//
//        Arrays.sort(v);
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < v.length; i++) {
//            if (map.containsKey(v[i])) {
//                map.put(v[i], map.get(v[i]) + 1);
//            } else {
//                map.put(v[i], 1);
//            }
//        }
//
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//
//        int count = 0;
//        for (Map.Entry<Integer, Integer> a : map.entrySet()) {
//            if (a.getValue() == 1) {
//                count++;
//            }
//        }
//
//        if (count == v.length) {
//            ans[0] = v[0];
//            ans[1] = v[0];
//        } else {
//            for (Map.Entry<Integer, Integer> a : map.entrySet()) {
//                if (a.getValue() > max) {
//                    max = a.getValue();
//                }
//                if (a.getValue() < min) {
//                    min = a.getValue();
//                }
//            }
//        }
//
//        for (Map.Entry<Integer, Integer> a : map.entrySet()) {
//            if (a.getValue() == max) {
//                ans[0] = a.getKey();
//                break;
//            }
//        }
//
//        for (Map.Entry<Integer, Integer> a : map.entrySet()) {
//            if (a.getValue() == min) {
//                ans[1] = a.getKey();
//                break;
//            }
//        }
//
//        return ans;
//    }
    public static int[] getFrequencies(int []v) {
        // Write Your Code Here
        List<Integer>v1 = new ArrayList<>();
        for(Integer element:v){
            v1.add(element);
        }
        List<Integer>freq = new ArrayList<>();
        for(int i = 0;i < v1.size();i++){
            freq.add(Collections.frequency(v1,v1.get(i)));
        }
        int maxFreq = Collections.max(freq);
        int minFreq = Collections.min(freq);
        int highFreq = Integer.MAX_VALUE;
        int lowFreq = Integer.MAX_VALUE;
        for(int i = 0;i < freq.size();i++){
            if(maxFreq == freq.get(i)){
                if(v1.get(i) < highFreq)
                    highFreq = v1.get(i);
            }
            if(minFreq == freq.get(i)){
                if(v1.get(i) < lowFreq)
                    lowFreq = v1.get(i);
            }
        }
        int[] ans = new int[2];
        ans[0] = highFreq;
        ans[1] = lowFreq;
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {10,10,10,3,3,3};
        int[] ans = getFrequencies(arr);
        System.out.println(Arrays.toString(ans));
    }
}

import java.util.*;

public class ActivitySelection{
    public static void main(String args[]){
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        //Sorting -> if end is not sorted in the question.
        int activities[][] = new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // Lambda function
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        // given -> end time basis sorted
        int maxActivity = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        //1st activity already added in the ArrayList
        maxActivity = 1;
        arr.add(activities[0][0]);
        int lastEnd = activities[0][2];

        for(int i=1;i<end.length;i++){
            if(activities[i][1] >= lastEnd){
                maxActivity ++;
                arr.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        //printing the maximum activities
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        System.out.println("Maximum Activities are " + maxActivity);
    }
}

// Time complexity will be O(N);
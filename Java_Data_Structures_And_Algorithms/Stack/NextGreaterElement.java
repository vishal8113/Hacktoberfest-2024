//Next Greater Element to the right in Java

import java.util.*;

public class NextGreaterElement {
    public static void main(String args[]){
        int arr[] = {6,8,0,1,3};
        int nextGreater[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();

        for(int i=arr.length-1;i>=0;i--){ //tracking through the index
            //1 while
            while(!s.isEmpty() && arr[s.peek()] <=arr[i]){ 
                s.pop();
            }
            //2 if else
            if(s.isEmpty()){
                nextGreater[i] = -1;
            } else{
                nextGreater[i] = arr[s.peek()]; // s.peek will be the index and arr[s.peek] will be the value stored on that index.
            }
            //3 push in stack
            s.push(i);
        }

        for(int i=0;i<nextGreater.length;i++){
            System.out.println(nextGreater[i]+" ");
        }
        System.out.println();


        //next greater Right
        //next greater left -> for(int i=0;i<=arr.length-1;i++)
        //next smaller right -> while (!s.isEmpty() && arr[s.peek] >= arr[i])
        /*next smaller left ->for(int i=0;i<=arr.length-1;i++)
        while (!s.isEmpty() && arr[s.peek] >= arr[i]) */
    }
}


// Time complexity will be -> O(n); Linear Time complexity
import java.util.ArrayList;
import java.util.*;

public class StackAL{
    static class Stackul{
        static ArrayList<Integer> list = new ArrayList<>();

        // checking the size of the ArrayList
        public static boolean isEmpty(){
            return list.size() == 0; 
        }

        //push 
        public static void push(int data){
            list.add(data);
        }

        //pop
        public static int pop(){
            int top = list.get(list.size()-1); // this will give the last value of the data present in arraylist
            list.remove(list.size()-1); // O(1)
            return top;
        }

        //peak
        public static int peek(){
            return list.get(list.size()-1);
        }
    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
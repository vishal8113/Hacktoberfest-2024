//Push at the Bottom of the Stack
import java.util.*; //collection framework

public class Bottom {
    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop(); // uper jaate time element ko remove krna hai.
        pushAtBottom(s, data);
        s.push(top); //adding the removed element in the stack
    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s, 4);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
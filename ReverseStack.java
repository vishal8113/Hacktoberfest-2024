//Problem Statement -
// Given a stack, you need to reverse it and print its elements.

import java.util.Stack;

public class ReverseStack {
    public static void addAtBottom(int data, Stack<Integer> s) {
        if(s.empty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        addAtBottom(data, s);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s) {
        if(s.empty()) {
            return;
        }
        int top = s.pop();
        reverse(s);
        addAtBottom(top, s);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);

        reverse(s);

        while (!s.empty()) {
            System.out.print(s.peek() + " ");
            s.pop();
        }
    }
}
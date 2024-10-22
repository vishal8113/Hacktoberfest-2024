//Duplicate Parentheses in Java

import java.util.*;

public class DuplicateParentheses {
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            //closing
            if(ch == ')'){
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true; //duplicate exist
                }else{
                    s.pop(); //opening pair ko pop kiya hai
                }
            }else{
                //opening
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String args[]){
        String str = "((a+b))"; // this should return true
        String str2 = "(a-b)"; // this should return false

        System.out.println(isValid(str));
        System.out.println(isValid(str2));
    }
}

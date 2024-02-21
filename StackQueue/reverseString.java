package StackQueue;

import java.util.Stack;

public class reverseString {
    public static void main(String[] args) {
        String str = "Kaush ik";
        System.out.println(reverse(str));
    }
    static  public String reverse(String s){
        String rev = "";
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            stack.push(s.charAt(i));
        }
        while(!stack.isEmpty()){
            rev += stack.pop();
        }
        return rev;
    }
}

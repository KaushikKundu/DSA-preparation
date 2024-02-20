package StackQueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class NextGreater {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(34, 35, 27, 42, 5, 28, 39, 20, 28));
        System.out.println(nextGreater(arr));
    }
    static public ArrayList<Integer> nextGreater(ArrayList<Integer> A) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=A.size() - 1; i>= 0; i--){
            if(stack.size() == 0){
                ans.add(-1);

            }
            else if(stack.size() > 0 && stack.peek() > A.get(i)){
                ans.add(stack.peek());

            }
            else if(stack.size() > 0 && stack.peek() <= A.get(i)){
                while(stack.size() > 0 && stack.peek() <= A.get(i)){
                    stack.pop();   
                }
                if(stack.size() == 0){
                    ans.add(-1);
                }
                else{
                    ans.add(stack.peek());
                }

            }
            stack.push(A.get(i));
        }
        Collections.reverse(ans);
        return ans;
    }
}

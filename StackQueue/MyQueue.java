package StackQueue;

import java.util.Stack;
class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2; 
    public MyQueue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();  
    }
    
    public void push(int x) {
        this.stack1.push(x);
    }
    
    public int pop() {
       while(!this.stack1.isEmpty()){
           this.stack2.push(stack1.pop());
       }
       int value = this.stack2.pop();
       while(!this.stack2.isEmpty()){
           this.stack1.push(this.stack2.pop());
       }
       return value;
    }
    
    public int peek() {
        while(!this.stack1.isEmpty()){
            this.stack2.push(this.stack1.pop());
        }
        int value = this.stack2.peek();
        while(!this.stack2.isEmpty()){
           this.stack1.push(this.stack2.pop());
       }
       return value;
        
    }
    
    public boolean empty() {
        return this.stack1.isEmpty();
        
    }
}
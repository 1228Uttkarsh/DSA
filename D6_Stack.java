package com.company;
//Implementation of stack using an array
class Stack{
    public final int max = 1000;
    int top;
    int a[] =new int[max];
    boolean isEmpty(){
        return (top<0);
    }
     Stack(){
        top=-1;
    }
    boolean push(int x){
        if(top>=(max-1)){
            System.out.println("Stack overflow");
            return false;
        }
        else{
            a[++top]=x;
            System.out.println(x+"Pushed into the stack");
            return true;
        }
    }
    int pop(){
        if(top<0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = a[top--];
            return x;
        }
    }
    int peek(){
        if(top<0){
            System.out.println("Stack Underflow");
            return 0;

        }
        else{
            int x = a[top];
            return x;
        }
    }
    void print(){
        for(int i=top;i> -1;i--){
            System.out.println(" "+a[i]);
        }
    }
}
public class D6_Stack {
    public static void main(String[] args) {
Stack s = new Stack();
s.push(12);
s.push(28);
s.push(30);
s.push(39);
s.push(58);
        System.out.println(s.pop()+ " Popped from stack");
        System.out.println("Top element is:"+s.peek());
        System.out.println("Elements present in Stack are");
        s.print();

    }
}

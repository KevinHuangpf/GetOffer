package com.kevinhuang.getoffer;

import java.util.Stack;

public class No20StackMin {
    public static void main(String args[]){
        push(6);
        push(2);
        push(3);
        push(1);
        System.out.println(min());

        pop();

        System.out.println(min());
        System.out.println(top());


    }

    static Stack<Integer> dataStack =new Stack<>();
    static Stack<Integer> minStack = new Stack<>();


    public static void push(int node) {
        dataStack.push(node);
        if(minStack.isEmpty()||minStack.peek()>=node)
            minStack.push(node);
        else
            minStack.push(minStack.peek());

    }

    public static void pop() {
        dataStack.pop();
        minStack.pop();

    }

    public static int top() {
        return dataStack.peek();


    }

    public static int min() {
        return minStack.peek();

    }

}


/*
用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
package com.kevinhuang.getoffer;
import java.util.Scanner;
import java.util.Stack;

public class No5QueueWithTwoStacks {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	
	
	public static void main(String args[]){
		No5QueueWithTwoStacks queueStacks = new No5QueueWithTwoStacks();
		Scanner sc = new Scanner(System.in);

		System.out.println("Input and queue(end with “end”):");		

		while(true){
			if(sc.hasNextInt())
			queueStacks.push(sc.nextInt());
			//queueStacks.pop();
			else if((sc.nextLine()).equals("end"))
				break;			
		}		
		sc.close();
		
		System.out.println("pop start:");
		

		if(queueStacks.empty())
			System.out.println("  Nothing!");
		else{
			while(!queueStacks.empty()){
			System.out.println(queueStacks.pop());
		}
		}
			
	}
	

	public boolean empty(){
		if(stack1.empty()&&stack2.empty())
			return true ;
		else
			return false;
	}
	
	public void push(int node){
		stack1.push(node);
		
	}
	
	public int pop(){
		if(stack1.empty()&&stack2.empty()){
			throw new RuntimeException("Queue is empty!");
		}
		
		if(stack2.empty()){
			do{
				stack2.push(stack1.pop());
				
			}while(!stack1.empty());
			
		}		
		 return stack2.pop();
	}
	
}

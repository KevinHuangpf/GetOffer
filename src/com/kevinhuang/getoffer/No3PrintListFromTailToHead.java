
/**
* Copyright (C), xxx.
* FileName: PrintListFromTailToHead.java
* @Description: 输入一个链表，从尾到头打印链表每个节点的值。
* @author KH
* @Date    20180312
* @version 1.00
*/

package com.kevinhuang.getoffer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;


public class No3PrintListFromTailToHead {
    public static class ListNode {
        int val;
        ListNode next = null;

       ListNode(int val) {
           this.val = val;
      }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        for (int i = 0; i < args.length; i++) {  
            System.out.println(args[i]);  
        } 
		System.out.println("input: ");
          
		    ListNode node1=new ListNode(1);
	        ListNode node2=new ListNode(2);
	        ListNode node3=new ListNode(3);

	        node1.next=node2;
	        node2.next=node3;
	        
	        System.out.println(node1.val+""+node2.val+""+node3.val);  
	        

	        System.out.println("1、利用一个stack: ");
	        ArrayList<Integer> list =new ArrayList<Integer>(printListFromTailToHeadByStack(node1));
	        for (int i = 0; i < list.size(); i++) {  
	            System.out.print(list.get(i)+" ");  
	        } 
	        
	        System.out.println("");  
	        System.out.println("2、利用递归:");  
	        for(int i:printListFromTailToHead1(node2))
	        {
	        	System.out.print(i+" ");
	        }
	        
	        
	        System.out.println("" );
	        System.out.println("3、利用ArrayList倒序输出" );
	        printListFromTailToHead2(node3);
	        
	        
/*	        Iterator<Integer> it = list.iterator();
	        
	        while(it.hasNext())
	        {
	        	System.out.println(it.next());
	        }*/
	
		 
		 
	}
	

	
	
	//1:递归法打印

    static ArrayList<Integer> arrayList=new ArrayList<Integer>();
	public static ArrayList<Integer> printListFromTailToHead1(ListNode node)
	{

		 if(node!=null){
	     	    printListFromTailToHead1(node.next);
	            arrayList.add(node.val);
	        }
		return arrayList;
	}
	
	
	// 2：通过使用栈的方法，进行pop及push
	public static ArrayList<Integer> printListFromTailToHeadByStack(ListNode node)
	{
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		while(node != null)
		{
			stack.push(node.val);
			node=node.next;
		}
		while(!stack.isEmpty())
		{
			arrayList.add(stack.pop());
		}
		return arrayList;
		
	}
	
	
	//3：利用Arraylist，先倒进去然后逆序输出
	public static void  printListFromTailToHead2(ListNode node)
	{
		if(node==null)
			System.out.println("Null");
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(node!=null)
		{
			list.add(node.val);
			node = node.next;
		}
		
		for(int i=list.size()-1;i>=0;i--)
		{
			System.out.print(list.get(i)+" ");
		}
		
	}

}

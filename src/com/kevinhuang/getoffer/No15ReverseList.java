package com.kevinhuang.getoffer;


import java.util.Stack;

public class No15ReverseList {

    public static class ListNode{
        int val;
        ListNode next=null;

        ListNode(int val,ListNode next){
            this.val=val;
            this.next=next;

        }
    }


    public static void main(String args[]){

        ListNode node4 = new ListNode(4,null);
        ListNode node3 = new ListNode(3,node4);
        ListNode node2 = new ListNode(2,node3);
        ListNode node1 = new ListNode(1,node2);

        ListNode reverseList = reverseList1(node1);

        while(reverseList!=null){
            System.out.print(reverseList.val+" ");
            reverseList =reverseList.next;
        }

    }

    public static ListNode reverseList(ListNode head){
        if(head==null){
            throw new RuntimeException("error");
        }

        Stack<ListNode> stack = new Stack<ListNode>();


        while(head!=null){
            stack.push(head);
            head=head.next;

        }

        ListNode newhead=stack.pop();
        ListNode outListNode = newhead;

        while(!stack.isEmpty()){
            newhead.next=stack.pop();
            newhead=newhead.next;
        }

        newhead.next=null;
        return outListNode;

    }

    //推荐算法
    public static ListNode reverseList1(ListNode head){
        if(head==null){
            throw new RuntimeException("error");
        }
        ListNode pre =null;
        ListNode next =null;

        while(head!=null){
            next=head.next;
            head.next=pre;
            pre=head;
            head=next;
        }
        return pre;
    }


}

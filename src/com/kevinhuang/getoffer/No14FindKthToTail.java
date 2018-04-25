package com.kevinhuang.getoffer;


import java.util.Stack;





public class No14FindKthToTail {

    public static class ListNode{
        int val;
        ListNode next=null;

        ListNode(int val,ListNode next){
            this.val=val;
            this.next=next;

        }
    }

    public static void main(String args[]){

        // 1->2->3->4
        ListNode node3 = new ListNode(4,null);
        ListNode node2 = new ListNode(3,node3);
        ListNode node1 = new ListNode(2,node2);
        ListNode head = new ListNode(1,node1);

        ListNode find = findKthToTail1(head, 5);
        System.out.println("Kth: " + find.val);

    }


    public static ListNode findKthToTail(ListNode head,int k){
        if(head==null||k<0)
            throw new RuntimeException("error");
        ListNode ahead = head;
        ListNode behind =head;


        for(int i=1;i<k;i++){
            if(ahead.next!=null)
                ahead=ahead.next;
            else
                throw new RuntimeException("error");

        }


        while(ahead.next!=null){
            ahead=ahead.next;
            behind=behind.next;
        }
        return behind;

    }


    public static ListNode findKthToTail1(ListNode head, int k){
        if(head==null||k<0){
            throw new RuntimeException("error");
        }

        Stack<ListNode> stack = new Stack<ListNode>();

        while(head!=null){
            stack.push(head);
            head=head.next;
        }

        ListNode outListNode = null;
        for(int i=0;i<k;i++) {
            if(stack.isEmpty())
                throw new RuntimeException("error");
            outListNode = stack.pop();
        }
        return outListNode;

    }




}

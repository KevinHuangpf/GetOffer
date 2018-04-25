package com.kevinhuang.getoffer;

public class No16Merge {

    public static class ListNode{
        int val;
        ListNode next=null;

        public ListNode(int val,ListNode next){
            this.val=val;
            this.next=next;

        }
    }

    public static void main(String args[]){

        ListNode nodeA4 = new ListNode(7,null);
        ListNode nodeA3 = new ListNode(5,nodeA4);
        ListNode nodeA2 = new ListNode(3,nodeA3);
        ListNode nodeA1 = new ListNode(1,nodeA2);

        ListNode nodeB4 = new ListNode(8,null);
        ListNode nodeB3 = new ListNode(6,nodeB4);
        ListNode nodeB2 = new ListNode(4,nodeB3);
        ListNode nodeB1 = new ListNode(2,nodeB2);

        ListNode List = merge1(nodeB1,nodeA1);

        while(List!=null){
            System.out.print(List.val+" ");
            List =List.next;
        }

    }

    public static ListNode merge(ListNode list1,ListNode list2){
        if(list1==null)
            return list2;
        else if(list2==null)
            return list1;

        if(list1.val<=list2.val){
            //领头的是list1，所以继续往下
            list1.next=merge(list1.next,list2);
            return list1;
        }else{
            list2.next=merge(list1,list2.next);
            return list2;
        }
    }


    public static ListNode merge1(ListNode list1,ListNode list2){
        if(list1==null)
            return list2;
        else if(list2==null)
            return list1;

        ListNode mergeHead =null;
        ListNode current= null;
        while(list1!=null&&list2!=null){
            if(list1.val<=list2.val){
                if(mergeHead==null){
                    mergeHead=current=list1;

                }else{
                    current.next=list1;
                    current=current.next;

                }
                list1=list1.next;

            }else{
                if(mergeHead==null){
                    mergeHead=current=list2;

                }else{
                    current.next=list2;
                    current=current.next;
                }
                list2=list2.next;

            }
        }
        if(list1==null){
            current.next=list2;
        }else{
            current.next=list1;
        }
        return mergeHead;


    }



}

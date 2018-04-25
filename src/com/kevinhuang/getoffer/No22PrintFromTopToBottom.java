package com.kevinhuang.getoffer;

/** 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
add        增加一个元索                     如果队列已满，则抛出一个IIIegaISlabEepeplian异常
remove   移除并返回队列头部的元素    如果队列为空，则抛出一个NoSuchElementException异常
element  返回队列头部的元素             如果队列为空，则抛出一个NoSuchElementException异常
offer       添加一个元素并返回true       如果队列已满，则返回false
poll         移除并返问队列头部的元素    如果队列为空，则返回null
peek       返回队列头部的元素             如果队列为空，则返回null
put         添加一个元素                      如果队列满，则阻塞
take        移除并返回队列头部的元素
*/


public class No22PrintFromTopToBottom {

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public static void main(String args[]){

        //        1-8
        //      2-6    3-10
        //    4-5  5-7  6-9  7-11
        TreeNode node1=new TreeNode(8);
        TreeNode node2=new TreeNode(6);
        TreeNode node3=new TreeNode(10);
        TreeNode node4=new TreeNode(5);
        TreeNode node5=new TreeNode(7);
        TreeNode node6=new TreeNode(9);
        TreeNode node7=new TreeNode(11);

        node1.left=node2;
        node1.right=node3;


        node2.left=node4;
        node2.right=node5;

        node3.left=node6;
        node3.right=node7;

//        node4.left=null;
//        node4.right=null;
//
//        node5.left=null;
//        node5.right=null;
//
//        node6.left=null;
//        node6.right=null;
//
//        node7.left=null;
//        node7.right=null;


        for(int i:printFromTopToBottom(node1)){
            System.out.print(i+" ");
        }


    }


    public static ArrayList<Integer> printFromTopToBottom(TreeNode root){

        ArrayList<Integer> list = new ArrayList<>();

        if(root==null){
            return list;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            TreeNode treeNode = queue.poll();
            if(treeNode.left!=null){
                queue.offer(treeNode.left);
            }

            if(treeNode.right!=null)
                queue.offer(treeNode.right);

            list.add(treeNode.val);

        }
        return list;

    }



}

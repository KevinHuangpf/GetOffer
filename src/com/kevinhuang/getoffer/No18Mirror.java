/*
操作给定的二叉树，将其变换为源二叉树的镜像。
*/

package com.kevinhuang.getoffer;

import java.util.Stack;

public class No18Mirror {


    public static class TreeNode {
        int val;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

    public static void main(String args[]){

    //        1
    //      2    3
    //    4  5  6  7
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



        printTreeNode(node1);

        mirror1(node1);
        System.out.println();
        printTreeNode(node1);

    }



    public static void printTreeNode(TreeNode root){
        if(root!=null) {
            System.out.print(root.val+" ");
            printTreeNode(root.left);
            printTreeNode(root.right);
        }
    }


    //方法1
    public static void mirror(TreeNode root){
        if(root==null) return;

        //左右交换
        TreeNode temp = root.left;
        root.left=root.right;
        root.right=temp;

        mirror(root.left);
        mirror(root.right);

    }

    //方法2
    public static void mirror1(TreeNode root){
        if(root==null) return;

        Stack<TreeNode> stack = new Stack<TreeNode>();

        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if(node.left != null || node.right != null) {

                TreeNode temp = node.left;
                node.left = node.right;
                node.right = temp;
            }

            if (node.left != null) {
                stack.push(node.left);
            }

            if (node.right != null) {
                stack.push(node.right);
            }

        }



    }





}

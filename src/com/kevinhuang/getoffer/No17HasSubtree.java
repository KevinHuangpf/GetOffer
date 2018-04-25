package com.kevinhuang.getoffer;
/*
输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */
public class No17HasSubtree {
    public static class TreeNode {
        int val ;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

        public TreeNode(int val,TreeNode left,TreeNode right) {
            this.val = val;
            this.left=left;
            this.right=right;

        }
}


    public static void main(String args[]){


        // 构造二叉树
        //     1
        //   /  \
        //  2    3
        // /    / \
        // 4    5  7
        // \   /
        //  6  8

        TreeNode root1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);

        root1.left = node2;
        root1.right = node3;
        node2.left = node4;
        node3.left = node5;
        node3.right = node7;
        node5.right = node6;
        node7.left = node8;


        TreeNode node51 = new TreeNode(5,null,null);
        TreeNode node71 =new TreeNode(7,null,null);
        TreeNode root2 =new TreeNode(3,node51,node71);


        System.out.print(hasSubtree(root1,root2));


    }

    public static boolean hasSubtree(TreeNode root1,TreeNode root2){
        boolean result=false;
        if(root2!=null&&root1!=null){
            if(root1.val==root2.val){
                result = doesTree1HaveTree2(root1,root2);
            }

            if(!result){
                result= hasSubtree(root1.left,root2);
            }
            if(!result){
                result=hasSubtree(root1.right,root2);
            }
        }
        return result;

    }

    public static boolean doesTree1HaveTree2(TreeNode node1,TreeNode node2){
        if(node2==null) return true;

        if(node1==null) return false;

        if(node1.val!=node2.val) return false;

        return doesTree1HaveTree2(node1.left,node2.left)&&doesTree1HaveTree2(node1.right,node2.right);
    }



}


/**
 * ��ָoffer������6���ع�������
 * ��Ŀ������ĳ��������ǰ���������������Ľ�������ؽ����ö����������������ǰ������������������ж������ظ������֡�
 * ��������ǰ���������{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}�����ؽ�����ͼ�Ķ�������������ĸ��ڵ㡣
 *                     1
 *                   /   \
 *                  2     3
 *                 /     / \
 *                4     5   6
 *                 \        /
 *                 7        8
 * @author GL
 *
 */
package com.kevinhuang.getoffer;

import java.util.Scanner;

public class No4ReConstructBinaryTree {
	

    public static void main(String[] args) {
        
//        int[] preOrder={1,2,4,7,3,5,6,8};
//        int[] inOrder={4,7,2,1,5,3,8,6};
        
        System.out.println("Input preOrder: ");
        
        Scanner sc = new Scanner(System.in);
        
        int preNum = sc.nextInt();      
        int[] preOrder = new int[preNum];
        

        int i =0;
        while(sc.hasNext()){ 

        	preOrder[i++] = sc.nextInt();
        	if(i==preOrder.length)
        		break;
        	
        }
        
        
        System.out.println("Input inOrder: ");
        int inNum = sc.nextInt();
        
        int m = 0;
        int[] inOrder = new int[inNum];
        while(sc.hasNext()){
        	inOrder[m++] = sc.nextInt();
        	if(m == inOrder.length)
        		break;
        }
        
        sc.close();
/*        Input preOrder and inOrder: 
        	8
        	1 2 4 7 3 5 6 8
        	Input inOrder: 
        	8
        	4 7 2 1 5 3 8 6
        	*/
        System.out.println("PreOrder: ");   
        for(int iPrint:preOrder){
        	System.out.print(iPrint+" ");
        }
        System.out.println();   
        System.out.println("InOrder: ");   
        for(int iPrint:inOrder){
        	System.out.print(iPrint+" ");
        }	
        
        System.out.println();   
        System.out.println("Reconstruct: ");     
        TreeNode node1=reConstructBinaryTreeA(preOrder,inOrder);
        TreeNode node2=reConstructBinaryTreeB(preOrder,inOrder);
        
        printTree(node1);
        System.out.println();
        printTree(node2);

    
  }   
//    �������ڵ�
     public static class TreeNode {
    	     int val;
    	     TreeNode left;
    	     TreeNode right;
    	     TreeNode(int x) { val = x; }
    	  }
    
    
/*    public static void printTree(TreeNode node){
        if(node!=null){

            printTree(node.left);
            printTree(node.right);
            System.out.print(node.val+" ");
        }
    }*/
    public static void printTree(TreeNode node){
    	if(node!=null){
    		System.out.print(node.val+" ");
    		printTree(node.left);
    		printTree(node.right);
    		
    	}
    } 
    /**
     * �ж�����Ϸ���
     * @param preOrder
     * @param inOrder
     * @return
     */
    
    
    public static TreeNode reConstructBinaryTreeA(int[] pre, int[] in){
    	return reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
    }
    
    public static TreeNode reConstructBinaryTree(int[] pre,int preStart,int preEnd,int[] in,int inStart,int inEnd){
    	if(preStart>preEnd||inStart>inEnd){
    		return null;
    	}
    	TreeNode root = new TreeNode(pre[preStart]);
    	
    	for(int i=inStart;i<=inEnd;i++){
    		if(in[i]==pre[preStart]){
    			root.left=reConstructBinaryTree(pre,preStart+1,preStart+i-inStart,in,inStart,i-1);
    			root.right=reConstructBinaryTree(pre,preStart+(i-inStart)+1,preEnd,in,i+1,inEnd);
    			break;
    		}
    		
    	}
    	return root;
    	
    }
    
    
    
    
    
/*	  public static TreeNode reConstructBinaryTreeA(int [] pre,int [] in) {
		    TreeNode root=reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
		    return root;
		  }
	  
	//    	  ǰ�����{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}
	  private static TreeNode reConstructBinaryTree(int[] pre,int startPre,int endPre,int[] in,int startIn,int endIn) {
		    if(startPre>endPre||startIn>endIn)
		      return null;
		    
		    TreeNode root=new TreeNode(pre[startPre]);
		   
		    for(int i=startIn;i<=endIn;i++){
		      if(in[i]==pre[startPre]){
		        root.left=reConstructBinaryTree(pre,startPre+1,startPre+i-startIn,in,startIn,i-1);
		        root.right=reConstructBinaryTree(pre,i-startIn+startPre+1,endPre,in,i+1,endIn);
		           break;
		      } 
		    }
		    return root;
		 
	  }*/
      
      

	  public static TreeNode reConstructBinaryTreeB(int[] pre,int[] in) {
	          int i=0;
	          if(pre.length==0||in.length==0)
	              return null;
	          
	          TreeNode root = new TreeNode(pre[0]);
	          while(in[i]!=root.val)
	              i++;
	          int[] preLeft = new int[i];
	          int[] inLeft = new int[i];
	          int[] preRight = new int[pre.length-i-1];
	          int[] inRight = new int[in.length-i-1];
	          for(int j = 0;j<in.length;j++) {
	              if(j<i) {
	                  preLeft[j] = pre[j+1];
	                  inLeft[j] = in[j];
	              } else if(j>i) {
	                  preRight[j-i-1] = pre[j];
	                  inRight[j-i-1] = in[j];
	              }
	          }
	          root.left = reConstructBinaryTreeB(preLeft,inLeft);
	          root.right = reConstructBinaryTreeB(preRight,inRight);
	          return root;
	      }
      
      

}


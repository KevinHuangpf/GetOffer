/*
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
*/
package com.kevinhuang.getoffer;

import java.util.Scanner;

public class No9JumpFloorII {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		System.out.println(JumpFloorII(n));
		}
	
	public static int JumpFloorII(int target){		
		if(target<=1)
			return target;
		else
			return 2 * JumpFloorII(target - 1);
		
	} 
}

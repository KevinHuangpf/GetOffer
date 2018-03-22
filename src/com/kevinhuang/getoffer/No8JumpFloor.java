/*
一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
*/
package com.kevinhuang.getoffer;

import java.util.Scanner;

public class No8JumpFloor {
		public static void main(String args[]){
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			in.close();
			System.out.println(jumpFloor(n));

		}
	
	
	public static int jumpFloor(int n){		
		if(n<=2)
			return n;
		int fbncOne=1,fbncTwo=2;
		int fbncN = 0;
		for(int i=3;i<=n;i++){
			fbncN=fbncOne+fbncTwo;
			fbncOne = fbncTwo;
			fbncTwo = fbncN;			
		}
		return fbncN;
		
	} 
}

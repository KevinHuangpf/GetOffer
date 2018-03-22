/*
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
n<=39
*/
package com.kevinhuang.getoffer;

import java.util.Scanner;

public class No7Fibonacci {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		System.out.println(fibonacci2(n));

	}
	
	//迭代
	public static int fibonacci1(int n){
		return n<=1?n:fibonacci1(n-1)+fibonacci1(n-2);
	} 
	
	public static int fibonacci2(int n){		
		if(n<=1)
			return n;
		int fbncOne=0,fbncTwo=1;
		int fbncN = 0;
		for(int i=2;i<=n;i++){
			fbncN=fbncOne+fbncTwo;
			fbncOne = fbncTwo;
			fbncTwo = fbncN;			
		}
		return fbncN;
		
	} 
	
	

}

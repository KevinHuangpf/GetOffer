/*
 * ��Ҷ�֪��쳲��������У�����Ҫ������һ������n���������쳲��������еĵ�n�
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
	
	//����
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

/*
 * ����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��
*/
package com.kevinhuang.getoffer;

import java.util.Scanner;

public class No11NumberOf1 {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		System.out.println(NumberOf1(n));
		}
	public static int NumberOf1(int n) {
		int count=0;
		while(n!=0){			
			count++;
			n = n&(n-1);			
		}
		return count;			
	}
}

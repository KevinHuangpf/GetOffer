/*
 * ���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
*/
package com.kevinhuang.getoffer;

import java.util.Scanner;

public class No10RectCover {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		System.out.println(rectCover(n));
		}
	public static int rectCover(int target) {
		if(target<=2)
			return target;
		else 
			return rectCover(target-1)+rectCover(target-2);		
				
	}
	

}

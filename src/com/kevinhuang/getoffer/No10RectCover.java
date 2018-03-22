/*
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
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

/*
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n���������������һ��n����̨���ܹ��ж�����������
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

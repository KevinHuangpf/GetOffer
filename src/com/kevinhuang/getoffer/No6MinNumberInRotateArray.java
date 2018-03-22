package com.kevinhuang.getoffer;

import java.util.Scanner;
public class No6MinNumberInRotateArray {
	
	public static void main(String args[]){
		Scanner in =new Scanner(System.in);
		
		int n = in.nextInt();
		int[] array = new int[n];				
		int m=0;
		while(in.hasNext()){
			array[m++]=in.nextInt();
			if(m==array.length)
				break;
		}		
		
		System.out.println(minNumberInRotateArray(array));
	}
	
	public static int minNumberInRotateArray(int[] array){
		int low=0, high =array.length-1;
		while(low<high){
			int mid = low+ (high-low)/2;
			
			if(array[mid]>array[high]) 
				low = mid +1;
			else if(array[mid]==array[high])
				high =high -1;
			else 
				high = mid;
			
		}
		return array[low];
	}
	
	
	
	

}

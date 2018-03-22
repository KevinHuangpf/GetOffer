package com.kevinhuang.getoffer;

import java.util.Scanner;

public class No12Power {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int base = in.nextInt();
		int exp = in.nextInt();
		in.close();
		System.out.println(power2(base,exp));
		}
	
	public static double power1(double base,int exp){		
		double result=1;		
		//exp 绝对值
		int expAbs = exp>=0?exp:-exp;
		
		for(int i =1;i<=expAbs;i++){
			result *= base;
		}
		return exp>=0?result:1/result;				
	}
	


	 public static double power2(double base, int exponent) {
	        int n=Math.abs(exponent);
	        if(base==0&&exponent<0)
	        	throw new RuntimeException("分母不能为0");        
	        if(n==0)
	            return 1;
	        if(n==1)
	            return base;
	        double  result=power2(base,n>>1);
	        result*=result;
	        if((n&1)==1)
	            result*=base;
	        if(exponent<0)
	            result=1/result;
	        return result;            
	  }
	
	
}

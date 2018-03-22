package com.kevinhuang.getoffer;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int []nn=new int[n];
        	
	        for(int i=0;i<nn.length;i++)
	        {
	            nn[i]=input.nextInt();
	        }
        System.out.println("Êý×éÊÇ£º");
        System.out.print("{");
        for(int j=0;j<nn.length;j++)
        {
            System.out.print(nn[j]+" ");
        }
        System.out.print("}");
 
    }
}

/**
* Copyright (C), xxx.
* FileName: ReplaceSpace.java
* @Description: ʵ��һ����������һ���ַ����еĿո��滻�ɡ�%20��
* @author KH
* @Date    20180312
* @version 1.00
*/


package com.kevinhuang.getoffer;

import java.util.Scanner;

public class No2ReplaceSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Input string:");
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
       
        StringBuffer  stringBuf = new StringBuffer(string); 
        System.out.println(replaceStringA(stringBuf));
        System.out.println(replaceStringB(stringBuf));
        System.out.println(replaceStringC(stringBuf));
	}
	
	
	
	//1��ֱ�ӵ��õĵײ��
	public static String replaceStringA(StringBuffer  str)
	{
		return str.toString().replaceAll(" ", "%20");
	}
	
	
	//2������StringBuffer ������ʹ��һЩ�ռ�
	
	public static String  replaceStringB(StringBuffer str)
	{
		char[] strChar = str.toString().toCharArray();
		StringBuffer strOut = new StringBuffer();
		for(int i=0;i<strChar.length;i++)
		{
			if(strChar[i]==' ')
				strOut.append("%20");
			else
				strOut.append(strChar[i]);
			
		}
		return strOut.toString();
		
	}
	//3����д�ƶ����Ӻ���ǰ��Ч�ʽϸ�
	public static String  replaceStringC(StringBuffer str)
	{
		int spaceNum = 0;
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)==' ')
				spaceNum++;
		}
		System.out.println(spaceNum);
		int indexOld=str.length()-1;
		int newLength = str.length()+spaceNum*2;
		int indexNew = newLength - 1;
		str.setLength(newLength);
		for(;indexOld>=0&& indexOld<newLength;--indexOld)
		{
			if(str.charAt(indexOld)==' ')
			{
				str.setCharAt(indexNew--, '0');
				str.setCharAt(indexNew--, '2');
				str.setCharAt(indexNew--, '%');
			}
			else
			{
				str.setCharAt(indexNew--,str.charAt(indexOld));
			}
		}
		return str.toString();
				
	}

	
//tail	
}

package com.kevinhuang.getoffer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Scanner;

public class No50Duplicate {


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int[] array = new int[str.length];
        for(int i =0;i<str.length;i++){
            array[i] = Integer.parseInt(str[i]);
        }
        int[] duplicateOut= new int[array.length];
        System.out.println("have?: " + duplicate1(array,array.length,duplicateOut));

        System.out.print(duplicateOut[0]);


    }
    //方法1
    public static boolean duplicate(int numbers[],int length, int[] duplication){
       HashSet<Integer> hs = new HashSet<>();
        for(int i =0;i<length;i++){
            if(!hs.add(numbers[i])){ //存在数字
                duplication[0]=numbers[i];
                return true;
            }
        }

        return  false;

    }

    //方法2
    public static boolean duplicate1(int numbers[],int length, int[] duplication){

        boolean[] k = new boolean[length];
        for(int i=0;i<length;i++){
            if(k[numbers[i]]==true){
                duplication[0]=numbers[i];
                return true;
            }
            k[numbers[i]]=true;
        }
        return false;

    }

}

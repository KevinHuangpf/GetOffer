/*
输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */

package com.kevinhuang.getoffer;

import java.util.Scanner;

public class No13ReOrderArray {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String array = scanner.nextLine();
        String[] arr = array.split("\\s");

        int[] arrInt = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arrInt[i]= Integer.parseInt(arr[i]);
        }

        reOrderArray3(arrInt);

        for(int ss : arrInt){
            System.out.print(ss+" ");
        }

    }

    public static void reOrderArray(int [] array) {

        for(int i=0;i<array.length;i++){
            for(int j = array.length - 1; j>i;j--){
                if(array[j]%2==1&&array[j-1]%2==0){
                    int temp= array[j];
                    array[j] =array[j-1];
                    array[j-1] =temp;

                }

            }

            for(int ss : array){
                System.out.print(ss+" ");

            }
            System.out.println();
        }

    }

//时间O（n2）空间O（1）
    public static void reOrderArray2(int [] array){

        for(int i=0;i<array.length-1;i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] % 2 == 0 && array[j + 1] % 2 == 1) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

            }
            for (int ss : array) {
                System.out.print(ss + " ");

            }
            System.out.println();
        }
    }


    //时间O（n）空间O（）
    public static void reOrderArray3(int [] array){

        int oddCount=0,oddBegin=0;
        int[] newArray = new int[array.length];

        for(int i:array){
            if(i%2==1) oddCount++;
        }

        for(int i:array){

            if(i%2==1) newArray[oddBegin++]=i;
            else newArray[oddCount++]=i;
        }

        int j=0;
        for(int i:newArray){
            array[j++]=i;
        }


    }


}

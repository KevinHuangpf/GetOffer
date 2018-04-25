package com.kevinhuang.getoffer;

import java.util.ArrayList;

public class No19PrintMatrix {


    public static void main(String agrs[]){

        int[][] matrix={
                {1,2},
                {3,4},

        };

        ArrayList<Integer> List = printMatrix(matrix);
        for(int s: List){
            System.out.print(s+" ");
        }

    }



    static ArrayList list = new ArrayList();
    //循环打印圈
    public static ArrayList<Integer> printMatrix(int[][] matrix) {

        int rows=matrix.length;
        int colums = matrix[0].length;

        int start =0;
        while (rows>start *2&&colums > start *2){
            printMatrixInCircle(matrix,rows,colums,start);
            start++;
        }
        return list;

    }

    public static void printMatrixInCircle(int[][] matrix, int rows, int columns, int start){

        //打印上行
        for(int i=start;i<columns -start;i++)
            list.add(matrix[start][i]);
        //打印右边
        for(int j=start+1;j<rows-start;j++)
            list.add(matrix[j][columns-start-1]);

        //打印下边
        for(int m = columns-start-2;m>=start&&rows-start-1>start;m--)
            list.add(matrix[rows-start-1][m]);

        //打印左边
        for(int n =rows -start-2;n>=start+1&&columns-start-1>start;n--)
            list.add(matrix[n][start]);

    }

    //循环输出一圈

}

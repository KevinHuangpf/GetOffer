package com.kevinhuang.getoffer;

import java.util.Scanner;
import java.util.Stack;

public class No21IsPopOrder {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] pushASc =sc.nextLine().split(" ");
        String[] popASc = sc.nextLine().split(" ");
        sc.close();

        int[] pushA = new int[pushASc.length];
        int[] popA = new int[popASc.length];
        for(int i=0;i<pushASc.length;i++){
            pushA[i]=Integer.parseInt(pushASc[i]);
            popA[i]=Integer.parseInt(popASc[i]);
        }

        System.out.println(isPopOrder(pushA,popA));
    }


    public static boolean isPopOrder(int[] pushA,int[] popA){

        if(pushA.length==0||popA.length==0)
            return false;
        Stack<Integer> stack= new Stack<>();
        int popIndex =0 ;
        for(int i=0;i<pushA.length;i++){
            stack.push(pushA[i]);
            while(!stack.isEmpty()&&stack.peek()==popA[popIndex]){
                stack.pop();
                popIndex++;
            }
        }
        return stack.empty();
    }
}
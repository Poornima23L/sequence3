package com.tgt.ignite.plus;

import java.util.Scanner;

public class seq3 {
    public static void main(String[] args){
        int i ,n;
        Scanner read = new Scanner(System.in);
        System.out.println("enter number");
        n= read.nextInt();
        for(i=1;i<=n;i++){
            System.out.print(Math.pow(i,i)+" ");
        }
    }
}

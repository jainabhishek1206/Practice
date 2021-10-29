package com.practice;

public class Test {
    public static void main(String[] args) {
        int moves [][] = new int[3][3];
        //print an array
        for(int i=0;i< moves.length;i++) {
            for(int j=0;j< moves.length;j++) {
                System.out.print(" "+moves[i][j]);
            }
            System.out.println();
        }
    }
}

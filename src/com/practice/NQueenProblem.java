package com.practice;

public class NQueenProblem {
    private static int lenghtOfMatrix = 4;
    public static void main(String[] args) {
        System.out.println("Solution is ->" );
        int [][] ans = solution(new int[lenghtOfMatrix][lenghtOfMatrix],0);

        for(int i=0;i<lenghtOfMatrix;i++) {
            for(int j=0;j<lenghtOfMatrix;j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }

    private static int[][] solution (int [][] matrix, int i) {
        if( i >= lenghtOfMatrix) return matrix;

        for(int j=0;j<lenghtOfMatrix;j++) {
            if(isSafe(matrix,i,j)) {
                matrix[i][j] = 1;
                solution(matrix,i+1);
                matrix[i][j] = 0;
            }
        }
        return null;
    }

    private static boolean isSafe(int[][] matrix, int row, int col) {

        for(int i=0;i<lenghtOfMatrix;i++) {
            //check for particular row
            if(matrix[row][i] == 1)
                return false;

            //check for particular column
            if(matrix[i][col] == 1)
                return false;

            //check for upper left diagnoal
            if(row-i>=0 && col-i>=0) {
                if (matrix[row-i][col-i] == 1) return false;
            }

            //check for upper right diagnol
            if(row-i>=0 && col+i<lenghtOfMatrix) {
                if (matrix[row-i][col+i] == 1) return false;
            }

            //check for lower left diagnoal
            if(row+i<lenghtOfMatrix && col-i>=0) {
                if (matrix[row+i][col-i] == 1) return false;
            }

            //check for lower right diagnol
            if(row+i<lenghtOfMatrix && col+i<lenghtOfMatrix) {
                if (matrix[row+i][col+i] == 1) return false;
            }
        }
        return true;
    }
}
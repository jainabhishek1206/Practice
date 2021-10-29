package com.leetcode;

public class FindWinneronaTicTacToeGame {
    public static void main(String[] args) {
//        System.out.println(tictactoe(new int [][]{ { 0, 0 }, { 1, 1 }, { 0, 1 }, { 0, 2 }, { 1, 0 }, { 2, 0 } }));
        System.out.println(tictactoe(new int [][]{ { 1, 0 }, { 2, 2 }, { 2, 0 }, { 0, 1 }, { 1, 1 } }));
    }
    public static String tictactoe(int[][] moves) {
        if(moves.length<5) return "Draw";

        //make an entry in the array
        int[][] matrix = new int [3][3];
        for (int k = 0; k < moves.length; k++) {
            int i = moves[k][0];
            int j = moves[k][1];
            if(k%2==0) matrix[i][j] = 'X';
            else matrix[i][j] = 'Y';
        }


        //evaluate the result
        int ans = 0;
        if(matrix[0][0] == matrix[0][1] && matrix[0][1] == matrix[0][2] && matrix[0][2]!=0) ans = matrix[0][0];
        else if(matrix[1][0] == matrix[1][1] && matrix[1][1] == matrix[1][2] && matrix[1][2]!=0) ans = matrix[1][0];
        else if(matrix[2][0] == matrix[2][1] && matrix[2][1] == matrix[2][2] && matrix[2][2]!=0) ans = matrix[2][0];
        else if(matrix[0][0] == matrix[1][0] && matrix[1][0] == matrix[2][0] && matrix[2][0]!=0) ans = matrix[0][0];
        else if(matrix[0][1] == matrix[1][1] && matrix[1][1] == matrix[2][1] && matrix[2][1]!=0) ans = matrix[0][1];
        else if(matrix[0][2] == matrix[1][2] && matrix[1][2] == matrix[2][2] && matrix[2][2]!=0) ans = matrix[0][2];
        else if(matrix[0][0] == matrix[1][1] && matrix[1][1] == matrix[2][2] && matrix[2][2]!=0) ans = matrix[0][0];
        else if(matrix[0][2] == matrix[1][1] && matrix[1][1] == matrix[2][0] && matrix[2][0]!=0) ans = matrix[0][2];

        if(ans == 88) return "A";
        if(ans == 89) return "B";
        return "Pending";
    }
}

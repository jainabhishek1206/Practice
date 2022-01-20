/*Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
        Example 1:
        Input: grid = [
        ["1","1","1","1","0"],
        ["1","1","0","1","0"],
        ["1","1","0","0","0"],
        ["0","0","0","0","0"]
        ]
        Output: 1

        Example 2:
        Input: grid = [
        ["1","1","0","0","0"],
        ["1","1","0","0","0"],
        ["0","0","1","0","0"],
        ["0","0","0","1","1"]
        ]
        Output: 3

        Constraints:
        m == grid.length
        n == grid[i].length
        1 <= m, n <= 300
        grid[i][j] is '0' or '1'.*/
package com.leetcode;

public class NumberOfIslands_200 {
    private static  char[][] matrix;
    public static int numIslands(char[][] grid) {
        matrix = grid;
        int no_of_island = 0;
        int row = grid.length;
        if(grid==null || grid.length == 0) return 0;
        int col = grid[0].length;

        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                if(matrix[row][col] == '1') {
                    isIslandAvailable(row,col);
                    no_of_island++;
                }
            }
        }
        return no_of_island;
    }

    public static void isIslandAvailable(int row, int col) {
        //check the border case
        if(row<0 || row>=matrix.length || col<0 || col>matrix[0].length || matrix[row][col] != '1') {
            return;
        }

        matrix[row][col] = 2;
        //call the recursive function
        isIslandAvailable(row-1,col);
        isIslandAvailable(row+1,col);
        isIslandAvailable(row,col-1);
        isIslandAvailable(row,col+1);
    }
}

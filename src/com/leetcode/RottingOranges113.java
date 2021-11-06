/*You are given an m x n grid where each cell can have one of three values:

        0 representing an empty cell,
        1 representing a fresh orange, or
        2 representing a rotten orange.
        Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.
        Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return -1.

        Example 1:
        Input: grid = [[2,1,1],[1,1,0],[0,1,1]]
        Output: 4

        Example 2:
        Input: grid = [[2,1,1],[0,1,1],[1,0,1]]
        Output: -1
        Explanation: The orange in the bottom left corner (row 2, column 0) is never rotten, because rotting only happens 4-directionally.

        Example 3:
        Input: grid = [[0,2]]
        Output: 0
        Explanation: Since there are already no fresh oranges at minute 0, the answer is just 0.

        Constraints:
        m == grid.length
        n == grid[i].length
        1 <= m, n <= 10
        grid[i][j] is 0, 1, or 2.*/

package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

class Pair{
    int a,b;
    Pair(int a,int b){
        this.a = a;
        this.b = b;
    }
}
public class RottingOranges113 {
    static int[] dRow = {-1,0,1,0}; // row directions
    static int[] dCol = {0,1,0,-1}; // column directions
    public int orangesRotting(int[][] grid) {
        int m = grid.length , n = grid[0].length, fresh = 0, rotten = 0;
        Queue<Pair> q = new LinkedList<>();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 2){
                    q.add(new Pair(i,j)); // adding index pairs of rotten oranges to queue
                    rotten++;  // counting rotten oranges
                }
                else if(grid[i][j] == 1){
                    fresh++;  // counting fresh oranges
                }
            }
        }
        if(fresh == 0){  //if no fresh oranges found, return 0
            return 0;
        }
        if(rotten == 0){ // if fresh oranges exist & no rotten oranges found, return -1
            return -1;
        }
        int count = 0; // to count the number of minutes

        while(!q.isEmpty() && fresh > 0){  // iterate till q is not empty & fresh oranges exist
            int size = q.size();
            count++;  // every iteration of this outer while loop is equal to increment in minutes count
            for(int j = 0; j < size && fresh > 0; j++){
                Pair curr = q.poll();  //removing rotten orange index from queue and checking its adjacent cells for fresh oranges
                int x = curr.a;
                int y = curr.b;
                for(int i = 0; i < 4; i++){
                    int x1 = x + dRow[i];
                    int y1 = y + dCol[i];
                    if(isValid(grid,x1,y1)){
                        if(grid[x1][y1] == 1){
                            grid[x1][y1] = 2;
                            q.add(new Pair(x1,y1));
                            fresh--;
                        }
                    }
                }
            }
        }
        if(fresh > 0){  // if fresh oranges still exist, return -1
            return -1;
        }
        return count; // return minimum time
    }
    //function to check if indexes are valid
    public static boolean isValid(int[][] grid,int x,int y){
        if(x < 0 || y < 0 || x >= grid.length || y >= grid[0].length){
            return false;
        }
        return true;
    }
}
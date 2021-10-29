package com.leetcode;

public class DungeonGame {
    public static int minHealth = Integer.MAX_VALUE;
    public static void main(String[] args) {
        System.out.println(calculateMinimumHP(new int[][]{{-2,-3,3},{-5,-10,1},{10,30,-5}}));
    }
    public static int calculateMinimumHP(int[][] dungeon) {
        dungeonSolution(dungeon,0,0,0);
        return minHealth+1;
    }

    public static void dungeonSolution(int[][] dungeon, int row, int col, int health) {
        //base condition
        /*if(row == dungeon.length-1 && col == dungeon.length-1) {
            if(health<0){
                health = health*-1;
            }
            minHealth = minHealth < health ? minHealth : health;
        }*/

        //code login using backtrack
        int res = 0;
        for(int i=row;i<dungeon.length;i++) {
            health = health+dungeon[i][col];
            if(col < dungeon.length-1) {
                dungeonSolution(dungeon,i,col+1,health);
            }
            res = i;/*else{
                col --;
            }*/
        }
        if(res == dungeon.length-1 && col == dungeon.length-1) {
            if(health<0) health = health*-1;
//            else health = 0;
            minHealth = minHealth < health ? minHealth : health;
        }

    }
}

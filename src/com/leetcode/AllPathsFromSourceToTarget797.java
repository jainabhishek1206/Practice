package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class AllPathsFromSourceToTarget797 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<graph[0].length;i++) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(graph[0][i]);
            allPathsFromNode(graph[0][i],list);
        }
        return ans;
    }

    private void allPathsFromNode(int sourceNode,List<Integer> list) {
        if()
    }
}

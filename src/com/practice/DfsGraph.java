package com.practice;

import java.util.Iterator;
import java.util.LinkedList;

public class DfsGraph {

    //initialize the class
    int noOfVertices;
    LinkedList<Integer> array[];

    boolean visited[];

    //initialize a constructor
    DfsGraph(int noOfVertices) {
        this.noOfVertices = noOfVertices;
        array = new LinkedList[noOfVertices];
        for(int i=0;i<noOfVertices;i++) array[i] = new LinkedList<>();
    }

    //add Edge
    public void addEdge(int source,int destination) {
        array[source].add(destination);
    }

    //function to call for solving problem
    public void DFS(int rootNode) {
        //create a boolean arrayt to mark the visited status of all the nodes
        //initially all the nodes will be false
        //by defayult value of boolean is false
        visited = new boolean[noOfVertices];
        for(int i=0;i<noOfVertices;i++) {
            if(!visited[rootNode]) dfsUtil(i,visited);
        }
    }
    public void dfsUtil(int rootNode, boolean visited[]) {
        visited[rootNode] =  true;
        System.out.println("rootNode = " + rootNode);
        Iterator<Integer> i = array[rootNode].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if(!visited[n]) dfsUtil(n,visited);
        }
    }

    public static void main(String[] args) {
        DfsGraph g = new DfsGraph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println(
                "Following is Depth First Traversal "
                        + "(starting from vertex 2)");

        g.DFS(2);
    }
}
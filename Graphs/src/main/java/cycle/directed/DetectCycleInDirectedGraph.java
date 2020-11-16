package main.java.cycle.directed;

import java.util.ArrayList;

public class DetectCycleInDirectedGraph {
    static boolean isCyclic(ArrayList<ArrayList<Integer>> adj, int V)
    {
        boolean visited[] = new boolean[V];
        boolean traversed[] = new boolean[V];

        for(int i =0;i<V;i++){
            if(cyclic(i,visited,traversed,adj)){
                return true;
            }
        }
        return false;

    }

    static boolean cyclic(int node,boolean visited[],boolean traversed[],ArrayList<ArrayList<Integer>> adj){

        if(traversed[node]){
            return true;
        }
        if(visited[node]){
            return false;
        }
        int size = adj.get(node).size();
        visited[node] = true;
        traversed[node] = true;
        for(int i =0 ;i <  size ; i++){
            int vertex = adj.get(node).get(i);
            if(cyclic(vertex, visited,traversed ,adj)){
                return true;
            }
        }
        traversed[node] = false;
        return false;

    }
}

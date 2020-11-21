package topological.sort;

import java.util.ArrayList;
import java.util.Stack;

// problem link : https://practice.geeksforgeeks.org/problems/topological-sort/1
public class TopologicalSort {
    static int[] sort(ArrayList<ArrayList<Integer>> adj, int N) {
        Stack<Integer> stack = new Stack<Integer>();
        boolean visited[] = new boolean[N];
        for(int i =0;i<N;i++){
            if(!visited[i]){
                topologicalSort(i, visited,stack,adj);
            }
        }
        int[] a = new int[N];
        int start=0;
        while(!stack.isEmpty()){
            a[start]=stack.pop();
            start++;
        }
        return a;
    }

    static void topologicalSort(int node,boolean visited[],Stack<Integer> stack,ArrayList<ArrayList<Integer>> adj){
        visited[node] = true;
        int size = adj.get(node).size();
        for(int i =0;i< size ; i++){
            int vertex = adj.get(node).get(i);
            if(!visited[i]){
                topologicalSort(vertex, visited,stack,adj);
            }
        }
        stack.push(node);
    }
}

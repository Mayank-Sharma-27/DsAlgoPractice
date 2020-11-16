package main.java.dfs;

import java.util.ArrayList;

public class DepthFirstSearch {
    static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> g, int N)
    {
        boolean visited[] = new boolean[N];
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(0, visited, ans, g);
        return ans;
    }

    static void  dfs(int node,boolean visited[],ArrayList<Integer> ans, ArrayList<ArrayList<Integer>> g){
        if(visited[node]){
            return;
        }
        ans.add(node);
        visited[node] = true;
        int size = g.get(node).size();
        for(int i =0;i< size ;i++){
            dfs(g.get(node).get(i), visited, ans, g);
        }
    }

}

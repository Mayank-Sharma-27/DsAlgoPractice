package main.java.bfs;

import java.util.ArrayList;
import java.util.LinkedList;

public class BreadthFirstSearch {
    private static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> g, int N) {
        boolean visited[] = new boolean[N];
        visited[0] = true;
        ArrayList<Integer> ans = new ArrayList<>();

        LinkedList<Integer> q = new LinkedList<Integer>();
        q.add(0);
        while (q.size() != 0) {
            int vertex = q.poll();
            ans.add(vertex);
            int size = g.get(vertex).size();
            for (int i = 0; i < size; i++) {
                int n = g.get(vertex).get(i);
                if (!visited[n]) {
                    visited[n] = true;
                    q.add(n);
                }
            }

        }
        return ans;
    }

}

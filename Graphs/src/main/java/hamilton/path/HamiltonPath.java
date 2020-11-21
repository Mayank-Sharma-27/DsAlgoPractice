package hamilton.path;

import java.util.ArrayList;
import java.util.Scanner;

// problem link : https://practice.geeksforgeeks.org/problems/hamiltonian-path/0
public class HamiltonPath {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    static boolean checkPath(int start, boolean[] visited, int count,ArrayList<ArrayList<Integer> > adj ,int totalV) {
        visited[start] = true;
        count++;
        int size = adj.get(start).size();
        for(int i =0 ;i< size ;i++){
            int vertex=  adj.get(start).get(i);
            if(!visited[vertex]){
                if(checkPath(vertex, visited , count,adj,totalV)){
                    return true;
                }
            }
        }

        if(count== totalV){
            return true;
        }
        else{
            visited[start] = false;
            return false;
        }
    }

    static int isHamiltonianPathExist(ArrayList<ArrayList<Integer> > adj, int totalV) {
        boolean visited[] = new boolean[totalV];
        for(int i =0; i< totalV ; i++){
            if(checkPath(i, visited, 0,adj, totalV)){
                return 1;
            }
        }
        return 0;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases-- > 0) {
            int totalV = sc.nextInt();
            int totalE = sc.nextInt();
            ArrayList<ArrayList<Integer> > adj
                    = new ArrayList<ArrayList<Integer> >(totalV);

            for (int i = 0; i < totalV; i++)
                adj.add(new ArrayList<Integer>());
            for (int i = 0; i < totalE; i++) {
                addEdge(adj,sc.nextInt()-1 , sc.nextInt()-1);
            }
            System.out.println(isHamiltonianPathExist(adj,totalV));	//code
        }
    }
}

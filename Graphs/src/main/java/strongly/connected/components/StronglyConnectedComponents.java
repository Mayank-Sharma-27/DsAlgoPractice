package strongly.connected.components;

import java.util.ArrayList;
import java.util.Stack;

//problem link : https://practice.geeksforgeeks.org/problems/strongly-connected-components-kosarajus-algo/1
public class StronglyConnectedComponents {
    void reverse(ArrayList<ArrayList<Integer>> revlist, ArrayList<ArrayList<Integer>> list)
    {
        for(int i=0; i<list.size(); i++)
        {
            for(int j=0; j<list.get(i).size(); j++)
            {
                int num = list.get(i).get(j);
                revlist.get(num).add(i);
            }
        }
    }

    void fillStack(Stack<Integer> s, boolean visited[], ArrayList<ArrayList<Integer>> adj, int v){
        visited[v] = true;
        int size = adj.get(v).size();
        for(int i =0;i< size; i++){
            int vertex = adj.get(v).get(i);
            if(!visited[vertex]){
                fillStack( s,  visited,  adj,  vertex);
            }
        }
        s.push(v);
    }

    void DFSUtil(int v,boolean visited[],ArrayList<ArrayList<Integer>> adj)
    {
        // Mark the current node as visited and print it
        visited[v] = true;

        int n;

        // Recur for all the vertices adjacent to this vertex
        int size  =adj.get(v).size();
        for(int i =0 ;i< size ; i++)
        {
            n = adj.get(v).get(i);
            if (!visited[n])
                DFSUtil(n,visited,adj);
        }
    }

    public int kosaraju(ArrayList<ArrayList<Integer>> adj, int N)
    {
        Stack<Integer> s = new Stack<Integer>();

        boolean visited[] = new boolean[N+1];

        for(int i =0 ;i< N ; i++){
            if(!visited[i]){
                fillStack( s,  visited,  adj,  i);
            }
        }

        ArrayList<ArrayList<Integer>> revlist = new ArrayList<ArrayList<Integer>>();

        for(int i=0; i<N; i++)
        {
            revlist.add(new ArrayList<Integer>());
        }
        reverse(revlist, adj);
        for(int i =0 ;i < N ; i++){
            visited[i] =false;
        }
        int number  =0;

        while(!s.isEmpty()){
            int v = s.pop();

            if(!visited[v]){
                DFSUtil(v,visited,revlist);
                number++;

            }
        }

        return number;

    }
}

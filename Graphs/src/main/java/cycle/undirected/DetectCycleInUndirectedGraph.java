package cycle.undirected;

import java.util.ArrayList;
import java.util.Arrays;

public class DetectCycleInUndirectedGraph {
    static boolean isCyclic(ArrayList<ArrayList<Integer>> list, int V)
    {

        boolean vis[] = new boolean[V];
        Arrays.fill(vis,false);


        for(int i=0;i<V;i++)
            if(!vis[i] && doesNodeHaveACycle(list,i,-1,vis))
                return true;

        return false;
    }

    static boolean doesNodeHaveACycle(ArrayList<ArrayList<Integer>> list, int node, int parent, boolean vis[])
    {
        vis[node] = true;
        int size = list.get(node).size();

        for(int i =0; i< size; i++){
            int vertex = list.get(node).get(i);
            if(!vis[vertex]){
                if(doesNodeHaveACycle(list,vertex,node,vis))
                {
                    return true;
                }
            }
            else if(vertex !=parent){
                return true;
            }

        }
        return false;

    }

}

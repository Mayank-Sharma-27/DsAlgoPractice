package depth;

import java.util.List;

//problem link : https://leetcode.com/problems/maximum-depth-of-n-ary-tree/
public class MaximumNaryTree {
    public int maxDepth(Node root) {
        return dfs(root);
    }
    int  dfs(Node root){
        if(root==null){
            return 0;
        }
        int size = root.children.size();
        if(size==0){
            return 1;
        }
        int h = 0;
        for(int i =0 ; i <  size ; i++){
            Node node = root.children.get(i);
            int a = height(node, 0)+1;
            h=     Math.max(h,a) ;

        }
        return h;
    }
    int height(Node root, int h){
        if(root== null){
            return h;
        }
        h++;
        int size = root.children.size();
        for(int i = 0 ; i <  size ; i++){
            Node node = root.children.get(i);
            int a = height(node, 0)+1;
            h=Math.max(h,a);
        }
        return h;
    }
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
}

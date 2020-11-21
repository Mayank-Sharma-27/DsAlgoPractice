package town.judge;

//problem link : https://leetcode.com/problems/find-the-town-judge/
public class FindTownJudge {

    public int findJudge(int N, int[][] trust) {
        boolean visited[] = new boolean[N+1];
        for(int[] t : trust){
            int u = t[0];
            visited[u] = true;
        }
        int count = 0;
        int value=0;;
        for(int i= 1 ; i<= N; i++){
            if(!visited[i]){
                count++;
                value = i;
            }
            if(count>1){
                return -1;
            }
        }
        for(int[] t : trust){
            int u = t[0];
            int v = t[1];
            if(v== value){
                visited[u] = false;
            }
        }

        for(int i =1 ; i<=N ; i++){
            if(visited[i]){
                return -1;
            }
        }
        return value;
    }

}

package questions.matrix.block.sum;

// problem link : https://leetcode.com/problems/matrix-block-sum/
public class MatrixBlockSum {

    public int[][] matrixBlockSum(int[][] mat, int K) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] t = new int[m][n];

        for (int i = 0; i < n; i++) {
            t[0][i] = mat[0][i];
        }

        for(int i =1; i< m ; i++){
            for(int j =0 ; j< n ;j++){
                t[i][j] = mat[i][j] +  t[i-1][j];
            }
        }


        for(int i =0; i< m ; i++){
            for(int j =1 ; j< n; j++){
                t[i][j] = t[i][j] +  t[i][j-1];
            }
        }

        int[][] ans = new int[m][n];

        for(int i =0; i< m ; i++){
            for(int j =0; j< n ; j++){

                ans[i][j] = sumQuery(t,i,j,K);

            }
        }
        return ans;
    }

    int sumQuery(int[][] aux, int i , int j , int k)
    {
        int starti= i-k; int startj = j-k; int endi=i+k;
        int endj = j+k;
        if(starti<0){
            starti =0;
        }
        if(startj<0){
            startj=0;
        }
        int m = aux.length;
        int n = aux[0].length;
        if(endi>=m){
            endi= m-1;
        }
        if(endj>=n){
            endj= n-1;
        }
        int res = aux[endi][endj];
        if (starti > 0) {
            res = res - aux[starti-1][endj];
        }
        if (startj > 0){
            res = res - aux[endi][startj-1];
        }
        if (starti > 0 && startj > 0)
            res = res + aux[starti-1][startj-1];

        return res;
    }

}

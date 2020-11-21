package questions.kth.grammer;

// problem link : https://leetcode.com/problems/k-th-symbol-in-grammar/
public class KthSymbolInGrammar {

    public int kthGrammar(int N, int K) {
        if(N==1 && K ==1){
            return 0;
        }

        int   mid =(int) (Math.pow(2, N-1))/2;
        if(K<=  mid){
            return kthGrammar(N-1,K);
        }
        else{
            int  value =kthGrammar(N-1,K-mid);
            if(value==0){
                return 1;
            }
            else{
                return 0;
            }
        }
    }

}

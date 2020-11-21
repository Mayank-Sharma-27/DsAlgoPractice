package questions.binary.numbers;

import java.util.ArrayList;

// problem link: https://practice.geeksforgeeks.org/problems/print-n-bit-binary-numbers-having-more-1s-than-0s0252/1
public class PrintNBitBinaryNumber {

    ArrayList<String> NBitBinary(int N) {
        ArrayList<String> ans =  new ArrayList<>();
        String output="";
        int one =0;
        int zero =0;
        solve(ans, output,N, one , zero );
        return ans;
    }
    void    solve(ArrayList<String> ans, String output, int N, int one, int zero){
        if(N==0){
            ans.add(output);
            return;
        }
        String output1 = output;
        output1 = output+"1";
        solve(ans, output1, N -1 , one +1, zero);
        if(one> zero){
            String output2= output;
            output2 = output+"0";
            solve(ans, output2, N-1 , one, zero+1);
        }
        return;

    }

}

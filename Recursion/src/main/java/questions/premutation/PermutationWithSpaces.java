package questions.premutation;


// problem link : https://practice.geeksforgeeks.org/problems/permutation-with-spaces/0
public class PermutationWithSpaces {

    static	void solve(String input, String output){
        if(input.length()==0){
            System.out.print("("+output+")");
            return;
        }
        String output1=output;
        String output2=output;
        output1 = output1 + " ";
        output1 = output1+input.charAt(0);
        output2 = output2+input.charAt(0);
        input = input.substring(1);
        solve(input,output1);
        solve(input,output2);
        return;

    }

}

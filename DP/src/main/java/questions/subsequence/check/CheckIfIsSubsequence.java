package questions.subsequence.check;

// problem link : https://leetcode.com/problems/is-subsequence/
public class CheckIfIsSubsequence {

    public boolean isSubsequence(String s, String t) {
        int j = 0;int k = 0;
        for(int i = 0 ; i<t.length(); i++){
            if(s.length() > k && s.charAt(k) == t.charAt(i)) {
                j++;
                k++;
            }
        }
        return j == s.length();
    }

}

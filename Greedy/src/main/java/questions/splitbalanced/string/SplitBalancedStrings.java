package questions.splitbalanced.string;

//problem statement : https://leetcode.com/problems/split-a-string-in-balanced-strings/
public class SplitBalancedStrings {
    public int balancedStringSplit(String s) {
        int r = 0;
        int l = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == 'L') l++;
            if(s.charAt(i) == 'R') r++;

            if(l>0 && r>0 && l==r){
                count++;
                l = 0;
                r = 0;
            }

        }

        return count;
    }

}

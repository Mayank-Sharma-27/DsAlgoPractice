package questions.anagrams;

// problem link : https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/
public class MinimumNumberStringsToMakeAnagram {

    public int minSteps(String s, String t) {
        int[] S = new int[123];
        int[] T = new int[123];
        int ans = 0;
        for (int i = 0; i < s.length(); ++i) {
            S[s.charAt(i)]++;
            T[t.charAt(i)]++;
        }
        for (int i = 97; i < 123; ++i) {
            if (S[i] > T[i]) ans += S[i] - T[i];
        }
        return ans;
    }
}

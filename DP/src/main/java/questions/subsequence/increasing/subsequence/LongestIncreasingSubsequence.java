package questions.subsequence.increasing.subsequence;

import java.util.Arrays;

// problem link : https://leetcode.com/problems/longest-increasing-subsequence/
public class LongestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int n = nums.length;
        int[] f = new int[n];
        Arrays.fill(f, 1);
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    f[i] = Math.max(f[i], f[j] + 1);
                }
            }

            ans = Math.max(ans, f[i]);
        }
        return ans;

    }

}

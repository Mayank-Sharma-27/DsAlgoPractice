package questions.cookies;

import java.util.Arrays;

// problem link : https://leetcode.com/problems/assign-cookies/
public class AssignCookies {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int js = 0;
        int count = 0;
        for (int i = 0; i < g.length; i++) {
            for (int j = js; j < s.length; j++) {
                if (g[i] <= s[j]) {
                    count++;
                    js = j + 1;
                    break;
                }
            }
        }
        return count;
    }

}

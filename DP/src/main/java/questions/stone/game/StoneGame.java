package questions.stone.game;

// problem link : https://leetcode.com/problems/stone-game/
public class StoneGame {

    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + piles[i];
        }
        int c = sum / 2;
        return isWinner(piles, 0, n - 1, c, 0);
    }


    boolean isWinner(int[] piles, int start, int end, int sum, int chance) {
        if (sum < 0) {
            if (chance % 2 == 0) {
                return true;
            } else
                return false;
        }
        return isWinner(piles, start++, end, sum - piles[start], chance++)
                || isWinner(piles, start, end--, sum - piles[end], chance++);
    }

}

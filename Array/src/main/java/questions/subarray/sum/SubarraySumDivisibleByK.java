package questions.subarray.sum;

import java.util.HashMap;
import java.util.Map;

//problem link: https://leetcode.com/problems/subarray-sums-divisible-by-k/
public class SubarraySumDivisibleByK {

    public int subarraysDivByK(int[] A, int K) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0, sum = 0;
        for(int a : A) {
            sum = (sum + a) % K;
            if(sum < 0) sum += K;
            count += map.getOrDefault(sum, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;

    }

}

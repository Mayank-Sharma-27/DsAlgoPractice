package questions.partition;

// problem link : https://leetcode.com/problems/partition-to-k-equal-sum-subsets/
public class PartitionKEqualSum {

    public boolean canPartitionKSubsets(int[] nums, int k) {
        if(nums == null || nums.length ==0){
            return false;
        }
        int totalSum =0;
        for(int num : nums){
            totalSum = totalSum + num;
        }

        if(totalSum%k  !=0){
            return false;
        }
        return dfs(nums, k, totalSum / k, 0, 0, new boolean[nums.length]);
    }

    private boolean dfs(int[] nums, int k, int target, int index, int sum, boolean[] visited) {

        if(k==0){
            return true;
        }
        if(sum  > target){
            return false;
        }
        if (sum == target)
        {return dfs(nums, k - 1, target, 0, 0, visited);
        }
        for (int i = index; i < nums.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                sum += nums[i];
                if (dfs(nums, k, target, i + 1, sum, visited)) return true;
                visited[i] = false;
                sum -= nums[i];
            }
        }
        return false;
    }

}

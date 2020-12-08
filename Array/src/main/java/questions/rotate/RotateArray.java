package questions.rotate;

import java.util.LinkedList;
import java.util.Queue;

//problem link :https://leetcode.com/problems/rotate-array/
public class RotateArray {

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        Queue<Integer> q
                = new LinkedList<>();
        for(int i =n-1 ;i >=0  ; i--){
            q.add(nums[i]);
        }
        while(k!=0){
            int value = q.poll();
            q.add(value);
            k--;
        }

        int start =n-1;
        while(!q.isEmpty()){
            int value = q.poll();
            nums[start] = value;
            start--;
        }

    }

}

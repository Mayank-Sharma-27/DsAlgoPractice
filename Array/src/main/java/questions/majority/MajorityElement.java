package questions.majority;

import java.util.ArrayList;
import java.util.List;

//problem link : https://leetcode.com/problems/majority-element/
public class MajorityElement {

    public int majorityElement(int[] nums) {
        int n = nums.length;
        Integer e1= null;
        Integer e2 = null;
        int count1 =0;
        int count2 = 0;
        for(int i : nums){
            if(e1 != null && i == e1)
                count1++;
            else if(e2 != null && i == e2)
                count2++;
            else if(count1 ==0){
                e1 = i ;
                count1 =1;
            }
            else if(count2 ==0){
                e2 =i;
                count2 = 1;
            }
            else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        List<Integer> ans = new ArrayList();
        for(int i : nums){
            if(e1 ==i){
                count1++;
            }
            else if(e2 ==i){
                count2++;
            }
        }
        if(count1 >Math.ceil(n/2)){
            return e1;
        }
        if(count2 > Math.ceil(n/2)){
            return e2;
        }
        return -1;
    }

}

package questions.rain.water;

// problem link : https://leetcode.com/problems/trapping-rain-water/
public class TrappingRainWater {

    public int trap(int[] height) {
        if(height==null || height.length==0){
            return 0;
        }
        int n = height.length;
        int[] maxL = new int[n];
        int[] maxR = new int[n];
        int[] water = new int[n];
        maxL[0] = height[0];
        for(int i =1 ; i<n ; i++ ){
            maxL[i] = Math.max(maxL[i-1], height[i]);
        }

        maxR[n-1] = height[n-1];

        for(int i =n-2 ; i>= 0; i--){
            maxR[i] = Math.max(height[i], maxR[i+1]);
        }

        for(int i =0 ; i < n ; i++){
            water[i]  = Math.min(maxL[i], maxR[i]) - height[i];
        }

        int sum =0;
        for(int i =0 ; i< n ; i++){
            sum = sum+water[i];
        }
        return sum;
    }

}

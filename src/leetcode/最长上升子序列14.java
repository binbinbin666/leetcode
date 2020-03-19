package leetcode;

import java.util.Arrays;

/**  
    * @Title: 最长上升子序列14.java
    * @Package leetcode
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年3月15日
    * @version V1.0  
    */
public class 最长上升子序列14 {

	public int lengthOfLIS(int[] nums) {
	        if(nums.length == 0) return 0;
	        int[] dp = new int[nums.length];
	        int res = 0;
	        Arrays.fill(dp, 1);
	        for(int i = 0; i < nums.length; i++) {
	            for(int j = 0; j < i; j++) {
	                if(nums[j] < nums[i]) dp[i] = Math.max(dp[i], dp[j] + 1);
	            }
	            res = Math.max(res, dp[i]);
	        }
	        return res;
	    }
}

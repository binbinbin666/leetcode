package leetcode;

import java.util.Arrays;

/**  
    * @Title: �����������14.java
    * @Package leetcode
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��3��15��
    * @version V1.0  
    */
public class �����������14 {

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

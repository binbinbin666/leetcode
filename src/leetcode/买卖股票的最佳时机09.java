package leetcode;
/**  
    * @Title: 买卖股票的最佳时机.java
    * @Package leetcode
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年3月9日
    * @version V1.0  
    */
public class 买卖股票的最佳时机09 {

}
class Solution09 {
    public int maxProfit(int[] prices) {
    	int max = 0;
    	for (int i = 0; i < prices.length; i++) {
			for (int j = i+1; j < prices.length; j++) {
				int temp = prices[j]-prices[i];
				if (temp>max) {
					max = temp;
				}
			}
		}	
		return max;
    }
}

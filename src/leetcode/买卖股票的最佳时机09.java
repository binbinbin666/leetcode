package leetcode;
/**  
    * @Title: ������Ʊ�����ʱ��.java
    * @Package leetcode
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��3��9��
    * @version V1.0  
    */
public class ������Ʊ�����ʱ��09 {

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

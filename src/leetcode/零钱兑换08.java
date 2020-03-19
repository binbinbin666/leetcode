package leetcode;
/**  
    * @Title: ��Ǯ�һ�08.java
    * @Package leetcode
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��3��8��
    * @version V1.0  
    */
public class ��Ǯ�һ�08 {

}
class Solution1 {

	  public int coinChange(int[] coins, int amount) {
	    if (amount < 1) return 0;
	    return coinChange(coins, amount, new int[amount]);
	  }

	  private int coinChange(int[] coins, int rem, int[] count) {
	    if (rem < 0) return -1;
	    if (rem == 0) return 0;
	    if (count[rem - 1] != 0) return count[rem - 1];
	    int min = Integer.MAX_VALUE;
	    for (int coin : coins) {
	      int res = coinChange(coins, rem - coin, count);
	      if (res >= 0 && res < min)
	        min = 1 + res;
	    }
	    count[rem - 1] = (min == Integer.MAX_VALUE) ? -1 : min;
	    return count[rem - 1];
	  }
	}
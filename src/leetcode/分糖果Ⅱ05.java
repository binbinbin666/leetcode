package leetcode;
/**  
    * @Title: 分糖国Ⅱ05.java
    * @Package leetcode
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年3月5日
    * @version V1.0  
    */
public class 分糖果Ⅱ05 {

	
}
class Solution {
	
	public int[] distributeCandies(int candies, int num_people) {
    	int[] ans = new int[num_people];
        int i = 1;
    	while (candies>0) {
            if(i>candies){
                ans[(i-1)%num_people] += candies;
                break;
            }
			ans[(i-1)%num_people] += i;
			candies -= i;
            i++;
		}
		return ans;
    }
}

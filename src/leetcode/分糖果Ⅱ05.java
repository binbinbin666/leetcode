package leetcode;
/**  
    * @Title: ���ǹ���05.java
    * @Package leetcode
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��3��5��
    * @version V1.0  
    */
public class ���ǹ���05 {

	
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

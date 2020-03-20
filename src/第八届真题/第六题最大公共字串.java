package 第八届真题;
/**  
    * @Title: 第六题最大公共字串.java
    * @Package 第八届真题
    * @Description: TODO(动态规划)
    * @author 陈洪彬
    * @date 2020年2月21日
    * @version V1.0  
    */
public class 第六题最大公共字串 {

	static int f(String s1,String s2) {
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		int[][] a = new int[c1.length+1][c2.length+1];
		
		int max = 0;
		for (int i = 1; i < a.length; i++) {
			for (int j = 1; j < a[i].length; j++) {
				if (c1[i-1]==c2[j-1]) {
//					a[i][j] =  __________________;  //填空
					a[i][j] = a[i-1][j-1]+1;   //答案
					if (a[i][j]>max) {
						max = a[i][j];
					}
				}
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int n = f("abcdkkk", "baabcdadabc");
		System.out.println(n);
	}
}

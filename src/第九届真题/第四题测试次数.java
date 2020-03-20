package 第九届真题;
/**  
    * @Title: 第四题测试次数.java
    * @Package 第九届真题
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年2月15日
    * @version V1.0  
    */
public class 第四题测试次数 {
		 
		public static void main(String[] args) {
			for(int i=0;i<10;i++)
				for(int j=0;j<10000;j++)
					memo[i][j] = 99999999;//找最小,初始化INF
			System.out.println(f(3,1000));
		}
		
		static int[][] memo = new int[10][10005];
		
		static int f(int n,int m) {
			if(n==1)
				return m;
			if(m==1 || m==2)
				return 1;
				
			if(memo[n][m]!=99999999)
				return memo[n][m];
			
			for(int i=1;i<=m;i++) {
				memo[n][m] = Math.min(memo[n][m], 1+Math.max(f(n,m-i),f(n-1,i)));
			}
			return memo[n][m];
		}
}

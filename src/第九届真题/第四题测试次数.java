package �ھŽ�����;
/**  
    * @Title: ��������Դ���.java
    * @Package �ھŽ�����
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��2��15��
    * @version V1.0  
    */
public class ��������Դ��� {
		 
		public static void main(String[] args) {
			for(int i=0;i<10;i++)
				for(int j=0;j<10000;j++)
					memo[i][j] = 99999999;//����С,��ʼ��INF
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

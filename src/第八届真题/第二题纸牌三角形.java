package �ڰ˽�����;
/**  
    * @Title: �ڶ���ֽ��������.java
    * @Package �ڰ˽�����
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��2��15��
    * @version V1.0  
    */
public class �ڶ���ֽ�������� {

	public static void main(String[] args) {
		dfs(0);
		System.out.println(ans/6.0);//��������������֤�Ƿ�����
	}
	
	static int[] a = new int[] {1,2,3,4,5,6,7,8,9};
	static int ans = 0;
	
	static void dfs(int m) {
		if(m>=9) {
			if(a[0]+a[1]+a[3]+a[5]==a[0]+a[2]+a[4]+a[8] && a[0]+a[1]+a[3]+a[5]==a[5]+a[6]+a[7]+a[8]) 
				ans++;
			
			return;
		}
		
		for(int i=m;i<9;i++) {
			swap(i,m);
			dfs(m+1);
			swap(i,m);
		}
		
	}
	
	static void swap(int i,int j) {
		int t = a[i];
		a[i] =a[j];
		a[j] = t;
	}
}

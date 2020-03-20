package 第七届真题;
/**  
    * @Title: 第三题凑算式.java
    * @Package 第七届真题
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2121年3月1日
    * @version V1.1  
    */
public class 第三题凑算式 {
//  暴力解法
//	public static void main(String[] args) {
//		int sum = 0;
//		for (int i = 1; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//				for (int j2 = 1; j2 <= 9; j2++) {
//					for (int k = 1; k <= 9; k++) {
//						for (int k2 = 1; k2 <= 9; k2++) {
//							for (int l = 1; l <= 9; l++) {
//								for (int l2 = 1; l2 <= 9; l2++) {
//									for (int m = 1; m <= 9; m++) {
//										for (int m2 = 1; m2 <= 9; m2++) {
//											if (i!=j&&i!=j2&&i!=k&&i!=k2&&i!=l&&i!=l2&&i!=m&&i!=m2&&j!=j2&&j!=k&&j!=k2&&j!=l&&j!=l2
//													&&j!=m&&j!=m2&&j2!=k&&j2!=k2&&j2!=l&&j2!=l2
//													&&j2!=m&&j2!=m2&&k!=k2&&k!=l&&k!=l2&&k!=m&&k!=m2&&k2!=l&&k2!=l2&&k2!=m&&k2!=m2
//													&&l!=l2&&l!=m&&l!=m2&&l2!=m&&l2!=m2&&m!=m2) {
//												int a = Integer.parseInt(k+""+k2+""+l);
//												int b = Integer.parseInt(l2+""+m+""+m2);
//												if (i*j2*b+j*b+a*j2==10*j2*b) {
//													sum ++;
//												}
//											}
//										}
//									}
//								}
//							}
//						}
//					}
//				}
//			}
//		}
//		System.out.println(sum);
//	}
	
	//递归解法
	public static void main(String[] args) {
		dfs(0);
		System.out.println(ans);
	}
	
	static int[] a = new int[] {1,2,3,4,5,6,7,8,9};
	static int ans=0;
	//全排列算法
	static void dfs(int m) {
		if(m>=9) {
			//a[0]+a[1]/a[2]+a[3]a[4]a[5]/(a[6]a[7]a[8]) = 10 
			//--> A + B/C + D/E = 10 --> A*C*E + B*E + D*C = 10*C*E
			int A = a[0];
			int B = a[1];
			int C = a[2];
			int D = 100*a[3]+10*a[4]+a[5];
			int E = 100*a[6]+10*a[7]+a[8];
 
			
			if(A*C*E + B*E +D*C == 10*C*E) {
				ans++;
				for(int i=0;i<9;i++)
					System.out.print(a[i]+" ");
				System.out.println();
			}
			return;
		}
		
		for(int i=m;i<9;i++) {
			swap(m,i);
			dfs(m+1);
			swap(m,i);
		}
		
	}
 
	static void swap(int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
}

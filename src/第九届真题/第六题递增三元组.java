package �ھŽ�����;

import java.util.Arrays;
import java.util.Scanner;

/**  
    * @Title: �����������Ԫ��.java
    * @Package �ھŽ�����
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��2��15��
    * @version V1.0  
    */
public class �����������Ԫ�� {

	public static void main(String[] args) {
		 
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] A = new int[n];
		int[] B = new int[n];
		int[] C = new int[n];
 
		for(int i=0;i<n;i++)
			A[i] = in.nextInt();
		for(int i=0;i<n;i++)
			B[i] = in.nextInt();
		for(int i=0;i<n;i++)
			C[i] = in.nextInt();
		
		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);
 
		int ans=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
				if(A[i]<B[j]) {
					int l=0,r=n-1;
			        while(l<=r){
			            int m = (l+r)/2;
			            if(C[m]>B[j]) r= m-1;
			            else    l = m +1;
			        }
//			        System.out.println(i+" "+j+" "+l);
			        ans+=n-l;
				}
		}
		
		System.out.println(ans);
	}
}

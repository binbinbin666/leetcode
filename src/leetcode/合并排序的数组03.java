package leetcode;

import java.util.Arrays;

/**  
    * @Title: �ϲ����������.java
    * @Package leetcode
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��3��3��
    * @version V1.0  
    */
public class �ϲ����������03 {
	public static void main(String[] args) {
		
	}

	public void merge(int[] A, int m, int[] B, int n) {
		for (int i = 0; i < n; i++) {
			A[i+m] = B[i];
		}
		Arrays.sort(A);
    }
}

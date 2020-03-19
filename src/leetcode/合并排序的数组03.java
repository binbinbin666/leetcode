package leetcode;

import java.util.Arrays;

/**  
    * @Title: 合并排序的数组.java
    * @Package leetcode
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年3月3日
    * @version V1.0  
    */
public class 合并排序的数组03 {
	public static void main(String[] args) {
		
	}

	public void merge(int[] A, int m, int[] B, int n) {
		for (int i = 0; i < n; i++) {
			A[i+m] = B[i];
		}
		Arrays.sort(A);
    }
}

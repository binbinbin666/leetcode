package base;

import java.util.Scanner;

/**  
    * @Title: 杨辉三角.java
    * @Package base
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年1月12日
    * @version V1.0  
    */
public class 杨辉三角 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][]a = new int[n][n];
		for (int i = 0; i < a.length; i++) {
			a[i][0] = 1;
			a[i][i] = 1;
			for (int j = 1; j < i; j++) {
				a[i][j] = a[i-1][j-1]+a[i-1][j];
			}
		}
		//打印二维数组
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}

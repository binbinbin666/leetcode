package base;

import java.util.Scanner;

/**  
    * @Title: �������.java
    * @Package base
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��1��12��
    * @version V1.0  
    */
public class ������� {

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
		//��ӡ��ά����
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}

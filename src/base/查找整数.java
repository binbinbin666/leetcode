package base;

import java.util.Scanner;

/**  
    * @Title: ��������.java
    * @Package base
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��1��12��
    * @version V1.0  
    */
public class �������� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int[] a = new int[total];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int search = sc.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (search==a[i]) {
				System.out.println(i+1);
				break;
			}
			if (i==a.length-1) {
				System.out.println(-1);
				break;
			}
		}
	}
}

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
		for (int i = 0; i < total; i++) {
			a[i] = sc.nextInt();
		}
		int max = a[0];//����Ҫע�⣬��ֵ����Ϊ0
		int min = a[0];//����Ҫע�⣬��ֵ����Ϊ0
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max) {
				max = a[i];
			}
			if(a[i]<min) {
				min = a[i];
			}
			sum += a[i];
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
	}
}

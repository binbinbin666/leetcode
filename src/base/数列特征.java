package base;

import java.util.Scanner;

/**  
    * @Title: 数列特征.java
    * @Package base
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年1月12日
    * @version V1.0  
    */
public class 数列特征 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int[] a = new int[total];
		for (int i = 0; i < total; i++) {
			a[i] = sc.nextInt();
		}
		int max = a[0];//这里要注意，初值不能为0
		int min = a[0];//这里要注意，初值不能为0
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

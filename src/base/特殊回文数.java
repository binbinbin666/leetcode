package base;

import java.util.Scanner;

/**  
    * @Title: 特殊回文数.java
    * @Package base
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年1月12日
    * @version V1.0  
    */
public class 特殊回文数 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for (int i = 10000; i < 1000000; i++) {
			if(i<100000) {
				int a = i/10000;
				int b = i/1000%10;
				int c = i%1000/100;
				int d = i%100/10;
				int e = i%10;
				int sum = a+b+c+d+e;
				if(a==e&&b==d&&sum==input) {
					System.out.println(i);
				}
			}
			if(i>=100000) {//251554
				int a = i/100000;
				int b = i/10000%10;
				int c = i/1000%10;
				int d = i%1000/100;
				int e = i%100/10;
				int f = i%10;
				int sum = a+b+c+d+e+f;
				if(a==f&&b==e&&c==d&&sum==input) {
					System.out.println(i);
				}
			}
		}
	}
}

package base;

import java.util.Scanner;

/**  
    * @Title: 字母图形.java
    * @Package base
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年1月12日
    * @version V1.0  
    */
public class 字母图形 {
	
	public static void main(String[] args) {
		char[] c = new char[26];
		for(int a=0;a<26;a++) {
			c[a] = (char)(65+a);
		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < m;j++) {
				if (i>j) {
					//输出前面那部分字母
					System.out.print(c[i-j]);
				}else {
					//后面那部分字母
					System.out.print(c[j-i]);
				}
			}
			System.out.println();
		}
	}
}

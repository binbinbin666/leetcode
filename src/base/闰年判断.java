package base;

import java.util.Scanner;

/**  
    * @Title: 闰年判断.java
    * @Package test
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年1月11日
    * @version V1.0  
    */
public class 闰年判断 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int s = scanner.nextInt();
		if (s<=2050&&s>=1990) {
			if (s%4==0&&s%100!=0||s%400==0) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
		scanner.close();
	}
}

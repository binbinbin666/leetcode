package ditui;

import java.util.Scanner;

/**  
    * @Title: FeiBoNaqi.java
    * @Package ditui
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年1月11日
    * @version V1.0  
    */
public class FeiBoNaqi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(FeiBo(n));;
	}
	public static int FeiBo(int n) {
		int[] res = {0, 1};
        if(n < 2) {
            return res[n];
        }
        int first = 0;
        int second = 1;
        int fibn = 0;
        for(int i = 2; i <= n; i++) {
            fibn = (first + second)%10007;
            first = second;
            second = fibn;
        }
        return fibn;
	}
}

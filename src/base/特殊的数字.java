package base;
/**  
    * @Title: 特殊的数字.java
    * @Package base
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年1月12日
    * @version V1.0  
    */
public class 特殊的数字 {

	public static void main(String[] args) {
		for (int i = 100; i < 1000; i++) {
			int a = i/100;
			int b = i/10%10;
			int c = i%100%10;
			int sum = a*a*a+b*b*b+c*c*c;
			if(i==sum) {
				System.out.println(i);
			}
		}
	}
}

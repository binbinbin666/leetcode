package base;
/**  
    * @Title: 回文数.java
    * @Package base
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年1月12日
    * @version V1.0  
    */
public class 回文数 {

	public static void main(String[] args) {
		for (int i = 1000; i < 10000; i++) {
			int a = i/1000;
			int b = i/100%10;
			int c = i%100/10;
			int d = i%10;
			if(a==d&&b==c) {
				System.out.println(i);
			}
		}
	}
}

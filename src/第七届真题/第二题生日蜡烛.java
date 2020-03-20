package 第七届真题;
/**  
    * @Title: 第二题生日蜡烛.java
    * @Package 第七届真题
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年3月1日
    * @version V1.0  
    */
public class 第二题生日蜡烛 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 30; i++) {
			sum = 0;
			for (int j = i; j < 70; j++) {
				sum += j;
				if (sum==236) {
					System.out.println(i+"岁到"+j+"岁");
				}
			}
		}
	}
}

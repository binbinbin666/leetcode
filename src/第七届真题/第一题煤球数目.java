package 第七届真题;
/**  
    * @Title: 第一题煤球数目.java
    * @Package 第七届真题
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年3月1日
    * @version V1.0  
    */
public class 第一题煤球数目 {

	public static void main(String[] args) {
		int n = 0,sum = 0;
		for (int i = 1; i <=100; i++) {
			n += i; //n是第i层的煤球数
			sum += n;//sum是总煤球数
		}
		System.out.println(sum);
	}
}

package 第九届真题;
/**  
    * @Title: 第二题方格计数.java
    * @Package 第九届真题
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年2月11日
    * @version V1.0  
    */
public class 第二题方格计数 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			for (int j = 1; j <= 1000; j++) {
				if ((i*i+j*j)<=1000000) {
					sum++;
				}
			}
		}
		System.out.println(sum*4);
	}
}

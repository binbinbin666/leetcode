package base;
/**  
    * @Title: ������.java
    * @Package base
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��1��12��
    * @version V1.0  
    */
public class ������ {

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

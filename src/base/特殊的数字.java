package base;
/**  
    * @Title: ���������.java
    * @Package base
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��1��12��
    * @version V1.0  
    */
public class ��������� {

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

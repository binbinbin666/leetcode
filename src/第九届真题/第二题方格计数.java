package �ھŽ�����;
/**  
    * @Title: �ڶ��ⷽ�����.java
    * @Package �ھŽ�����
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��2��11��
    * @version V1.0  
    */
public class �ڶ��ⷽ����� {

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

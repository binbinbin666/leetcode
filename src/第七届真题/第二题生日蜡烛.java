package ���߽�����;
/**  
    * @Title: �ڶ�����������.java
    * @Package ���߽�����
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��3��1��
    * @version V1.0  
    */
public class �ڶ����������� {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 30; i++) {
			sum = 0;
			for (int j = i; j < 70; j++) {
				sum += j;
				if (sum==236) {
					System.out.println(i+"�굽"+j+"��");
				}
			}
		}
	}
}

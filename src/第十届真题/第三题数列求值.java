package ��ʮ������;
/**  
    * @Title: ������������ֵ.java
    * @Package ��ʮ������
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��2��1��
    * @version V1.0  
    */
public class ������������ֵ {

	//����������쳲��������У���������20190324��������λ���֣�Ҫ�ǵ�������쳲��������е�
	//˼������ȥ����˵long���ͣ�BigInteger���Ͷ��治����ô�������Ȼ�����Ƿ��֣�����
	//20190324��������λ���֣�Ҳ���Ǳ���ĸ��������������ֻ��ÿ�����ĺ���λ�й�ϵ��
	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		int c = 1;
		int d = 0;
		for (int i = 4; i <=20190324 ; i++) {
			d = (a + b + c)%10000;
			a = b;
			b = c;
			c = d;
		}
		System.out.println(d);
	}
}

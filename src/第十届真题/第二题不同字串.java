package ��ʮ������;

import java.util.HashSet;
import java.util.Set;

/**  
    * @Title: �ڶ��ⲻͬ�ִ�.java
    * @Package ��ʮ������
    * @Description: TODO
    * (���ⷢ��Ҫ���ǲ�ͬ�ķǿ��Ӵ������뵽Set����ȥ��
        * ��String.substring()�������Ӵ���һ��	Ϊ���ٽ���Ϊǰ�ᣩ��
        * Ȼ�����Ƿ��������Ӵ�����Ϊһ��ʼ�Ӵ�����Ϊ1��Ȼ����Ϊ2�����������Ϊԭ�ַ�����
       * ��ͺ�	���ж�����һ��ʼҪ���г�ÿ�����Ϊ1�����飬ÿ���ƶ�����Ϊ1��
        * ����Ҫ���г�ÿ�����Ϊ2�����飬ÿ���ƶ�����	Ϊ1��������ֱ��Ϊ�����󶹸��Ĵ�С��
    * @author �º��
    * @date 2020��2��1��
    * @version V1.0  
    */
public class �ڶ��ⲻͬ�ִ� {

	public static void main(String[] args) {
		String target = "0100110001010001";
		Set<String> sub = new HashSet<String>();
		for (int i = 0; i < target.length(); i++) {
			for (int begin = 0,end = i+1; end <=target.length() ; begin++,end++) {
				sub.add(target.substring(begin,end));
			}
		}
		System.out.println(sub.size());
	}
}

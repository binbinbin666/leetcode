package ���߽�����;

import java.util.HashSet;
import java.util.Set;

/**  
    * @Title: �������ǩ.java
    * @Package ���߽�����
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��3��3��
    * @version V1.0  
    */
public class �������ǩ {

	public static void main(String[] args) {
		Set<Integer> s = new HashSet<Integer>();
		System.out.println(s.add(1));
		System.out.println(s.add(1));
		for (Integer integer : s) {
			System.out.println(s);
		}
	}
;}

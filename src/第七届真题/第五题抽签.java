package 第七届真题;

import java.util.HashSet;
import java.util.Set;

/**  
    * @Title: 第五题抽签.java
    * @Package 第七届真题
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年3月3日
    * @version V1.0  
    */
public class 第五题抽签 {

	public static void main(String[] args) {
		Set<Integer> s = new HashSet<Integer>();
		System.out.println(s.add(1));
		System.out.println(s.add(1));
		for (Integer integer : s) {
			System.out.println(s);
		}
	}
;}

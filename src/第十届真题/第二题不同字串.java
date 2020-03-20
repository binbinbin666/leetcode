package 第十届真题;

import java.util.HashSet;
import java.util.Set;

/**  
    * @Title: 第二题不同字串.java
    * @Package 第十届真题
    * @Description: TODO
    * (审题发现要求是不同的非空子串，则想到Set集合去重
        * ，String.substring()方法求子串（一切	为快速解题为前提），
        * 然后我们发现它的子串规律为一开始子串长度为1，然后在为2，……，最后为原字符串，
       * 这就好	比切豆腐，一开始要求切成每刀间隔为1豆腐块，每次移动距离为1，
        * 后来要求切成每刀间隔为2豆腐块，每次移动距离	为1，……，直至为整个大豆腐的大小。
    * @author 陈洪彬
    * @date 2020年2月1日
    * @version V1.0  
    */
public class 第二题不同字串 {

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

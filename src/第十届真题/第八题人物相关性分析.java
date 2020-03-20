package 第十届真题;

import java.util.Scanner;

/**  
    * @Title: 第八题人物相关性分析.java
    * @Package 第十届真题
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年2月5日
    * @version V1.0  
    */
public class 第八题人物相关性分析 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		String[] split1 = s.split("\\s+|\\.");
		int length = 1;
		Boolean b = true;
		String now = null;
		int sum = 0;
		for (int i = 0; i < split1.length; i++) {
			System.out.println(split1[i]+split1[i].length());
			if (b) {
				if ("Bob".equals(split1[i])||"Alice".equals(split1[i])) {
					now = split1[i];
					b = false;
					continue;
				}
			}
			if ("Bob".equals(now)||"Bob.".equals(now)) {
				if ("Alice".equals(split1[i])||"Alice.".equals(split1[i])) {
					if (length<=k) {
						sum++;
					}
					now = "Alice";
					length=1;
					continue;
				}
			}else if("Alice".equals(now)||"Alice.".equals(now)){
				if ("Bob".equals(split1[i])||"Bob.".equals(split1[i])) {
					if (length<=k) {
						sum++;
					}
					now = "Bob";
					length=1;
					continue;
				}
			}
			if (!b) {
				length += split1[i].length()+1;
			}
			
		}
		System.out.println(sum);
	}
}

package ��ʮ������;

import java.util.Scanner;

/**  
    * @Title: �ڰ�����������Է���.java
    * @Package ��ʮ������
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��2��5��
    * @version V1.0  
    */
public class �ڰ�����������Է��� {

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

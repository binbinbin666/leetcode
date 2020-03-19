package leetcode;
/**  
    * @Title: 字符串压缩16.java
    * @Package leetcode
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年3月16日
    * @version V1.0  
    */
public class 字符串压缩16 {
	public static void main(String[] args) {
		System.out.println(compressString("aabcccccaa"));
		System.out.println("aaa".charAt(1));
	}

	public static String compressString(String S) {
		char[] s = S.toCharArray();
		if (s.length==1) {
			return String.valueOf(s);
		}
		char[] ss = new char[s.length*2];
		int sum = 1;
		int k = 0;
		for (int i = 0; i < s.length; i+=sum) {
			sum = 1;
			for (int j = i+1; j < s.length; j++) {
				if (s[i]==s[j]) {
					sum++;
				}else {
					ss[k] = s[i];
					if (sum<10) {
						ss[k+1] = (char) (sum+48);
						k += 2;
						break;
					}else if (sum>=10&&sum<100) {
						ss[k+1] = (char)(sum/10+48);
						ss[k+2] = (char)(sum%10+48);
						k+=3;
						break;
					}else if (sum>=100&&sum<1000) {
						ss[k+1] = (char)(sum/100+48);
						ss[k+2] = (char)(sum/10%10+48);
						ss[k+3] = (char)(sum%10+48);
						k+=4;
						break;
					}else if (sum>=1000&&sum<10000) {
						ss[k+1] = (char)(sum/1000+48);
						ss[k+2] = (char)(sum/100%10+48);
						ss[k+3] = (char)(sum/10%10+48);
						ss[k+4] = (char)(sum%10+48);
						k+=5;
						break;
					}
				}
			}
			if (i+sum>=s.length) {
				ss[k] = s[i];
				if (sum<10) {
					ss[k+1] = (char) (sum+48);
					k += 2;
				}else if (sum>=10&&sum<100) {
					ss[k+1] = (char)(sum/10+48);
					ss[k+2] = (char)(sum%10+48);
					k+=3;
				}else if (sum>=100&&sum<1000) {
					ss[k+1] = (char)(sum/100+48);
					ss[k+2] = (char)(sum/10%10+48);
					ss[k+3] = (char)(sum%10+48);
					k+=3;
					break;
				}else if (sum>=1000&&sum<10000) {
					ss[k+1] = (char)(sum/1000+48);
					ss[k+2] = (char)(sum/100%10+48);
					ss[k+3] = (char)(sum/10%10+48);
					ss[k+4] = (char)(sum%10+48);
					k+=5;
					break;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ss.length; i++) {
			if (ss[i]!='\u0000') {
				sb.append(ss[i]);
			}
		}
		if (sb.length()>=s.length) {
			return String.valueOf(s);
		}else {
			return sb.toString();
		}
    }
}

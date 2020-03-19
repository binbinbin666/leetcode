package leetcode;
/**  
    * @Title: ƴд����17.java
    * @Package leetcode
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��3��17��
    * @version V1.0  
    */
public class ƴд����17 {

	public int countCharacters(String[] words, String chars) {
	    int[] chars_count = count(chars); // ͳ����ĸ�����ĸ���ִ���
	    int res = 0;
	    for (String word : words) {
	        int[] word_count = count(word); // ͳ�Ƶ��ʵ���ĸ���ִ���
	        if (contains(chars_count, word_count)) {
	            res += word.length();
	        }
	    }
	    return res;
	}

	// �����ĸ�����ĸ���ִ����Ƿ񸲸ǵ��ʵ���ĸ���ִ���
	boolean contains(int[] chars_count, int[] word_count) {
	    for (int i = 0; i < 26; i++) {
	        if (chars_count[i] < word_count[i]) {
	            return false;
	        }
	    }
	    return true;
	}

	// ͳ�� 26 ����ĸ���ֵĴ���
	int[] count(String word) {
	    int[] counter = new int[26];
	    for (int i = 0; i < word.length(); i++) {
	        char c = word.charAt(i);
	        counter[c-'a']++; //
	    }
	    return counter;
	}
}

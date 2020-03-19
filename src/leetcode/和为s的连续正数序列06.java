package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

/**  
    * @Title: 和为s的连续正数序列06.java
    * @Package leetcode
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年3月6日
    * @version V1.0  
    */
public class 和为s的连续正数序列06 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String s = sc.nextLine();
//		System.out.println(length(s));
//	}
//	public static int length(String s) {
//		String[] ss = s.split(" ");
//		return ss[ss.length-1].length();
//	}

	class Solution {
	    public int[][] findContinuousSequence(int target) {

	    	int sum = 0;
	    	int[][] a = new int[target][target];
	    	List<List<Integer>> list = new ArrayList<List<Integer>>();
	    	List<Integer> l = new ArrayList<Integer>();
	    	for (int i = 1; i <= (target-1)/2; i++) {
				for (int j = i;; j++) {
					sum += j;
					if (sum>target) {
						sum = 0;
						break;
					}
					if (sum==target) {
						for (int k = i; k <= j; k++) {
							l.add(k);
						}
						list.add(l);
						sum = 0;
						break;
					}
				}
			}
	    	for (int i = 0; i < list.size(); i++) {
				for (int j = 0; j < list.get(i).size(); j++) {
					a[i][j] = list.get(i).get(j);
				}
			}
	    	return a;
	    }
	}
}


package sort;

import java.util.Arrays;
import java.util.Scanner;

/**  
    * @Title: 归并排序.java
    * @Package sort
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年3月17日
    * @version V1.0  
    */
public class 归并排序 {
	public static void main(String[] args) {
		int[] a = null;
		Scanner sc = new Scanner(System.in);
		a = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(mergeSort(a)));
	}

	public static int[] mergeSort(int[] arr) {
		if (arr.length<2) {
			return arr;
		}
		int mid = arr.length/2;
		int[] left = Arrays.copyOfRange(arr, 0,mid);
		int[] right = Arrays.copyOfRange(arr, mid, arr.length);
		//递归分解并合并
		int[] l = mergeSort(left);
		int[] r = mergeSort(right);
		return merge(l, r);
	}
	
	/**
	 * 合并两个数组
	 */
	public static int[] merge(int[] left,int[] right) {
		int[] newArray = new int[left.length+right.length];
		//定义两个指针分别代表两个数组的下标
		int lindex = 0;
		int rindex = 0;
		for (int i = 0; i < newArray.length; i++) {
			if (lindex>=left.length) {
				newArray[i] = right[rindex++];
			}else if (rindex>=right.length) {
				newArray[i] = left[lindex++];
			}else if (left[lindex]<right[rindex]) {
				newArray[i] = left[lindex++];
			}else {
				newArray[i] = right[rindex++];
			}
		}
		return newArray;
	}
}

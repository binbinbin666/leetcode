package ��ʮ������;

import java.util.Scanner;

/**  
    * @Title: ��һ�����.java
    * @Package ��ʮ������
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��2��1��
    * @version V1.0  
    */
public class ��һ����� {

	//1��ֱ�Ӽ����� ��490
	//2��
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			int[][] team = new int[20][5];
			for (int i = 0; i < 20; i++) {
				for (int j = 0; j < 5; j++) {
					team[i][j] = input.nextInt();
				}
			}
			int maxSum = 0;
			for (int i = 0; i < 20; i++)
				for (int j = 0; j < 20; j++)
					for (int k = 0; k < 20; k++)
						for (int h = 0; h < 20; h++)
							for (int g = 0; g < 20; g++)
								if ((i != j && i != k && i != h && i != g) && (j != k && j != h && j != g)
										&& (k != h && k != g) && h != g) {
									int max = team[i][0] + team[j][1] + team[k][2] + team[h][3] + team[g][4];
									if (max > maxSum)
										maxSum = max;
								}
			System.out.println(maxSum);
			// ��������
			/*
			 * 97 90 0 0 0 92 85 96 0 0 0 0 0 0 93 0 0 0 80 86 89 83 97 0 0 82 86 0 0 0 0 0
			 * 0 87 90 0 97 96 0 0 0 0 89 0 0 95 99 0 0 0 0 0 96 97 0 0 0 0 93 98 94 91 0 0
			 * 0 0 83 87 0 0 0 0 98 97 98 0 0 0 93 86 98 83 99 98 81 93 87 92 96 98 0 0 0 89
			 * 92 0 99 96 95 81
			 */
		} catch (Exception e) {
			input.close();
		}
	}
}

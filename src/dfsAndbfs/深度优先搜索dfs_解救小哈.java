package dfsAndbfs;

import java.util.Scanner;

/**  
    * @Title: �����������dfs.java
    * @Package dfsAndbfs
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��1��19��
    * @version V1.0  
    */
public class �����������dfs_���С�� {

	static int n=5,m=4,p=4,q=3,min = 99999999;
	static int[][] a = new int[4][5];
	static int[][] book = new int[51][51];
	static int[][] next = new int[4][2];
	static void dfs(int x,int y,int step) {
		next = new int[][]{
							{0,1},//��
							{1,0},//��
							{0,-1},//��
							{-1,0}//��
						};
		int tx,ty,k;
		//�ж��Ƿ񵽴�С����λ��
		if (x==p && y==q) {
			if (step<min) {
				min = step;
			}
			return;//��Ҫ
		}
		
		//ö�������߷�
		for (k = 0; k <= 3; k++) {
			//������һ���������
			tx = x + next[k][0];
			ty = y + next[k][1];
			//�ж��Ƿ�Խ��
			if (tx<1||tx>n||ty<1||ty>m) {
				continue;
			}
			//�жϸõ��Ƿ�Ϊ�ϰ�������Ѿ���·����
			if (a[tx][ty]==0 && book[tx][ty]==0) {
				book[tx][ty] = 1;//���������Ѿ��߹�
				dfs(tx, ty, step+1);//��ʼ������һ����
				book[tx][ty] = 0;//���Խ�����ȡ�������ı��
			}
		}
		return;
	}
	
	public static void main(String[] args) {
		int i,j,startx,starty;
		a = new int[][] {{0,0,1,0},{0,0,0,0},{0,0,1,0},{0,1,0,0},{0,0,0,1}};
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt();
//		m = sc.nextInt();
//		for (i = 0; i < n; i++) {
//			for (j = 0; j < m; j++) {
//				a[i][j] = sc.nextInt();
//			}
			//���������յ�����
			startx = 1;
			starty = 1;
//			p = sc.nextInt();
//			q = sc.nextInt();
			
			//����㿪ʼ����
			book[startx][starty] = 1;
			dfs(startx, starty, 0);
			System.out.println(min);
		}
	}

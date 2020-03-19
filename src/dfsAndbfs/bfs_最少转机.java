package dfsAndbfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**  
    * @Title: bfs_����ת��.java
    * @Package dfsAndbfs
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��1��27��
    * @version V1.0  
    */
public class bfs_����ת�� {

	public static void main(String[] args) {
		List<Note> que = new ArrayList<>();
		for (int i = 0; i < 2501; i++) {
			que.add(new Note());
		}
		int[][] e = new int[51][51];
		int[] book = new int[51];
		int head,tail;
		int i,j,n,m,a,b,cur,start,end,flag = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		start = sc.nextInt();
		end = sc.nextInt();
		//��ʼ����ά����
		for (i = 1; i <= n; i++) {
			for (j = 0; j < n; j++) {
				if (i==j) {
					e[i][j] = 0;
				}else {
					e[i][j] = 99999999;
				}
			}
		}
		sc.nextInt();
		//�������֮��ĺ���
		for (i = 1; i <m; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			e[a][b] = 1;
			e[b][a] = 1;
		}
		//���г�ʼ��
		head = 1;
		tail = 1;
		//��start�ų��г�������start�ų��м������
		que.get(tail).setS(start);
		que.get(tail).setX(0);
		tail++;
		book[start] = 1;//���start�������ڶ�����
		//�����в�Ϊ�յ�ʱ��ѭ��
		while (head<tail) {
			cur = que.get(head).getX();
			for (j = 1; j < n; j++) {
				if (e[cur][j]!=99999999&&book[j]==0) {
					que.get(tail).setS(j);
					que.get(tail).setX(que.get(head).getX()+1);
					tail++;
					book[j] = 1;
				}
				//�������Ŀ����У�ֹͣ��չ������������˳�ѭ��
				if (que.get(tail).getX()==end) {
					flag = 1;
					break;
				}
			}
			if (flag==1) {
				break;
			}
			head++;
		}
		System.out.println(que.get(tail-1).getS());
	}
}

class Note{
	private int x;//���б��
	private int s;//ת������
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getS() {
		return s;
	}
	public void setS(int s) {
		this.s = s;
	}
	
}

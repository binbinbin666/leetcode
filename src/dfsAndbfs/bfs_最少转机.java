package dfsAndbfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**  
    * @Title: bfs_最少转机.java
    * @Package dfsAndbfs
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年1月27日
    * @version V1.0  
    */
public class bfs_最少转机 {

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
		//初始化二维矩阵
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
		//读入城市之间的航班
		for (i = 1; i <m; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			e[a][b] = 1;
			e[b][a] = 1;
		}
		//队列初始化
		head = 1;
		tail = 1;
		//从start号城市出发，将start号城市加入队列
		que.get(tail).setS(start);
		que.get(tail).setX(0);
		tail++;
		book[start] = 1;//标记start城市已在队列中
		//当队列不为空的时候循环
		while (head<tail) {
			cur = que.get(head).getX();
			for (j = 1; j < n; j++) {
				if (e[cur][j]!=99999999&&book[j]==0) {
					que.get(tail).setS(j);
					que.get(tail).setX(que.get(head).getX()+1);
					tail++;
					book[j] = 1;
				}
				//如果到达目标城市，停止拓展，任务结束，退出循环
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
	private int x;//城市编号
	private int s;//转机次数
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

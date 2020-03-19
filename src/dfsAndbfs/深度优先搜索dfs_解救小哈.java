package dfsAndbfs;

import java.util.Scanner;

/**  
    * @Title: 深度优先搜索dfs.java
    * @Package dfsAndbfs
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年1月19日
    * @version V1.0  
    */
public class 深度优先搜索dfs_解救小哈 {

	static int n=5,m=4,p=4,q=3,min = 99999999;
	static int[][] a = new int[4][5];
	static int[][] book = new int[51][51];
	static int[][] next = new int[4][2];
	static void dfs(int x,int y,int step) {
		next = new int[][]{
							{0,1},//右
							{1,0},//下
							{0,-1},//左
							{-1,0}//上
						};
		int tx,ty,k;
		//判断是否到达小哈的位置
		if (x==p && y==q) {
			if (step<min) {
				min = step;
			}
			return;//重要
		}
		
		//枚举四种走法
		for (k = 0; k <= 3; k++) {
			//计算下一个点的坐标
			tx = x + next[k][0];
			ty = y + next[k][1];
			//判断是否越界
			if (tx<1||tx>n||ty<1||ty>m) {
				continue;
			}
			//判断该点是否为障碍物或者已经在路径中
			if (a[tx][ty]==0 && book[tx][ty]==0) {
				book[tx][ty] = 1;//标记这个点已经走过
				dfs(tx, ty, step+1);//开始尝试下一个点
				book[tx][ty] = 0;//尝试结束，取消这个点的标记
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
			//读入起点和终点坐标
			startx = 1;
			starty = 1;
//			p = sc.nextInt();
//			q = sc.nextInt();
			
			//从起点开始搜索
			book[startx][starty] = 1;
			dfs(startx, starty, 0);
			System.out.println(min);
		}
	}

package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**  
    * @Title: 腐烂的橘子04.java
    * @Package leetcode
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年3月4日
    * @version V1.0  
    */
public class 腐烂的橘子04 {

	class Pos {
	    int x, y, minute;
	    public Pos(int _x, int _y, int _minute) {
	        x = _x;
	        y = _y;
	        minute = _minute;
	    }
	}
	static int[][] dir = { {-1,0},{1,0},{0,-1},{0,1} };

	public int orangesRotting(int[][] grid) {
	    int R = grid.length;//行数
	    int C = grid[0].length;//列数
	    int minute = 0;//初始被感染的橘子
	    Queue<Pos> queue = new LinkedList<>();

	    for (int i = 0; i < R; i++) {
	        for (int j = 0; j < C; j++)
	        if (grid[i][j] == 2)                 //先找出腐烂的橘子
	            queue.add(new Pos(i, j, minute));
	    }
	    while (!queue.isEmpty()) {
	        Pos pos = queue.poll();
	        minute = pos.minute;            //当前层橘子的腐烂周期
	        for (int k = 0; k < 4; k++) {   //一个腐烂，四个方向的橘子都会腐烂
	            int newX = pos.x + dir[k][0];
	            int newY = pos.y + dir[k][1];
	            if (newX >= 0 && newX < R && newY >= 0 && newY < C && grid[newX][newY] == 1) {
	                grid[newX][newY] = 2;  //标记腐烂
	                queue.add(new Pos(newX, newY, pos.minute + 1)); //外层橘子腐烂周期自增1
	            }
	        }
	    }
	    //check for fresh oranges
	    for(int[] row : grid) {
	        for (int i : row)
	            if (i == 1) return -1;
	    }
	    return minute;
	}
}

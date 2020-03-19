package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**  
    * @Title: ���õ�����04.java
    * @Package leetcode
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��3��4��
    * @version V1.0  
    */
public class ���õ�����04 {

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
	    int R = grid.length;//����
	    int C = grid[0].length;//����
	    int minute = 0;//��ʼ����Ⱦ������
	    Queue<Pos> queue = new LinkedList<>();

	    for (int i = 0; i < R; i++) {
	        for (int j = 0; j < C; j++)
	        if (grid[i][j] == 2)                 //���ҳ����õ�����
	            queue.add(new Pos(i, j, minute));
	    }
	    while (!queue.isEmpty()) {
	        Pos pos = queue.poll();
	        minute = pos.minute;            //��ǰ�����ӵĸ�������
	        for (int k = 0; k < 4; k++) {   //һ�����ã��ĸ���������Ӷ��ḯ��
	            int newX = pos.x + dir[k][0];
	            int newY = pos.y + dir[k][1];
	            if (newX >= 0 && newX < R && newY >= 0 && newY < C && grid[newX][newY] == 1) {
	                grid[newX][newY] = 2;  //��Ǹ���
	                queue.add(new Pos(newX, newY, pos.minute + 1)); //������Ӹ�����������1
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

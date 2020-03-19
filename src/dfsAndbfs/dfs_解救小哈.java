package dfsAndbfs;
/**  
    * @Title: test.java
    * @Package dfsAndbfs
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年1月20日
    * @version V1.0  
    */
import java.util.LinkedList;
public class dfs_解救小哈 {

		
		/**
	     * 定义迷宫数组
	     */
		
	    private int maxY = 4;
	    private int maxX = 5;
	    int min=Integer.MAX_VALUE;
	    int endX=3;
	    int endY=2;
	    int[][] maze=new int[maxX][maxY];
	    int[][] mark=new int[maxX][maxY];
	    LinkedList<Integer> map=new LinkedList<Integer>();
	    
	    /*
		 * 初始化迷宫
		 * */
		public void initMaze() {
			
			this.maze = new int[][] {
				{ 0, 0, 0, 0 },
				{ 0, 0, 0, 0 },
				{ 0, 0, 1, 0 },
				{ 0, 1, 0, 0 },
				{ 0, 0, 0, 1 }
		    };
		    
		    
		    this.mark=new int[maxX][maxY];
		    this.mark[0][0]=1;
		    
		    //输出迷宫地图，其中: * 代表障碍物；_代表可以通过
		    for(int x=0;x<maxX;x++) {
		    	for(int y=0;y<maxY;y++) {
		    		if(x==endX && y==endY) {
		    			System.out.print("! ");
		    		}else if(this.maze[x][y]==1) {
		    			System.out.print("* ");
		    		}else {
		    			System.out.print("_ ");
		    		}
		    	}
		    	System.out.println();
		    }
		    System.out.println();
		    
		}
	 
	    public void dfs(int startX,int startY,int step) {
	    	//搜索顺序：右，下，左，上
	    	int[][] next=new int[][] {
	    		{0,1},//向右走
	    		{1,0},//向下走
	    		{0,-1},//向左走
	    		{-1,0} //向上走
	    	};
	    	
	    	
	    	int nextX;
	    	int nextY;
	    	int posible;
	    	//判断是否达到小哈的位置
	    	if(startX==endX && startY==endY) {
	    		//判断是否用了最少的步数steps
	    		if(step<min) {
	    			min=step;
	    		}
	    		
	    		for(int i=map.size()-1;i>=0;i-=2) {
	    			nextX=map.get(i);
	    			nextY=map.get(i-1);
	    			System.out.print("["+nextX+","+nextY+"]");
	    			if(i!=1) {
	    				System.out.print("->");
	    			}
	    		}
	    		System.out.println();
	        	return;
	    	}
	    	
	    	for(posible=0;posible<next.length;posible++) {
	    		//顺序：右，下，左，上
	    		//计算下一个点的坐标
	    		nextX=startX+next[posible][0];
	    		nextY=startY+next[posible][1];
	    		//判断是否越界
	    		if(nextX<0||nextX>=maxX||nextY<0||nextY>=maxY) {
	    			continue;
	    		}
	    		
	    		if(maze[nextX][nextY]==0 && mark[nextX][nextY]==0) {
	    			map.push(nextX);
	    			map.push(nextY);
	    			mark[nextX][nextY]=1;
	    			dfs(nextX,nextY,step+1); //递归调用，移动到下一格子
	    			mark[nextX][nextY]=0;
	    			map.pop();
	    			map.pop();
	    			
	    		}
	    	}
	    	
	    }
	    
	    
		public static void main(String[] args) {
			dfs_解救小哈 help=new dfs_解救小哈();
			
			int startX=0;
			int startY=0;
			
			long startTime=System.currentTimeMillis();
			
			help.initMaze();
			help.dfs(startX, startY, 0);
			if(help.min<Integer.MAX_VALUE) {
				System.out.println("At least "+help.min+" steps.");
			}else {
				System.out.println("No Way!");
			}
			
			long endTime=System.currentTimeMillis();
		    System.out.println("Elapsed time: "+(endTime-startTime)+" ms.");
		}
	 
	}

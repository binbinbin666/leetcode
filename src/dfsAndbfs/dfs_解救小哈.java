package dfsAndbfs;
/**  
    * @Title: test.java
    * @Package dfsAndbfs
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��1��20��
    * @version V1.0  
    */
import java.util.LinkedList;
public class dfs_���С�� {

		
		/**
	     * �����Թ�����
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
		 * ��ʼ���Թ�
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
		    
		    //����Թ���ͼ������: * �����ϰ��_�������ͨ��
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
	    	//����˳���ң��£�����
	    	int[][] next=new int[][] {
	    		{0,1},//������
	    		{1,0},//������
	    		{0,-1},//������
	    		{-1,0} //������
	    	};
	    	
	    	
	    	int nextX;
	    	int nextY;
	    	int posible;
	    	//�ж��Ƿ�ﵽС����λ��
	    	if(startX==endX && startY==endY) {
	    		//�ж��Ƿ��������ٵĲ���steps
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
	    		//˳���ң��£�����
	    		//������һ���������
	    		nextX=startX+next[posible][0];
	    		nextY=startY+next[posible][1];
	    		//�ж��Ƿ�Խ��
	    		if(nextX<0||nextX>=maxX||nextY<0||nextY>=maxY) {
	    			continue;
	    		}
	    		
	    		if(maze[nextX][nextY]==0 && mark[nextX][nextY]==0) {
	    			map.push(nextX);
	    			map.push(nextY);
	    			mark[nextX][nextY]=1;
	    			dfs(nextX,nextY,step+1); //�ݹ���ã��ƶ�����һ����
	    			mark[nextX][nextY]=0;
	    			map.pop();
	    			map.pop();
	    			
	    		}
	    	}
	    	
	    }
	    
	    
		public static void main(String[] args) {
			dfs_���С�� help=new dfs_���С��();
			
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

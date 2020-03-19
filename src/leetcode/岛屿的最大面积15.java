package leetcode;
/**  
    * @Title: �����������15.java
    * @Package leetcode
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��3��15��
    * @version V1.0  
    */
public class �����������15 {

	
}
class Solution15 {
    public int maxAreaOfIsland(int[][] grid) {
        int res = 0; 
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    res = Math.max(res, dfs(i, j, grid));
                }
            }
        } 
        return res;
    }
    // ÿ�ε��õ�ʱ��Ĭ��numΪ1��������ж�������ǵ��죬��ֱ�ӷ���0���Ϳ��Ա���Ԥ������������
    // ÿ���ҵ����죬��ֱ�Ӱ��ҵ��ĵ���ĳ�0�����Ǵ�˵�еĳ���˼�룬������������Ͱ�������Χ��ȫ����Ĭ��
    // ps��������ó���˼�룬��ô��Ȼ����������Ȧ˼�롣����Ȥ�����ѿ���ȥ���ԡ�
    private int dfs(int i, int j, int[][] grid) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == 0) { 
            return 0;
        } 
        grid[i][j] = 0;
        int num = 1;
        num += dfs(i + 1, j, grid);
        num += dfs(i - 1, j, grid);
        num += dfs(i, j + 1, grid);
        num += dfs(i, j - 1, grid);
        return num;
        
    }
}
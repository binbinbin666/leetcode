package leetcode;
/**  
    * @Title: ��������ֱ��10.java
    * @Package leetcode
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��3��10��
    * @version V1.0  
    */
public class ��������ֱ��10 {

}
class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }
class Solution10 {
    int ans;
    public int diameterOfBinaryTree(TreeNode root) {
        ans = 1;
        depth(root);
        return ans - 1;
    }
    public int depth(TreeNode node) {
        if (node == null) return 0; // ���ʵ��սڵ��ˣ�����0
        int L = depth(node.left); // �����Ϊ�������������
        int R = depth(node.right); // �Ҷ���Ϊ�������������
        ans = Math.max(ans, L+R+1); // ����d_node��L+R+1 ������ans
        return Math.max(L, R) + 1; // ���ظýڵ�Ϊ�������������
    }
}
package leetcode;
/**  
    * @Title: ��ת����01.java
    * @Package leetcode
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��3��2��
    * @version V1.0  
    */
public class ��ת����02 {

	 public ListNode reverseList(ListNode head) {
		 	ListNode prev = null;
		    ListNode curr = head;
		    while (curr != null) {
		        ListNode nextTemp = curr.next;
		        curr.next = prev;
		        prev = curr;
		        curr = nextTemp;
		    }
		    return prev;
	}
}
class ListNode{
	int val;
	ListNode next;
	public ListNode(int x) {
		val = x;
	}
}

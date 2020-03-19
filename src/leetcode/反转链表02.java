package leetcode;
/**  
    * @Title: 反转链表01.java
    * @Package leetcode
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年3月2日
    * @version V1.0  
    */
public class 反转链表02 {

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

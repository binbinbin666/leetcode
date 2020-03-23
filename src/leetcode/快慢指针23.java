package leetcode;

/**
 * @author 陈洪彬
 * @ClassName: 快慢指针23
 * @Description: TODO(用一句话描述该文件做什么)
 * @date 2020/3/23 18:12
 */
public class 快慢指针23 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        /**
         * 数组转链表
         * @param nums
         */
        public ListNode(int[] nums) {
            if (nums == null || nums.length == 0) {
                throw new IllegalArgumentException("arr can not be empty");
            }
            this.val = nums[0];
            ListNode curr = this;
            for (int i = 1; i < nums.length; i++) {
                curr.next = new ListNode(nums[i]);
                curr = curr.next;
            }
        }

        @Override
        public String toString() {
            StringBuilder s = new StringBuilder();
            ListNode cur = this;
            while (cur != null) {
                s.append(cur.val);
                s.append(" -> ");
                cur = cur.next;
            }
            s.append("NULL");
            return s.toString();
        }
    }

    public static class Solution {

        public ListNode middleNode(ListNode head) {
            if (head == null) {
                return null;
            }
            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

        public static void main(String[] args) {
            int[] arr = new int[]{1, 2, 3, 4, 5, 6};
            // int[] arr = new int[]{1, 2, 3, 4, 5};
            ListNode head = new ListNode(arr);
            Solution solution = new Solution();
            ListNode res = solution.middleNode(head);
            System.out.println(res);
        }
    }
}

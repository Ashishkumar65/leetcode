/*https://leetcode.com/problems/remove-nodes-from-linked-list/?envType=daily-question&envId=2024-05-06
/*




/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode curr = head;
        while (curr != null) {
            st.push(curr);
            curr = curr.next;
        }
        curr = st.pop();
        int maxi = curr.val;
        ListNode ans = new ListNode(maxi);
        while (!st.isEmpty()) {
            curr = st.pop();
            if (curr.val < maxi) {
                continue;
            } else {
                ListNode newNode = new ListNode(curr.val);
                newNode.next = ans;
                ans = newNode;
                maxi = curr.val;
            }
        }
        return ans;
    }
}

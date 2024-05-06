
/* https://leetcode.com/problems/add-two-numbers-ii/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        while(l1 != null){
            st1.push(l1.val);
            l1 = l1.next;
        }
         while(l2 != null){
            st2.push(l2.val);
            l2 = l2.next;
        }
        int carry = 0;
        int value =0;
         ListNode ans = new ListNode();
        while(!st1.isEmpty() || !st2.isEmpty()){
            if(!st1.isEmpty()){
                value+=st1.pop();
            }

             if(!st2.isEmpty()){
                value+=st2.pop();
            }
            ans.val = value % 10;
            carry = value / 10;
            ListNode head = new ListNode(carry);
            head.next = ans;
            ans = head;
            value = carry;
        }
        return  carry == 0 ? ans.next: ans;
    }
}

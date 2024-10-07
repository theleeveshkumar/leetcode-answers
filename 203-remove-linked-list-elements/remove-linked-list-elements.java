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
    public ListNode removeElements(ListNode head, int val) {
        ListNode funkyDummy = new ListNode(0);
        funkyDummy.next = head;
        ListNode funkyCurrent = funkyDummy;
         while (funkyCurrent.next != null) {
            if (funkyCurrent.next.val == val) {
                funkyCurrent.next = funkyCurrent.next.next;
            } else {
                funkyCurrent = funkyCurrent.next;
            }
        }
        return funkyDummy.next;
    }
}
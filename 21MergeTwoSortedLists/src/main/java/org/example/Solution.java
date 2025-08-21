package org.example;

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(list1.val);

        while (list1.next != null || list2.next != null) {
            ListNode l1 = list1.next;
            ListNode l2 = list2.next;

            result = l
        }

        return result;
    }
}
package org.example;


//Definition for singly-linked list.


class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        while (list1.next != null) {
            result.val = list1.val;
            result.next= list2.val;
        }
    }
}
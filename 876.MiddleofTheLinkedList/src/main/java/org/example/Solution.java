package org.example;

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode middle = head;
        int counter = 0;
        int size = 0;

        while (head.next != null) {
            counter++;
            size++;
            head = head.next;
            if (counter == 2) {
                middle = middle.next;
                counter = 0;
            }
        }

        return size % 2 == 0 ? middle : middle.next;
    }
}
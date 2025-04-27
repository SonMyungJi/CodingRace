class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        Integer temp = null;

        while (list1 != null || list2 != null || temp != null) {
            int val;

            if (temp != null) {
                val = temp;
                temp = null;
            } else if (list1 != null && (list2 == null || list1.val <= list2.val)) {
                val = list1.val;
                list1 = list1.next;
            } else if (list2 != null) {
                val = list2.val;
                list2 = list2.next;
            } else {
                break;
            }

            current.next = new ListNode(val);
            current = current.next;

            if (list1 != null && (list2 == null || list1.val <= list2.val)) {
                temp = list1.val;
                list1 = list1.next;
            } else if (list2 != null && (list1 == null || list2.val <= list1.val)) {
                temp = list2.val;
                list2 = list2.next;
            }
        }

        return dummy.next;
    }
}
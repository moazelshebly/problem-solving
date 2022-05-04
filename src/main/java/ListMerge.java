/**
 * https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class ListMerge {

	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {}

		ListNode(int val) {this.val = val;}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}

		public boolean isLessThan(ListNode o) {
			return val < o.val;
		}

		public static boolean equals(ListNode o1, ListNode o2) {
			while (o1 != null) {
				if (o1.val != o2.val) {
					return false;
				}
				o1 = o1.next;
				o2 = o2.next;
			}
			return o2 == null;
		}

	}

	/**
	 * Given the heads of two sorted linked lists, merge the two lists.
	 *
	 * @param list1 The head of the first list
	 * @param list2 The head of the second list
	 * @return The head of the merged and sorted linked list
	 */
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode dummy = new ListNode();
		ListNode current = dummy;

		while (list1 != null && list2 != null) {
			if (list1.isLessThan(list2)) {
				current.next = list1;
				current = current.next;
				list1 = list1.next;
			} else if (list2.isLessThan(list1)) {
				current.next = list2;
				current = current.next;
				list2 = list2.next;
			} else {
				current.next = new ListNode(list1.val, new ListNode(list2.val));
				current = current.next.next;
				list1 = list1.next;
				list2 = list2.next;
			}

		}

		if (list1 != null) {
			current.next = list1;
		}
		if (list2 != null) {
			current.next = list2;
		}

		return dummy.next;
	}
}

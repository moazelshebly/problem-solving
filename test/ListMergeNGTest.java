import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ListMergeNGTest {

	@Test
	public void testMergeTwoLists() {
		ListMerge.ListNode a4 = new ListMerge.ListNode(4);
		ListMerge.ListNode a2 = new ListMerge.ListNode(2, a4);
		ListMerge.ListNode a1 = new ListMerge.ListNode(1, a2);

		ListMerge.ListNode b4 = new ListMerge.ListNode(4);
		ListMerge.ListNode b3 = new ListMerge.ListNode(3, b4);
		ListMerge.ListNode b1 = new ListMerge.ListNode(1, b3);

		ListMerge.ListNode expected = new ListMerge.ListNode(
				1,
				new ListMerge.ListNode(1,
						new ListMerge.ListNode(2,
								new ListMerge.ListNode(3,
										new ListMerge.ListNode(4,
												new ListMerge.ListNode(4)
										)
								)
						)
				)
		);

		ListMerge.ListNode actual = ListMerge.mergeTwoLists(a1, b1);

		assertTrue(ListMerge.ListNode.equals(actual, expected));

	}

	@Test
	public void testMergeTwoLists2() {
		ListMerge.ListNode a5 = new ListMerge.ListNode(5);

		ListMerge.ListNode b4 = new ListMerge.ListNode(4);
		ListMerge.ListNode b3 = new ListMerge.ListNode(3, b4);
		ListMerge.ListNode b1 = new ListMerge.ListNode(1, b3);

		ListMerge.ListNode expected = new ListMerge.ListNode(
				1,
				new ListMerge.ListNode(3,
						new ListMerge.ListNode(4,
								new ListMerge.ListNode(5)
						)
				)
		);

		ListMerge.ListNode actual = ListMerge.mergeTwoLists(a5, b1);

		assertTrue(ListMerge.ListNode.equals(actual, expected));

	}

	@Test
	public void testMergeTwoLists_oneListIsNull() {
		ListMerge.ListNode a4 = new ListMerge.ListNode(4);
		ListMerge.ListNode a2 = new ListMerge.ListNode(2, a4);
		ListMerge.ListNode a1 = new ListMerge.ListNode(1, a2);

		ListMerge.ListNode expected = new ListMerge.ListNode(
				1,
				new ListMerge.ListNode(2,
						new ListMerge.ListNode(4
						)
				)
		);

		ListMerge.ListNode actual = ListMerge.mergeTwoLists(a1, null);

		assertTrue(ListMerge.ListNode.equals(actual, expected));
	}

	@Test
	public void testMergeTwoLists_twoListsAreNull() {

		ListMerge.ListNode actual = ListMerge.mergeTwoLists(null, null);

		assertTrue(ListMerge.ListNode.equals(actual, null));
	}
}
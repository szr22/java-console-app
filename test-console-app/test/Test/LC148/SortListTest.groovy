package Test.LC148

import Test.utils.Helper
import com.company.LC148.SortList
import com.company.util.ListNode

class SortListTest extends GroovyTestCase {
    void testSortList1() {
        ListNode head = new ListNode(4)
        head.next = new ListNode(2)
        head.next.next = new ListNode(1)
        head.next.next.next = new ListNode(3)

        SortList sortList = new SortList()
        def actual = sortList.sortList(head)

        ListNode expect = new ListNode(1)
        expect.next = new ListNode(2)
        expect.next.next = new ListNode(3)
        expect.next.next.next = new ListNode(4)

        assert Helper.checkListNode(actual, expect)
    }

    void testSortList2() {
        ListNode head = new ListNode(-1)
        head.next = new ListNode(5)
        head.next.next = new ListNode(3)
        head.next.next.next = new ListNode(4)
        head.next.next.next.next = new ListNode(0)

        SortList sortList = new SortList()
        def actual = sortList.sortList(head)

        ListNode expect = new ListNode(-1)
        expect.next = new ListNode(0)
        expect.next.next = new ListNode(3)
        expect.next.next.next = new ListNode(4)
        expect.next.next.next.next = new ListNode(5)

        assert Helper.checkListNode(actual, expect)
    }
}

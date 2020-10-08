package Test.LC61

import Test.utils.Helper
import com.company.LC61.RotateList
import com.company.util.ListNode

class RotateListTest extends GroovyTestCase {
    void testRotateRight1() {
        ListNode head = new ListNode(1)
        head.next = new ListNode(2)
        head.next.next = new ListNode(3)
        head.next.next.next = new ListNode(4)
        head.next.next.next.next = new ListNode(5)
        def k = 2

        RotateList rotateList = new RotateList()
        def actual =rotateList.rotateRight(head, k)

        ListNode expect = new ListNode(4)
        expect.next = new ListNode(5)
        expect.next.next = new ListNode(1)
        expect.next.next.next = new ListNode(2)
        expect.next.next.next.next = new ListNode(3)

        assert Helper.checkListNode(actual, expect)
    }

    void testRotateRight2() {
        ListNode head = new ListNode(1)
        head.next = new ListNode(2)
        head.next.next = new ListNode(3)
        def k = 4

        RotateList rotateList = new RotateList()
        def actual =rotateList.rotateRight(head, k)

        ListNode expect = new ListNode(3)
        expect.next = new ListNode(1)
        expect.next.next = new ListNode(2)

        assert Helper.checkListNode(actual, expect)
    }
}

package Test.LC142

import com.company.LC142.LinkedListCycleII
import com.company.util.ListNode

class LinkedListCycleIITest extends GroovyTestCase {
    void testDetectCycle1() {
        ListNode head = new ListNode(3)
        head.next = new ListNode(2)
        head.next.next = new ListNode(0)
        head.next.next.next = new ListNode(-4)
        head.next.next.next.next = head
        LinkedListCycleII linkedListCycleII = new LinkedListCycleII()
        def expect = head
        def actual = linkedListCycleII.detectCycle(head)

        assert  actual == expect
    }

    void testDetectCycle2() {
        ListNode head = new ListNode(1)
        head.next = new ListNode(2)
        head.next.next = head
        LinkedListCycleII linkedListCycleII = new LinkedListCycleII()
        def expect = head
        def actual = linkedListCycleII.detectCycle(head)

        assert  actual == expect
    }
}

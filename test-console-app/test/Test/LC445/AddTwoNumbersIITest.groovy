package Test.LC445

import Test.utils.Helper
import com.company.LC445.AddTwoNumbersII
import com.company.util.ListNode

class AddTwoNumbersIITest extends GroovyTestCase {
    void testAddTwoNumbers() {
        ListNode l1 = new ListNode(7)
        l1.next = new ListNode(2)
        l1.next.next = new ListNode(4)
        l1.next.next.next = new ListNode(4)

        ListNode l2 = new ListNode(5)
        l2.next = new ListNode(6)
        l2.next.next = new ListNode(4)

        AddTwoNumbersII addTwoNumbersII = new AddTwoNumbersII()
        def actual = addTwoNumbersII.addTwoNumbers(l1, l2)
        ListNode expect = new ListNode(7)
        expect.next = new ListNode(8)
        expect.next.next = new ListNode(0)
        expect.next.next.next = new ListNode(7)

        Helper.checkListNode(actual, expect)
    }
}

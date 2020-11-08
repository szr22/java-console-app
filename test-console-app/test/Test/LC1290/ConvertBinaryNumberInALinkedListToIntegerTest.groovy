package Test.LC1290

import com.company.LC1290.ConvertBinaryNumberInALinkedListToInteger
import com.company.util.ListNode

class ConvertBinaryNumberInALinkedListToIntegerTest extends GroovyTestCase {
    void testGetDecimalValue1() {
        ListNode head = new ListNode(1)
        head.next = new ListNode(0)
        head.next.next = new ListNode(1)
        ConvertBinaryNumberInALinkedListToInteger convertBinaryNumberInALinkedListToInteger = new ConvertBinaryNumberInALinkedListToInteger()
        def actual = convertBinaryNumberInALinkedListToInteger.getDecimalValue(head)
        def expect = 5

        assert actual==expect
    }

    void testGetDecimalValue2() {
        ListNode head = new ListNode(0)
        ConvertBinaryNumberInALinkedListToInteger convertBinaryNumberInALinkedListToInteger = new ConvertBinaryNumberInALinkedListToInteger()
        def actual = convertBinaryNumberInALinkedListToInteger.getDecimalValue(head)
        def expect = 0

        assert actual==expect
    }

    void testGetDecimalValue3() {
        ListNode head = new ListNode(1)
        ConvertBinaryNumberInALinkedListToInteger convertBinaryNumberInALinkedListToInteger = new ConvertBinaryNumberInALinkedListToInteger()
        def actual = convertBinaryNumberInALinkedListToInteger.getDecimalValue(head)
        def expect = 1

        assert actual==expect
    }

    void testGetDecimalValue4() {
        ListNode head = new ListNode(1)
        head.next = new ListNode(0)
        head.next.next = new ListNode(0)
        head.next.next.next = new ListNode(1)
        head.next.next.next.next = new ListNode(0)
        head.next.next.next.next.next = new ListNode(0)
        head.next.next.next.next.next.next = new ListNode(1)
        head.next.next.next.next.next.next.next = new ListNode(1)
        head.next.next.next.next.next.next.next.next = new ListNode(1)
        head.next.next.next.next.next.next.next.next.next = new ListNode(0)
        head.next.next.next.next.next.next.next.next.next.next = new ListNode(0)
        head.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0)
        head.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0)
        head.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0)
        head.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0)
        ConvertBinaryNumberInALinkedListToInteger convertBinaryNumberInALinkedListToInteger = new ConvertBinaryNumberInALinkedListToInteger()
        def actual = convertBinaryNumberInALinkedListToInteger.getDecimalValue(head)
        def expect = 18880

        assert actual==expect
    }
}

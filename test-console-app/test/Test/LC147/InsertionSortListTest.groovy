package Test.LC147

import com.company.LC147.InsertionSortList
import com.company.util.Helper
import com.company.util.ListNode

class InsertionSortListTest extends GroovyTestCase {
    void testInsertionSortList1() {
        int[] nums = [4,2,1,3]
        ListNode head = Helper.convertArrayToListNode(nums);
        InsertionSortList insertionSortList = new InsertionSortList()
        def actual = insertionSortList.insertionSortList(head)
        def expect = Helper.convertArrayToListNode([1,2,3,4] as int[])
        Test.utils.Helper.checkListNode(actual, expect)
    }

    void testInsertionSortList2() {
        int[] nums = [-1,5,3,4,0]
        ListNode head = Helper.convertArrayToListNode(nums);
        InsertionSortList insertionSortList = new InsertionSortList()
        def actual = insertionSortList.insertionSortList(head)
        def expect = Helper.convertArrayToListNode([-1,0,3,4,5] as int[])
        Test.utils.Helper.checkListNode(actual, expect)
    }
}

package Test.LC859

import com.company.LC859.BuddyStrings

class BuddyStringsTest extends GroovyTestCase {
    void testBuddyStrings1() {
        def A = "ab", B = "ba"
        BuddyStrings buddyStrings = new BuddyStrings()
        def actual = buddyStrings.buddyStrings(A, B)
        def expect = true

        assert actual == expect
    }

    void testBuddyStrings2() {
        def A = "ab", B = "ab"
        BuddyStrings buddyStrings = new BuddyStrings()
        def actual = buddyStrings.buddyStrings(A, B)
        def expect = false

        assert actual == expect
    }

    void testBuddyStrings3() {
        def A = "aa", B = "aa"
        BuddyStrings buddyStrings = new BuddyStrings()
        def actual = buddyStrings.buddyStrings(A, B)
        def expect = true

        assert actual == expect
    }

    void testBuddyStrings4() {
        def A = "aaaaaaabc", B = "aaaaaaacb"
        BuddyStrings buddyStrings = new BuddyStrings()
        def actual = buddyStrings.buddyStrings(A, B)
        def expect = true

        assert actual == expect
    }

    void testBuddyStrings5() {
        def A = "", B = "aa"
        BuddyStrings buddyStrings = new BuddyStrings()
        def actual = buddyStrings.buddyStrings(A, B)
        def expect = false

        assert actual == expect
    }
}

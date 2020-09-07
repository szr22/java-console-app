package Test.LC220

import com.company.LC220.ContainsDuplicateIII
import org.junit.Test

class ContainsDuplicateIIITest extends groovy.util.GroovyTestCase {
    @Test
    void testContainsNearbyAlmostDuplicate1() {
        def containsDuplicateIII = new ContainsDuplicateIII()
        int[] nums = [1,2,3,1]
        int k = 3
        int t = 0
        def res = containsDuplicateIII.containsNearbyAlmostDuplicate(nums, k, t)

        assert res == true
    }

    @Test
    void testContainsNearbyAlmostDuplicate2() {
        def containsDuplicateIII = new ContainsDuplicateIII()
        int[] nums = [1,0,1,1]
        int k = 1
        int t = 2
        def res = containsDuplicateIII.containsNearbyAlmostDuplicate(nums, k, t)

        assert res == true
    }

    @Test
    void testContainsNearbyAlmostDuplicate3() {
        def containsDuplicateIII = new ContainsDuplicateIII()
        int[] nums = [1,5,9,1,5,9]
        int k = 2
        int t = 3
        def res = containsDuplicateIII.containsNearbyAlmostDuplicate(nums, k, t)

        assert res == false
    }
}

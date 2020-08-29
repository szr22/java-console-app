package Test.LC969

import com.company.LC969.PancakeSorting
import org.junit.Test

class PancakeSortingTest extends GroovyTestCase {
    @Test
    public void testpancakeSort() {
        def pancakeSorting = new PancakeSorting()
        int[] A = [3,2,4,1]
        def res = pancakeSorting.pancakeSort(A)

        assert res == [3, 4, 2, 3, 1, 2]
    }

}

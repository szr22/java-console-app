package Test.LC933

import com.company.LC933.NumberOfRecentCalls

class NumberOfRecentCallsTest extends GroovyTestCase {
    void testNumberOfRecentCalls() {
        NumberOfRecentCalls numberOfRecentCalls = new NumberOfRecentCalls();
        def actual = numberOfRecentCalls.ping(1);     // requests = [1], range is [-2999,1], return 1
        assert actual == 1
        actual = numberOfRecentCalls.ping(100);   // requests = [1, 100], range is [-2900,100], return 2
        assert actual == 2
        actual = numberOfRecentCalls.ping(3001);  // requests = [1, 100, 3001], range is [1,3001], return 3
        assert actual == 3
        actual = numberOfRecentCalls.ping(3002);  // requests = [1, 100, 3001, 3002], range is [2,3002], return 3
        assert actual == 3
    }
}

package Test.LC1094

import com.company.LC1094.CarPoolingMap

class CarPoolingMapTest extends GroovyTestCase {
    void testCarPooling1() {
        int[][] trips = [[2,1,5],[3,3,7]]
        int capacity = 4

        CarPoolingMap carPoolingMap = new CarPoolingMap()
        def actual = carPoolingMap.carPooling(trips, capacity)
        def expect = false

        assert actual == expect
    }

    void testCarPooling2() {
        int[][] trips = [[2,1,5],[3,3,7]]
        int capacity = 5

        CarPoolingMap carPoolingMap = new CarPoolingMap()
        def actual = carPoolingMap.carPooling(trips, capacity)
        def expect = true

        assert actual == expect
    }

    void testCarPooling3() {
        int[][] trips = [[2,1,5],[3,5,7]]
        int capacity = 3

        CarPoolingMap carPoolingMap = new CarPoolingMap()
        def actual = carPoolingMap.carPooling(trips, capacity)
        def expect = true

        assert actual == expect
    }

    void testCarPooling4() {
        int[][] trips = [[3,2,7],[3,7,9],[8,3,9]]
        int capacity = 11

        CarPoolingMap carPoolingMap = new CarPoolingMap()
        def actual = carPoolingMap.carPooling(trips, capacity)
        def expect = true

        assert actual == expect
    }
}

package Test.LC735

import Test.utils.Helper
import com.company.LC735.AsteroidCollision

class AsteroidCollisionTest extends GroovyTestCase {
    void testAsteroidCollision1() {
        int[] asteroids = [5,10,-5]
        AsteroidCollision asteroidCollision = new AsteroidCollision()
        def actual = asteroidCollision.asteroidCollision(asteroids)
        def expect = [5,10]

        Helper.checkArray(actual,expect)
    }

    void testAsteroidCollision2() {
        int[] asteroids = [8,-8]
        AsteroidCollision asteroidCollision = new AsteroidCollision()
        def actual = asteroidCollision.asteroidCollision(asteroids)
        def expect = []

        Helper.checkArray(actual,expect)
    }

    void testAsteroidCollision3() {
        int[] asteroids = [10,2,-5]
        AsteroidCollision asteroidCollision = new AsteroidCollision()
        def actual = asteroidCollision.asteroidCollision(asteroids)
        def expect = [10]

        Helper.checkArray(actual,expect)
    }

    void testAsteroidCollision4() {
        int[] asteroids = [-2,-1,1,2]
        AsteroidCollision asteroidCollision = new AsteroidCollision()
        def actual = asteroidCollision.asteroidCollision(asteroids)
        def expect = [-2,-1,1,2]

        Helper.checkArray(actual,expect)
    }
}

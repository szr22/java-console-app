package Test.LC1041

import com.company.LC1041.RobotBoundedInCircle

class RobotBoundedInCircleTest extends GroovyTestCase {
    void testIsRobotBounded1() {
        String instructions = "GGLLGG";

        RobotBoundedInCircle robotBoundedInCircle = new RobotBoundedInCircle()

        def actual = robotBoundedInCircle.isRobotBounded(instructions)
        def expect = true

        assert actual == expect
    }

    void testIsRobotBounded2() {
        String instructions = "GG";

        RobotBoundedInCircle robotBoundedInCircle = new RobotBoundedInCircle()

        def actual = robotBoundedInCircle.isRobotBounded(instructions)
        def expect = false

        assert actual == expect
    }

    void testIsRobotBounded3() {
        String instructions = "GL";

        RobotBoundedInCircle robotBoundedInCircle = new RobotBoundedInCircle()

        def actual = robotBoundedInCircle.isRobotBounded(instructions)
        def expect = true

        assert actual == expect
    }
}

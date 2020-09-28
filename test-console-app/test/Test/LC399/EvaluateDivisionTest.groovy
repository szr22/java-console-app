package Test.LC399

import Test.utils.Helper
import com.company.LC399.EvaluateDivision

class EvaluateDivisionTest extends GroovyTestCase {
    void testCalcEquation1() {
        List<List<String>> equations = [["a","b"],["b","c"]]
        double[] values = [2.0,3.0]
        List<List<String>> queries = [["a","c"],["b","a"],["a","e"],["a","a"],["x","x"]]
        EvaluateDivision evaluateDivision = new EvaluateDivision()
        def actual = evaluateDivision.calcEquation(equations, values, queries)
        def expect = [6.00000,0.50000,-1.00000,1.00000,-1.00000]

        Helper.checkArray(actual, expect)
    }

    void testCalcEquation2() {
        List<List<String>> equations = [["a","b"],["b","c"],["bc","cd"]]
        double[] values = [1.5,2.5,5.0]
        List<List<String>> queries = [["a","c"],["c","b"],["bc","cd"],["cd","bc"]]
        EvaluateDivision evaluateDivision = new EvaluateDivision()
        def actual = evaluateDivision.calcEquation(equations, values, queries)
        def expect = [3.75000,0.40000,5.00000,0.20000]

        Helper.checkArray(actual, expect)
    }

    void testCalcEquation3() {
        List<List<String>> equations = [["a","b"]]
        double[] values = [0.5]
        List<List<String>> queries = [["a","b"],["b","a"],["a","c"],["x","y"]]
        EvaluateDivision evaluateDivision = new EvaluateDivision()
        def actual = evaluateDivision.calcEquation(equations, values, queries)
        def expect = [0.50000,2.00000,-1.00000,-1.00000]

        Helper.checkArray(actual, expect)
    }
}

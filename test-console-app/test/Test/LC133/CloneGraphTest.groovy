package Test.LC133

import com.company.LC133.CloneGraph
import com.company.util.GraphNode

class CloneGraphTest extends GroovyTestCase {
    void testCloneGraph1() {
//        int[][] adjList = [[]]
        GraphNode graphNode = new GraphNode()
        CloneGraph cloneGraph = new CloneGraph()
        def actual = cloneGraph.cloneGraph(graphNode)

//        assert actual == graphNode
        Helper.checkGraphNone(graphNode, actual)
    }
}

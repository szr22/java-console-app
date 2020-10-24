package com.company.LC133;

import com.company.util.GraphNode;

import java.util.*;

public class CloneGraph {
    public GraphNode cloneGraph(GraphNode graphNode) {
        if(graphNode == null){
            return null;
        }

        //Use bfs to get all graph GraphNodes
        List<GraphNode> GraphNodes = getGraphNodes(graphNode);

        if(GraphNodes.isEmpty()){
            return new GraphNode(graphNode.val);
        }

        //Use a map to store original GraphNode and copy GraphNode
        Map<GraphNode, GraphNode> map = new HashMap<>();

        //copy GraphNode first
        for(GraphNode cur : GraphNodes){
            map.put(cur, new GraphNode(cur.val));
        }

        //copy neighbors
        for(GraphNode cur : GraphNodes){
            GraphNode newGraphNode = map.get(cur);
            for(GraphNode neighbor : cur.neighbors){
                newGraphNode.neighbors.add(map.get(neighbor));
            }
        }
        return map.get(graphNode);
    }

    private List<GraphNode> getGraphNodes(GraphNode graphNode){
        Queue<GraphNode> queue = new LinkedList<>();
        Set<GraphNode> set = new HashSet<>();

        queue.offer(graphNode);

        while(!queue.isEmpty()){
            GraphNode cur = queue.poll();

            for(GraphNode neighbor : cur.neighbors){
                if(!set.contains(neighbor)){
                    queue.offer(neighbor);
                    set.add(neighbor);
                }
            }
        }
        return new ArrayList<>(set);
    }
}

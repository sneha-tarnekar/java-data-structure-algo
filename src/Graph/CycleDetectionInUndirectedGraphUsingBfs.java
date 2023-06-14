package Graph;

import java.util.*;

/*
 *   Given an undirected graph with V vertices and E edges, check whether it contains any cycle or not.
 *   Graph is in the form of adjacency list where adj[i] contains all the nodes ith node is having edge with.
 *
 */

public class CycleDetectionInUndirectedGraphUsingBfs {

    public static boolean checkForCycle(int src, int vertices, ArrayList<ArrayList<Integer>> adjList, boolean[] visitedNodes) {
        Queue<NodePair> queue = new LinkedList<NodePair>();
        queue.add(new NodePair(0, -1));
        visitedNodes[src] = true;

        while (!queue.isEmpty()) {
            int currentNode = queue.peek().current;
            int parentNode = queue.peek().parent;
            queue.remove();

            for (Integer adjacentNode : adjList.get(currentNode)) {
                if (!visitedNodes[adjacentNode]) {
                    visitedNodes[adjacentNode] = true;
                    queue.add(new NodePair(adjacentNode, currentNode));
                } else if (adjacentNode != parentNode) {
                    return true;
                }
            }
        }
        return false;
    }


    public static boolean isCycle(int vertices, ArrayList<ArrayList<Integer>> adjList) {
        boolean[] visitedNodes = new boolean[vertices];

//        if the graph is broken into multiple components
//        we will be checking cycle for each node which is not visited previously
        for (int i = 0; i < vertices; i++) {
            if (!visitedNodes[i]) {
                if (checkForCycle(i, vertices, adjList, visitedNodes)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList(Arrays.asList(
                new ArrayList(Arrays.asList(1)),
                new ArrayList(Arrays.asList(0, 2, 4)),
                new ArrayList(Arrays.asList(1, 3)),
                new ArrayList(Arrays.asList(2, 4)),
                new ArrayList(Arrays.asList(1, 3))
        ));

        if (isCycle(7, adjList)) {
            System.out.println("Graph contains cycle");
        } else {
            System.out.println("Graph does not contains a cycle");
        }
    }
}

class NodePair {
    int current;
    int parent;

    public NodePair(int current, int parent) {
        this.current = current;
        this.parent = parent;
    }
}

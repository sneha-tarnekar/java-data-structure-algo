package Graph;

import java.util.ArrayList;
import java.util.Arrays;

/*
*   Given an undirected graph with V vertices and E edges, check whether it contains any cycle or not.
*   Graph is in the form of adjacency list where adj[i] contains all the nodes ith node is having edge with.
*
*/
public class CycleDetectionInUndirectedGraphUsingDfs {

    public static boolean dfs(int node, int parent, boolean[] visitedArray, ArrayList<ArrayList<Integer>> adjList) {
        visitedArray[node] = true;
        for(Integer it: adjList.get(node)) {
            if (!visitedArray[it]) {
                if (dfs(it, node, visitedArray, adjList)) {
                    return true;
                }
            } else if(it != parent) {
                return true;
            }
        }
        return false;
    }

    public static boolean isCycle(int vertices, ArrayList<ArrayList<Integer>> adjList) {
        boolean[] visitedArray = new boolean[vertices+1];

//        if the graph is broken into multiple components
//        we will be checking cycle for each node which is not visited previously
        for (int i=0; i<vertices; i++) {
            if(!visitedArray[i]) {
                if (dfs(i, -1, visitedArray, adjList)) {
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

        if(isCycle(5, adjList)) {
            System.out.println("Graph contains cycle");
        } else {
            System.out.println("Graph does not contains a cycle");
        }
    }
}

package Graph;

import LinkedList.DoublyLinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {

    public static void main(String[] args) {

        /**
         * Input:
         0
         /   \
         /     \
         1       6
         / \     / \
         2   3   7   8
         / \   \
         4   5   9
         * Output should be: 0 1 6 2 3 7 8 4 5 9
         **/

        ArrayList<ArrayList<Integer>> arrList = new ArrayList<>(
                Arrays.asList(
                        new ArrayList<Integer>(Arrays.asList(1, 6)),
                        new ArrayList<Integer>(Arrays.asList(0, 2, 3)),
                        new ArrayList<Integer>(1),
                        new ArrayList<Integer>(Arrays.asList(1, 4, 5)),
                        new ArrayList<Integer>(3),
                        new ArrayList<Integer>(3),
                        new ArrayList<Integer>(Arrays.asList(0, 7, 8)),
                        new ArrayList<Integer>(Arrays.asList(6, 9)),
                        new ArrayList<Integer>(6),
                        new ArrayList<Integer>(7)
                ));

        List list = bfs(arrList.size(), arrList);
        System.out.print("BFS traversal with Adjacency list: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        GraphUsingAdjacencyList graph = new GraphUsingAdjacencyList(10);
        graph.addEdge(0, 1);
        graph.addEdge(0, 6);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);
        graph.addEdge(6, 7);
        graph.addEdge(6, 8);
        graph.addEdge(7, 9);
        System.out.println("\nBFS Traversal with GraphUsingAdjacencyList: " + bfs(graph));

    }


    // with GraphUsingAdjacencyList
    public static String bfs(GraphUsingAdjacencyList graph) {
        String result = "";

        if (graph.vertices < 1) {
            return result;
        }

        //Boolean Array to hold the history of visited nodes (by default-false)
        boolean[] visited = new boolean[graph.vertices];

        for (int i = 0; i < graph.vertices; i++) {
            //Checking whether the node is visited or not
            if (!visited[i]) {
                result = result + bfsVisit(graph, i, visited);
            }
        }

        return result;
    }

    public static String bfsVisit(GraphUsingAdjacencyList graph, int source, boolean[] visited) {
        String result = "";

        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(source);
        visited[source] = true;

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            result = result + currentNode;

            DoublyLinkedList<java.lang.Integer>.Node temp = null;

            if (graph.adjList[currentNode] != null) {
                temp = graph.adjList[currentNode].headNode;
            }

            while (temp != null) {
                if (!visited[temp.data]) {
                    queue.add(temp.data);
                    visited[temp.data] = true;
                }
                temp = temp.nextNode;
            }
        }

        return result;
    }


    // with Adjacency list
    public static List<Integer> bfs(int vertices, ArrayList<ArrayList<Integer>> adjList) {
        List<Integer> bfsList = new ArrayList<Integer>();
        boolean[] visitedNodes = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(0);
        visitedNodes[0] = true;

        while (!queue.isEmpty()) {
            Integer node = queue.poll();
            bfsList.add(node);

            for (Integer ele : adjList.get(node)) {
                if (!visitedNodes[ele]) {
                    visitedNodes[ele] = true;
                    queue.add(ele);
                }
            }
        }

        return bfsList;
    }

}

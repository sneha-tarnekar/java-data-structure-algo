package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

 * Output should be: 0 1 2 3 4 5 6 7 9 8
 **/

public class DepthFirstSearch {

    public static ArrayList<Integer> dfsOfGraph(int vertices, ArrayList<ArrayList<Integer>> adjList) {
        boolean visitedArray[] = new boolean[vertices+1];
        visitedArray[0]=true;
        ArrayList<Integer> dfsList = new ArrayList<>();
//      dfs arguments => (starting_node, adjacency_list, visited_array, result_list)
        dfs(0, adjList, visitedArray, dfsList);
        return dfsList;
    }

    public static void dfs(int startNode, ArrayList<ArrayList<Integer>> adjList, boolean[] visitedArray, ArrayList<Integer> dfsList) {
        visitedArray[startNode] = true;
        dfsList.add(startNode);
        for (Integer ele : adjList.get(startNode)) {
            if(!visitedArray[ele]) {
                dfs(ele, adjList, visitedArray, dfsList);
            }
        }
    }

    public static void main(String[] args) {
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

        List list = dfsOfGraph(arrList.size(), arrList);
        System.out.print("DFS traversal with Adjacency list: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

}

package Graph;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Given an undirected graph with V vertices.
 * We say two vertices u and v belong to a single province if there is a path from u to v or v to u.
 * The task is to find the number of provinces.
 * (A province is a group of directly or indirectly connected cities and no other cities outside of the group.)
 *
 * Input:
 *        0          3           5
 *       / \         |          / \
 *      1   2        4         6   7
 *
 * Output: 3
 *
 * */
public class NumberOfProvinces {

    public static void dfs(int startNode, ArrayList<ArrayList<Integer>> adjList, boolean[] visitedArray) {
        visitedArray[startNode] = true;
        for (Integer ele : adjList.get(startNode))
            if (!visitedArray[ele]) {
                dfs(ele, adjList, visitedArray);
            }
    }

    public static int numberOfProvinces(int vertices, ArrayList<ArrayList<Integer>> adjList) {
        boolean[] visitedArray = new boolean[adjList.size() + 1];
        int count = 0;
        for (int i = 0; i < adjList.size(); i++) {
            if (!visitedArray[i]) {
                count++;
                dfs(i, adjList, visitedArray);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>(
                Arrays.asList(
                        new ArrayList<Integer>(Arrays.asList(1, 2)),
                        new ArrayList<Integer>(Arrays.asList(0)),
                        new ArrayList<Integer>(Arrays.asList(0)),
                        new ArrayList<Integer>(Arrays.asList(4)),
                        new ArrayList<Integer>(Arrays.asList(3)),
                        new ArrayList<Integer>(Arrays.asList(6, 7)),
                        new ArrayList<Integer>(Arrays.asList(5)),
                        new ArrayList<Integer>(Arrays.asList(5))
                ));

        System.out.println("Number of Provinces is " + numberOfProvinces(arrayList.size(), arrayList));
    }
}

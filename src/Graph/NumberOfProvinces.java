package Graph;

import java.util.ArrayList;
import java.util.Arrays;


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

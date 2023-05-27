package Graph;

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
		
		for(int i=0; i<list.size();i++) {
			System.out.print(list.get(i) + " ");
		}

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

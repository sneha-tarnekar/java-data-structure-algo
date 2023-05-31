package Graph;

import LinkedList.DoublyLinkedList;

public class GraphUsingAdjacencyList {
	int vertices;
	DoublyLinkedList<Integer> adjList[];
	
	@SuppressWarnings("unchecked")
	public GraphUsingAdjacencyList(int vertices) {
		this.vertices = vertices;
		adjList = new DoublyLinkedList[vertices];
		
		for(int i=0; i<vertices; i++) {
			adjList[i] = new DoublyLinkedList<>();
		}
	}
	
	public void addEdge(int source, int destination) {
		 if (source < vertices && destination < vertices) {
			 this.adjList[source].insertAtTail(destination);
			 this.adjList[destination].insertAtTail(source); 	// For undirected graph
		 }
	}

	public static void main(String[] args) {
		GraphUsingAdjacencyList graph = new GraphUsingAdjacencyList(5);
		graph.addEdge(1, 2);
		graph.addEdge(2, 3);
		graph.addEdge(3, 5);
		graph.addEdge(1, 4);
		graph.addEdge(1, 3);
	}

}

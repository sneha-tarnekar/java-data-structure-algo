package Graph;

public class GraphUsingAdjacencyMatrix {
	public int vertices;
	public int matrix[][];
	
	public GraphUsingAdjacencyMatrix(int vertices) {
		this.vertices = vertices;
		matrix = new int[vertices+1][vertices+1];
	}
		
	public void addEdge(int source, int destination) {
		matrix[source][destination] = 1;
		matrix[destination][source] = 1; 	// For Undirected Graph
	}
	
	public void printGraph()
    {
        for(int i=1; i<=vertices; i++) {
        	for (int j=1; j<=vertices; j++) {
        		System.out.print(matrix[i][j]+ " ");
        	}
        	System.out.println();
        }
    }
	
	public static void main(String[] args) {
		GraphUsingAdjacencyMatrix graph = new GraphUsingAdjacencyMatrix(5);
		graph.addEdge(1, 2);
		graph.addEdge(2, 3);
		graph.addEdge(3, 5);
		graph.addEdge(1, 4);
		graph.addEdge(1, 3);
		graph.printGraph();
	}

}

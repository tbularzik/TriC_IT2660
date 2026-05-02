import java.util.*;

class Main {
  public static void main(String[] args) {
    // 1. Define the vertices (buildings) based on the campus map
    List<String> vertices = new ArrayList();
    vertices.add("Liberal Arts"); // 0
    vertices.add("Student Services"); // 1
    vertices.add("Health Careers & Sciences"); // 2
    vertices.add("Health Technologies Center"); // 3
    vertices.add("Recreation Center"); // 4
    vertices.add("Technology Learning Center"); // 5
    vertices.add("Business & Technology"); // 6

    // 2-Define Edges
    List<Edge> edges = new ArrayList();
    edges.add(new Edge(0, 1)); // Liberal Arts <> Student Services
    edges.add(new Edge(0, 6)); // Liberal Arts <> Business & Technology
    edges.add(new Edge(1, 6)); // Student Services <> Business & Technology
    edges.add(new Edge(1, 5)); // Student Services <> Technology Learning Center
    edges.add(new Edge(1, 2)); // Student Services <> Health Careers
    edges.add(new Edge(2, 3)); // Health Careers <> Health Technologies

    // 3. Create the graph (name "graph") using the vertices and edges
    UnweightedGraph graph = new UnweightedGraph(vertices, edges);

    // 4. Perform a depth-first search (name "dfs")(DFS) starting from the "Business
    // & Technology" building
    var dfsTree = graph.dfs(0);

    // 5. Retrieve and print the search order of the DFS traversal
    var searchOrder = dfsTree.getSearchOrder();
    System.out.println(searchOrder);

    // 6. Print the parent-child relationships for each vertex during the DFS
    // traversal
    for (int i = 0; i < searchOrder.size(); i++) {
      var parent = dfsTree.getParent((int) searchOrder.get(i));
      System.out.println("Parent of " + searchOrder.get(i) + " is " + parent);
    }

    // 7. Call the printPath method (assuming this method exists in the
    // UnweightedGraph class)
    dfsTree.printPath(6);
    System.out.println();

    // 8. Call printTree() to print the entire DFS tree (assuming this method exists
    // in the UnweightedGraph class)
    dfsTree.printTree();

  }
}
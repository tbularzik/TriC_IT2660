class Main {
  public static void main(String[] args) {

    // Step 1 - Create a BST tree object called lab5Tree
    var lab5Tree = new BST<Integer>();

    // Step 2 - Insert the following values: 13, 22, 36, 5, 48, 17, 39, 2, 26, 40,
    // 29, 34, 10
    int[] values = { 13, 22, 36, 5, 48, 17, 39, 2, 26, 40, 29, 34, 10 };
    for (int i = 0; i < values.length; i++) {
      lab5Tree.insert(values[i]);
    }

    // Step 3 - Delete the value 17
    lab5Tree.delete(17);

    // Step 4 - Traverse and output the values using inorder (sorted)
    lab5Tree.inorder();
    System.out.println("");

    // Step 5 - Traverse and output the values using postorder
    lab5Tree.postorder();
    System.out.println("");

    // Step 6 - Traverse and output the values using preorder
    lab5Tree.preorder();
    System.out.println("");

    // Step 7 - Display the result of a search for the value 36
    boolean searchResult = lab5Tree.search(36);
    System.out.println(searchResult);

    // Step 8 - Display the result of a search for the value 37
    boolean searchResult2 = lab5Tree.search(37);
    System.out.println(searchResult2);

    // Step 9 - Using the path() method, display the path from the root to 2
    java.util.ArrayList<BST.TreeNode<Integer>> pathToNode = lab5Tree.path(2);
    for (int i = 0; i < pathToNode.size(); i++) {
      System.out.print(pathToNode.get(i).element + " ");
    }
    System.out.println("");

    // Step 10 - Display the path from the root to 34
    java.util.ArrayList<BST.TreeNode<Integer>> pathToNode2 = lab5Tree.path(34);
    for (int i = 0; i < pathToNode2.size(); i++) {
      System.out.print(pathToNode2.get(i).element + " ");
    }
  }
}
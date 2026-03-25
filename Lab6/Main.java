class Main {
  public static void main(String[] args) {
    // Use the instructions in Blackboard or instructions.md to complete Lab 6
    
    // Step 3: Create a map valled creditHours.
    MyHashMap<String, Integer> creditHours = new MyHashMap<String, Integer>();

    // Step 4: put() the following values:
    creditHours.put("IT-1025", 3);
    creditHours.put("IT-1050", 3);
    creditHours.put("IT-1150", 3);
    creditHours.put("IT-2310", 3);
    creditHours.put("IT-2320", 4);
    creditHours.put("IT-2351", 4);
    creditHours.put("IT-2650", 4);
    creditHours.put("IT-2660", 4);
    creditHours.put("IT-2030", 4);

    // Step 5: Check for the following values. Didsplay true of false depending on whether
    // or not the map has the key.
    boolean containsKey1 = creditHours.containsKey("IT-1025");
    System.out.println(containsKey1);

    boolean containsKey2 = creditHours.containsKey("IT-2110");
    System.out.println(containsKey2);

    // Print all of the values in the map.
    var values1 = creditHours.values().toArray();
    for (int i = 0; i < values1.length; i++){
      System.out.print(values1[i] + " ");
    }
    System.out.println("");

    // Step 7: Remove IT-2030 and IT-1150.
    creditHours.remove("IT-2030");
    creditHours.remove("IT-1150");

    // Step 8: Print all of the values in the map.
    var values2 = creditHours.values().toArray();
    for (int i = 0; i < values2.length; i++){
      System.out.print(values2[i] + " ");
    }
  }
}
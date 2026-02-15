// IT-2660
// Assignment 4
// Ted Bularzik

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    System.out.println("Unsorted Array ---------------------------------------------------");
    ArrayList<Integer> integerList = Lab4.getList();
    Lab4.outputList(integerList);

    System.out.println("\n\nBubble sort results ----------------------------------------------");
    long startTime = System.currentTimeMillis();
    ArrayList<Integer> bubbleSortedList = Lab4.bubbleSort(integerList);
    long endTime = System.currentTimeMillis();
    long elapsedTime = endTime - startTime;
    System.out.println(elapsedTime + " milliseconds elapsed.");
    Lab4.outputList(bubbleSortedList);

    System.out.println("\n\nInsertion sort results -------------------------------------------");
    startTime = System.currentTimeMillis();
    ArrayList<Integer> insertionSortedList = Lab4.insertionSort(integerList);
    endTime = System.currentTimeMillis();
    elapsedTime = endTime - startTime;
    System.out.println(elapsedTime + " milliseconds elapsed.");
    Lab4.outputList(insertionSortedList);

    // Added Java implementation for comparison
    System.out.println("\n\nJava-implemented sort results -------------------------------------------");
    startTime = System.currentTimeMillis();
    Collections.sort(integerList);
    endTime = System.currentTimeMillis();
    elapsedTime = endTime - startTime;
    System.out.println(elapsedTime + " milliseconds elapsed.");
    Lab4.outputList(integerList);
  }
}

class Lab4 {
  public static ArrayList<Integer> insertionSort(ArrayList<Integer> integerList) {
    // Step 1 - Implement insertion sort algorithm here
    for (int i = 1; i < integerList.size(); i++) {

      int valueToSort = integerList.get(i);

      // Compare with sorted integers
      for (int j = 0; j < i; j++) {

        int valueToCompare = integerList.get(j);

        // If value we're sorting is less than value we're comparing it to
        if (valueToSort < valueToCompare) {
          // Add the value we're sorting at the current index
          integerList.add(j, valueToSort);
          // Remove the value we're sorting from its current location
          // (will be 1 greater because of the add)
          integerList.remove(i + 1);
          // Don't do any more comparisons for the sorted value
          break;
        }
      }
    }
    return integerList;
  }

  public static ArrayList<Integer> bubbleSort(ArrayList<Integer> integerList) {
    // Step 2 - Implement the bubble sort algorithm here
    for (int i = 0; i < integerList.size() - 1; i++) {
      // Loop through unsorted values
      for (int j = 0; j < integerList.size() - 1 - i; j++) {
        int valueToSort = integerList.get(j);
        int valueToCompare = integerList.get(j + 1);

        // If the value we're sorting is greater than what we're comparing it to
        if (valueToSort > valueToCompare) {
          // Swap them
          integerList.set(j, valueToCompare);
          integerList.set(j + 1, valueToSort);
        }
      }
    }
    return integerList;
  }

  public static ArrayList<Integer> getList() {
    ArrayList<Integer> integerList = new ArrayList<>();
    String line;
    try (BufferedReader br = new BufferedReader(new FileReader("integers.txt"))) {
      while ((line = br.readLine()) != null) {
        integerList.add(Integer.parseInt(line));
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return integerList;
  }

  public static void outputList(ArrayList<Integer> integerList) {
    for (int i = 0; i < integerList.size(); i++) {
      System.out.print(integerList.get(i) + " ");
    }
  }
}
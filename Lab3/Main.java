// IT-2660
// Assignment 3
// Ted Bularzik

public class Main {
  public static void main(String[] args) {
    String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    String bestCase = "A"; // The first character is the best case for linear search

    // * Initialize startTime here
    long startTime = System.nanoTime();
    int index = match(text, bestCase);
    // * Initialize endTime here
    long endTime = System.nanoTime();
    // * Calculate elapsedTime here
    long elapsedTime = endTime - startTime;
    System.out.println(elapsedTime + " nanoseconds elapsed.");

    if (index >= 0)
      System.out.println("best-case input matched at index " + index);
    else
      System.out.println("best-case input unmatched");

    String worstCase = "9"; // The last character is the worst case for linear search

    // * Initialize startTime here
    startTime = System.nanoTime();
    index = match(text, worstCase);
    // * Initialize endTime here
    endTime = System.nanoTime();
    // * Calculate elapsedTime here
    elapsedTime = endTime - startTime;
    System.out.println(elapsedTime + " nanoseconds elapsed.");

    if (index >= 0)
      System.out.println("worst-case input matched at index " + index);
    else
      System.out.println("worst-case input unmatched");
  }

  // Return the index of the first match. -1 otherwise.
  public static int match(String text, String pattern) {
    for (int i = 0; i < text.length() - pattern.length() + 1; i++) {
      if (isMatched(i, text, pattern))
        return i;
    }

    return -1;
  }

  // Test if pattern matches text starting at index i
  private static boolean isMatched(int i, String text,
      String pattern) {
    for (int k = 0; k < pattern.length(); k++) {
      if (pattern.charAt(k) != text.charAt(i + k)) {
        return false;
      }
    }

    return true;
  }
}
//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Ted Bularzik
 */

public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");

    Lab1 lab = new Lab1();
    System.out.println(lab.increment(1));

    // Create an array with values {5, 9, 3, 12, 7, 3, 11, 5}
    int[] testArray = { 5, 9, 3, 12, 7, 3, 11, 5 };
    int i = 0;

    // Output the array in order using a while loop
    while (i < testArray.length) {
      System.out.println(testArray[i]);
      i++;
    }

    // Output the array in reverse using a for loop
    for (int j = testArray.length - 1; j >= 0; j--) {
      System.out.println(testArray[j]);
    }

    // Output the first and last values of the array.
    System.out.println(testArray[0]);
    System.out.println(testArray[testArray.length - 1]);

    // Call the methods created in Lab1.
    System.out.println(lab.max(5, 12));
    System.out.println(lab.min(7, 4));
    System.out.println(lab.sum(testArray));
    System.out.println(lab.average(testArray));
    System.out.println(lab.max(testArray));
    System.out.println(lab.min(testArray));
  }
}

// Add all of the methods here
class Lab1 {
  public int increment(int num) {
    return ++num;
  }

  public int max(int a, int b) {
    if (a > b) {
      return a;
    } else { // a <= b
      return b; // If they're equal, will just return what they're both equal to
    }
  }

  public int min(int a, int b) {
    if (a < b) {
      return a;
    } else { // a >= b
      return b; // If they're equal, will just return what they're both equal to
    }
  }

  public int sum(int[] nums) {
    int sum = 0;
    for (int num : nums) {
      sum = sum + num;
    }
    return sum;
  }

  public double average(int[] nums) // Returns a double because average may not be a whole number
  {
    int sum = 0;
    for (int num : nums) { // Not technically a foreach loop, but accomplishes the same thing
      sum = sum + num;
    }
    double average = sum / nums.length;
    return average;
  }

  public int max(int[] nums) {
    int max = nums[0]; // Start with statement that the max num is the first one, then we'll compare as
                       // we go
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > max) {
        max = nums[i];
      }
    }
    return max;
  }

  public int min(int[] nums) {
    int min = nums[0]; // Start with statement that the min num is the first one, then we'll compare as
                       // we go
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] < min) {
        min = nums[i];
      }
    }
    return min;
  }
}
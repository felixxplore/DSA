package Array.Exercises;

import java.io.*;
import java.util.*;

public class Non_DecreasingArray {

  public static boolean isPossible(int[] arr, int n) {
    // Write your code here.

    return canMakeNonDecreasing(arr);
  }

  public static boolean canMakeNonDecreasing(int[] arr) {
    int countDecreasing = 0;

    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        countDecreasing++;
        if (countDecreasing > 1) {
          return false;
        }
      }
    }

    if (countDecreasing == 0) {
      return true;
    }

    // Check if modifying one element can make the array non-decreasing
    int index = 0;
    while (index < arr.length - 1 && arr[index] <= arr[index + 1]) {
      index++;
    }

    if (index == 0 || index == arr.length - 2) {
      return true;
    }

    return arr[index - 1] <= arr[index + 1] || arr[index] <= arr[index + 2];
  }
}

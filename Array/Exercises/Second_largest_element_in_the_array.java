package Array.Exercises;

import java.util.Arrays;

public class Second_largest_element_in_the_array {

  public static void main(String[] args) {
    // we do secound largest element total 3 approaches :

    int[] a = { 12, 35, 1, 10, 34, 1 };

    System.out.println(approach3(a));
  }

  //   approach 1 :
  static int approach1(int[] arr) {
    // Write your code here.

    // first i sort array :

    if (arr.length == 0) {
      return -1;
    }
    Arrays.sort(arr);
    int largest = arr[arr.length - 1];
    int secoundLargest = -1;

    for (int i = arr.length - 2; i >= 0; i--) {
      if (arr[i] != largest) {
        secoundLargest = arr[i];
        break;
      }
    }

    return secoundLargest;
  }

  // approach 2 :

  static int approach2(int[] arr) {
    int largest = arr[0];
    int secondLargest = -1;

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > largest) {
        secondLargest = largest;
        largest = arr[i];
      } else if (arr[i] > secondLargest && arr[i] < largest) {
        secondLargest = arr[i];
      }
    }
    return secondLargest;
  }

  static int approach3(int[] arr) {
    int max = arr[0];
    int seclar = -1;

    //     first find max :
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > seclar && arr[i] != max) {
        seclar = arr[i];
      }
    }
    return seclar;
  }
}

package recursion_pattern_bubble_quick_merge;

import java.util.Arrays;

public class bubbleSorting {

  public static void main(String[] args) {
    int[] a = { 4, 3, 2, 1 };
    bubbleSort(a, a.length - 1, 0);

    System.out.println(Arrays.toString(a));
  }

  static void bubbleSort(int a[], int row, int col) {
    if (row == 0) {
      return;
    }
    if (col < row) {
      if (a[col] > a[col + 1]) {
        int temp = a[col];
        a[col] = a[col + 1];
        a[col + 1] = temp;
      }
      bubbleSort(a, row, col + 1);
    } else {
      bubbleSort(a, row - 1, 0);
    }
  }
}

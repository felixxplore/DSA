package recursion_pattern_bubble_quick_merge;

import java.util.Arrays;

public class selectionSort {

  public static void main(String[] args) {
    int[] a = { 4, 3, 2, 1 };

    selection(a, 4, 0, 0);
    System.out.println(Arrays.toString(a));
  }

  static void selection(int[] a, int row, int col, int max) {
    if (row == 0) {
      return;
    }

    if (col < row) {
      if (a[col] > a[max]) {
        selection(a, row, col + 1, col);
      } else {
        selection(a, row, col + 1, max);
      }
    } else {
      int temp = a[max];
      a[max] = a[row - 1];
      a[row - 1] = temp;

      selection(a, row - 1, 0, 0);
    }
  }
}

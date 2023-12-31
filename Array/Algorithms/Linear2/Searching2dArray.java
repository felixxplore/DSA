package Linear2;

import java.util.Arrays;

public class Searching2dArray {

  public static void main(String[] args) {
    int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    int target = 3;

    System.out.println(Arrays.toString(findElement(arr, target)));
  }

  static int[] findElement(int[][] a, int target) {
    int n = a.length;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < a[i].length; j++) {
        if (a[i][j] == target) {
          return new int[] { i, j };
        }
      }
    }
    return new int[] {};
  }
}

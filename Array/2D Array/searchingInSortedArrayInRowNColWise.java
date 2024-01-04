import java.util.Arrays;

public class searchingInSortedArrayInRowNColWise{

  public static void main(String[] args) {
    /*
     * searching in 2d array : question 1
     * for searching traverse array and check equality
     * it's called linear searching :
     */

    /*
     * question 2 :
     * matrix is sorted in a rowwise and column wise manner
     * in this question rowwise sorted and also column wise sorted
     * here matrix is sorted : so think about can i minimize searching space
     *
     */

    //  this method to find the target element : time complexity  : pow(n,2);
    // int[][] a = {
    //   { 10, 20, 30, 40 },
    //   { 15, 25, 35, 45 },
    //   { 28, 29, 37, 49 },
    //   { 33, 34, 38, 50 },
    // };
    // int target = 37;
    // for (int i = 0; i < a.length; i++) {
    //   for (int j = 0; j < a[i].length; j++) {
    //     if (a[i][j] == target) {
    //       System.out.println(i + " " + j);
    //     }
    //   }
    // }

    // --------------------------------------
    int[][] a = {
      { 10, 20, 30, 40 },
      { 15, 25, 35, 45 },
      { 28, 29, 37, 49 },
      { 33, 34, 38, 50 },
    };
    int target = 39;
    System.out.println(Arrays.toString(search(a, target)));
  }

  static int[] search(int[][] matrix, int target) {
    int row = 0;
    int col = matrix[0].length - 1;

    while (row < matrix.length && col >= 0) {
      if (matrix[row][col] == target) {
        return new int[] { row, col };
      }
      if (matrix[row][col] > target) {
        col--;
      } else {
        row++;
      }
    }
    return new int[] { -1, -1 };
  }
}

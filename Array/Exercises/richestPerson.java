package Array.Exercises;

public class richestPerson {

  public static void main(String[] args) {
    int[][] a = { { 1, 5 }, { 7, 3 }, { 3, 5 } };
    System.out.println(findmax(a));
  }

  static int findmax(int[][] a) {
    int n = a.length;

    int max = Integer.MIN_VALUE;

    for (int row = 0; row < n; row++) {
      int count = 0;
      for (int col = 0; col < a[row].length; col++) {
        count = count + a[row][col];
      }

      if (count > max) {
        max = count;
      }
    }
    return max;
  }
}

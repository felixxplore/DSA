public class _10pattner {

  public static void main(String[] args) {
    int original = 4;
    int n = 4;
    n = 2 * n;

    for (int row = 0; row <= n; row++) {
      for (int col = 0; col <= n; col++) {
        int perfactPosi =
          original - Math.min(Math.min(row, col), Math.min(n - row, n - col));

        System.out.print(perfactPosi);
      }
      System.out.println();
    }
  }
}

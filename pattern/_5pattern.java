package pattern;

public class _5pattern {

  public static void main(String[] args) {
    int size = 5;
    for (int row = 1; row <= 2 * size-1; row++) {
      int formula = row > size ? 2 * size - row : row;

      for (int col = 1; col <= formula; col++) {
        System.err.print("* ");
      }
      System.out.println();
    }
  }
}

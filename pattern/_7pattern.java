package pattern;

public class _7pattern {

  public static void main(String[] args) {
    int size = 5;

    for (int row = 1; row <= 2 * size - 1; row++) {
      // create spaces :
      int star = row > size ? 2 * size - row : row;

      int space = size - star;
      for (int col = 1; col <= space; col++) {
        System.out.print(" ");
      }

      //   create start
      for (int col = 1; col <= star; col++) {
        System.out.print("* ");
      }

      System.out.println();
    }
  }
}

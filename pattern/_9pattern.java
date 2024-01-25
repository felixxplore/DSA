public class _9pattern {

  public static void main(String[] args) {
    int size = 5;
    for (int row = 1; row <= 2 * size - 1; row++) {
      // create space :
      int element = row > size ? 2 * size - row : row;
      int space = size - element;
      for (int col = 1; col <= space; col++) {
        System.out.print("  ");
      }
      //   print 5 to 1 :
      for (int col = element; col >= 1; col--) {
        System.out.print(col + " ");
      }
      for (int col = 2; col <= element; col++) {
        System.out.print(col + " ");
      }
      System.out.println();
    }
  }
}

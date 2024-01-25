 

public class _8pattnern {

  public static void main(String[] args) {
    int size = 5;
    for (int row = 1; row <= size; row++) {
      // create space :
      for (int col = 1; col <= size - row; col++) {
        System.out.print("  ");
      }
      //   print 5 to 1 :
      for (int col = row; col >= 1; col--) {
        System.out.print(col + " ");
      }
      for (int col = 2; col <= row; col++) {
        System.out.print(col + " ");
      }
      System.out.println();
    }
  }
}

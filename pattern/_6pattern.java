package pattern;

public class _6pattern {

  public static void main(String[] args) {
    int size = 5;

    for (int row = 1; row <= size; row++) {
      // create spaces :
      for (int col = 1; col <= size - row + 1; col++) {
        System.out.print(" ");
      }

      //   create start
      for (int col = 1; col <= row; col++) {
        System.out.print("* ");
      }

      System.out.println();
    }

    for (int row = size-1; row >=1; row--) {
        // create spaces :
        for (int col = 1; col <= size - row + 1; col++) {
          System.out.print(" ");
        }
  
        //   create start
        for (int col = 1; col <= row; col++) {
          System.out.print("* ");
        }
  
        System.out.println();
      }
  }
}

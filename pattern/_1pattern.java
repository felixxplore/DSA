package pattern;

public class _1pattern {

  public static void main(String[] args) {
    int size = 5;
    for (int row = 1; row <= size; row++) {
      for (int col = 1; col <= row; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}

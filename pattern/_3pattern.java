package pattern;

public class _3pattern {

  public static void main(String[] args) {
    int size = 5;
    for (int row = 1; row <= size; row++) {
      // each row pe row hain utne hee colums hone chaiye :
      for (int col = 1; col <= row; col++) {
        System.out.print(col + " ");
      }
      System.out.println();
    }
  }
}

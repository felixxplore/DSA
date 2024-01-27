public class findithBits {

  public static void main(String[] args) {
    int n = 3;
    int i = 2;

    System.out.println((n >> (i - 1)) & 1);
  }
}

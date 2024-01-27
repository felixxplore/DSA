public class findUniqueINArray {

  public static void main(String[] args) {
    int[] a = { 1, 2, 3, 3, 2, 5, 1 };

    //     int xor = 0;
    //     for (int i = 0; i < a.length; i++) {
    //       xor = xor ^ a[i];
    //     }
    //     System.out.println(xor);

    int ans = 10 ^ 2 ^ 3 ^ 4 ^ 4 ^ 3 ^ 2;
    System.out.println(ans);
  }
}

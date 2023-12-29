public class maximumFind {

  public static void main(String[] args) {
    int[] num = { 1000, 1, 1111, 1111, 2, 3, 5, 0, 10 };
    // ans : 5
    System.out.println(maximum(num));
  }

  static int maximum(int[] arr) {
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      max = Math.max(arr[i], max);
    }
    return max;
  }
}
 
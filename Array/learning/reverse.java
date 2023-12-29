import java.util.Arrays;

public class reverse {

  public static void main(String[] args) {
    int[] nums = { 1, 2, 4, 5 };

    System.out.println("before reverse :");
    System.out.println(Arrays.toString(nums));
    // rev(nums);
    reverseUsingRecursive(nums);
    System.out.println("After reversed :");
    System.out.println(Arrays.toString(nums));
  }

  static int[] rev(int[] arr) {
    int start = 0;
    int last = arr.length - 1;

    while (start < last) {
      swap(arr, start, last);
      start++;
      last--;
    }
    return arr;
  }

  static int[] swap(int[] arr, int indx1, int indx2) {
    int temp = arr[indx1];
    arr[indx1] = arr[indx2];
    arr[indx2] = temp;
    return arr;
  }

  //   trying to recursive call :
  static int[] reverseUsingRecursive(int[] arr) {
    int start = 0;
    int last = arr.length - 1;
    return recursive(arr, start, last);
  }

  static int[] recursive(int[] arr, int start, int last) {
    if (start > last) {
      return arr;
    }

    int temp = arr[start];
    arr[start] = arr[last];
    arr[last] = temp;
    return recursive(arr, start + 1, last - 1);
  }
}

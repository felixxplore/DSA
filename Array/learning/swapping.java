import java.util.Arrays;

public class swapping {

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 5 };

    System.out.println(Arrays.toString(nums));
    swap(nums, 0, 4);
    System.out.println(Arrays.toString(nums));
  }

  static int[] swap(int[] arr, int indx1, int indx2) {
    int temp = arr[indx1];
    arr[indx1] = arr[indx2];
    arr[indx2] = temp;
    return arr;
  }
}

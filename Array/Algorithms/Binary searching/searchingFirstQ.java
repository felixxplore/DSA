public class searchingFirstQ {

  public static void main(String[] args) {
    // int[] a = { 1, 2, 3, 4, 5 };
    int[] a = { 5, 4, 3, 2, 1 };
    System.out.println(find(a, 4));
  }

  static int find(int[] a, int target) {
    int start = 0;
    int end = a.length - 1;

    boolean isSorted = a[start] < a[end];

    while (start <= end) {
      int mid = start + ((end - start) / 2);

      if (a[mid] == target) {
        return mid;
      }

      if (isSorted) {
        if (target < a[mid]) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      } else {
        if (target > a[mid]) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      }
    }
    return -1;
  }
}

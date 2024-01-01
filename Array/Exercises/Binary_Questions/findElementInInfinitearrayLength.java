package Array.Exercises.Binary_Questions;

public class findElementInInfinitearrayLength {

  public static void main(String[] args) {
    int[] a = { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
    int target = 10;

    System.out.println(ans(a, target));
  }

  static int ans(int[] a, int target) {
    int start = 0;
    int end = 1;

    while (target > a[end]) {
      int newStart = end + 1;

      end = end + ((end - start) + 1 * 2);
      start = newStart;
    }

    return searchingbinary(a, target, start, end);
  }

  static int searchingbinary(int[] a, int target, int start, int end) {
    int mid = -1;

    while (start <= end) {
      mid = start + ((end - start) / 2);
      if (a[mid] == target) {
        return mid;
      } else if (a[mid] > target) {
        end = mid - 1;
      } else if (a[mid] < target) {
        start = mid + 1;
      }
    }

    return mid;
  }
}

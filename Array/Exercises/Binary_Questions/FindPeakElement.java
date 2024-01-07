package Array.Exercises.Binary_Questions;

public class FindPeakElement {

  public static void main(String[] args) {
    int[] a = { 4,5,6,1,2,3 };
    System.out.println(peakElement(a));
  }

  static int peakElement(int[] a) {
    int start = 0;
    int end = a.length - 1;
    int ans = -1;
    while (start < end) {
      int mid = start + ((end - start) / 2);

      if (a[mid] > a[mid + 1]) {
        end = mid;
      } else {
        start = mid + 1;
      }
    }

    return start;
  }
}

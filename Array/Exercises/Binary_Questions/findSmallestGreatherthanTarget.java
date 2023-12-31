package Array.Exercises.Binary_Questions;

public class findSmallestGreatherthanTarget {

  public static void main(String[] args) {
    int[] a = { 2, 3, 5, 9, 14, 16, 18 };
    int target = 4;

    System.out.println(smallestElemet(a, target));
  }

  static int smallestElemet(int[] a, int target) {
    int start = 0;
    int end = a.length - 1;
    int min = Integer.MAX_VALUE;
    int mid = -1;
    while (start <= end) {
      mid = start + ((end - start) / 2);
      if (a[mid] == target) {
        return a[mid];
      } else if (a[mid] > target) {
        end = mid - 1;
      } else if (a[mid] < target) {
        start = mid + 1;
      }
    }

    return a[start];
  }
}

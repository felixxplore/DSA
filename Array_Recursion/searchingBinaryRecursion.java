public class searchingBinaryRecursion {

  public static void main(String[] args) {
    int[] a = { 5, 6, 7, 8, 9, 1, 2, 3 };

    int[] b = { 1, 2, 3, 4, 5, 6, 7 };

    // System.out.println(pivot(a, 0));
    // System.out.println(binarySearching(b, 7, 0, b.length - 1));

    int pivotIndex = pivot(a, 0);
    int target = 18;

    int start = 0;
    int end = a.length - 1;
    int ans = 0;

    if (target <=a[pivotIndex] && target >= a[start]) {
      ans = binarySearching(a, target, start, pivotIndex);
    } else {
      ans = binarySearching(a, target, pivotIndex + 1, end);
    }

    System.out.println(ans);
  }

  static int pivot(int[] a, int i) {
    if (i == a.length) {
      return -1;
    }
    if (a[i] < a[i + 1]) {
      return pivot(a, i + 1);
    } else {
      return i;
    }
  }

  // find element in rotated sorted array :
  static int binarySearching(int[] a, int target, int start, int end) {
    if (start > end) {
      return -1;
    }

    int mid = start + (end - start) / 2;

    if (a[mid] == target) {
      return mid;
    } else if (a[mid] < target) {
      return binarySearching(a, target, mid + 1, end);
    } else {
      return binarySearching(a, target, start, mid - 1);
    }
  }
}

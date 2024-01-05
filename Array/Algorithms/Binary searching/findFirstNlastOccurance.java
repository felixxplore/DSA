public class findFirstNlastOccurance {

  public static void main(String[] args) {
    int[] a = { 2, 4, 6, 8, 8, 8, 11, 13 };
    int target = 9;

    System.out.println(first(a, target));
    System.out.println(lowerbound(a, target));
    System.out.println(last(a, target));
  }

  static int first(int[] a, int target) {
    int start = 0;
    int end = a.length - 1;

    int ans = -1;

    while (start <= end) {
      int mid = start + ((end - start) / 2);

      if (a[mid] == target) {
        ans = mid;
        end = mid - 1;
      } else if (a[mid] < target) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return ans;
  }

  static int last(int[] a, int target) {
    int start = 0;
    int end = a.length - 1;

    int ans = -1;

    while (start <= end) {
      int mid = start + ((end - start) / 2);

      if (a[mid] == target) {
        ans = mid;
        start = mid + 1;
      } else if (a[mid] < target) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return ans;
  }

  static int lowerbound(int[] a, int target) {
    int start = 0;
    int end = a.length - 1;

    int ans = -1;

    while (start <= end) {
      int mid = start + ((end - start) / 2);

      if (a[mid] >= target) {
        ans = mid;
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return ans;
  }
}

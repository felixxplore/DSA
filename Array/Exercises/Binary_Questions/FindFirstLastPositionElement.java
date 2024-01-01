package Array.Exercises.Binary_Questions;

import java.util.Arrays;

public class FindFirstLastPositionElement {

  public static void main(String[] args) {
    int[] a = { 5, 7, 7, 8, 8, 10 };
    int target = 8;
    int[] ans = { -1, -1 };
    int first = lastPos(a, target, true);
    int last = lastPos(a, target, false);

    ans[0] = first;
    ans[1] = last;

    System.out.println(Arrays.toString(ans));
  }

  static int lastPos(int[] a, int target, boolean possible) {
    int end = a.length - 1;
    int start = 0;
    int ans = -1;
    while (start <= end) {
      int mid = start + ((end - start) / 2);

      if (a[mid] > target) {
        end = mid - 1;
      } else if (a[mid] < target) {
        start = mid + 1;
      } else {
        ans = mid;
        if (possible) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      }
    }
    return ans;
  }
}

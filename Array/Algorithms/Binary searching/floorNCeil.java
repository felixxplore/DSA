public class floorNCeil {

  // here found the floor and ceil
  // florr : means find largest element but is smallter than equal n : element<=n:
  // ceil : means find the smallest element but is larger than equal n : element>=n;

  public static void main(String[] args) {
    int[] a = { 3, 4, 4, 7, 8, 10 };
    int target = 2;

    System.out.println(floor(a, target));
    System.out.println(ceil(a, target));
  }

  static int floor(int[] a, int target) {
    // for floor : element<=n :

    int start = 0;
    int end = a.length - 1;
    int ans = -1;

    while (start <= end) {
      int mid = start + ((end - start) / 2);

      if (a[mid] <= target) {
        ans = a[mid];
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return ans;
  }

  static int ceil(int[] a, int target) {
    // for floor : element<=n :

    int start = 0;
    int end = a.length - 1;

    int ans = -1;

    while (start <= end) {
      int mid = start + ((end - start) / 2);

      if (a[mid] >= target) {
        ans = a[mid];
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return ans;
  }
}

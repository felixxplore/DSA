public class squareRoot {

  public static void main(String[] args) {
    int n = 101;
    int p = 3;

    int ans = root(n, p);

    System.out.println(index(n, ans, p));
  }

  static double index(int n, int ans, int p) {
    double realAns = ans;

    double factor = 1;

    for (int i = 0; i < p; i++) {
      factor /= 10;
      for (double j = realAns; j * j < n; j = j + factor) {
        realAns = j;
      }
      
    }

    return realAns;
  }

  static int root(int n, int p) {
    int start = 0;
    int end = n;
    int ans = 0;
    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (mid * mid == n) {
        return mid;
      } else if (mid * mid < n) {
        ans = mid;
        start = mid + 1;
      } else if (mid * mid > n) {
        end = mid - 1;
      }
    }

    return ans;
  }
}

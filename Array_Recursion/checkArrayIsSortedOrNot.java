package Array_Recursion;

public class checkArrayIsSortedOrNot {

  public static void main(String[] args) {
    int[] a = { 2, 3, 4, 1, 5 };
    int[] b = { 1, 2, 3, 4, 5 };

    System.out.println(check(a, 0));
  }

  static boolean sort(int[] a) {
    int i = 0;

    return helper(a, i);
  }

  static boolean helper(int[] a, int i) {
    if (i == a.length - 1) {
      return true;
    }

    if (a[i] > a[i + 1]) {
      return false;
    }
    return helper(a, i + 1);
  }

  static boolean check(int[] a, int i) {
    if (i == a.length - 1) {
      return true;
    }

    return a[i] < a[i + 1] && check(a, i + 1);
  }
}

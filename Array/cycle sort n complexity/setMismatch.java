import java.util.Arrays;

public class setMismatch {

  public static void main(String[] args) {
    int[] a = { 1, 1 };
    sort(a);

    int dup = duplicate(a);
    int miss = missing(a);

    System.out.println(Arrays.toString(ans(dup, miss)));
  }

  //   sort the array using cycle sort :
  static void sort(int[] a) {
    int i = 0;
    while (i < a.length) {
      int index = a[i] - 1;
      if (index < a.length && a[i] != a[index]) {
        int temp = a[i];
        a[i] = a[index];
        a[index] = temp;
      } else {
        i++;
      }
    }
  }

  //   find duplicates number  :
  static int duplicate(int[] a) {
    for (int i = 0; i < a.length; i++) {
      if (a[i] != i + 1) {
        return a[i];
      }
    }
    return -1;
  }

  //   find missing element :
  static int missing(int[] a) {
    for (int i = 0; i < a.length; i++) {
      if (a[i] != i + 1) {
        return i + 1;
      }
    }
    return a.length;
  }

  static int[] ans(int a, int b) {
    return new int[] { a, b };
  }
}

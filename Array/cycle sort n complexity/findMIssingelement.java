import java.util.Arrays;

public class findMIssingelement {

  public static void main(String[] args) {
    // int[] a = { 3, 4, -1, 1 };
    // int[] a = { 1, 2, 0 };
    int[] a = { 7, 8, 9, 11, 12 };
    sort(a);
    System.out.println(Arrays.toString(a));

    System.out.println(ans(a));
  }

  static int ans(int[] a) {
    for (int i = 0; i < a.length; i++) {
      if (a[i] != i + 1) {
        return i + 1;
      }
    }
    return a.length + 1;  
  }

  //   range -1 to n : means 0 to n a[i]-1;
  static void sort(int[] a) {
    int i = 0;

    while (i < a.length) {
      int index = a[i] - 1;

      if (a[i] > 0 && a[i] < a.length && a[i] != a[index]) {
        int temp = a[i];
        a[i] = a[index];
        a[index] = temp;
      } else {
        i++;
      }
    }
  }
}

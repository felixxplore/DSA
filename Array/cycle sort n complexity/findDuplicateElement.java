import java.util.Arrays;

public class findDuplicateElement {

  public static void main(String[] args) {
    // int[] a = { 1, 3, 4, 2, 2 };
    int[] a={3,1,3,4,2};
    cycleSort(a);
    // System.out.println(Arrays.toString(a));

    // for (int i = 0; i < a.length; i++) {
    //   for (int j = i + 1; j < a.length; j++) {
    //     if (a[i] == a[j]) {
    //       System.out.println(a[j]);
    //       break;
    //     }
    //   }
    // }

    for (int i = 0; i < a.length; i++) {
      if (a[i] != i + 1) {
        System.out.println(a[i]);
        break;
      }
    }
  }

  static void cycleSort(int[] a) {
    int i = 0;
    while (i < a.length) {
      int index = a[i] - 1;
      if (a[i] < a.length && a[i] != a[index]) {
        int temp = a[i];
        a[i] = a[index];
        a[index] = temp;
      } else {
        i++;
      }
    }
  }
}

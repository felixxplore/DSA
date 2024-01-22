import java.util.ArrayList;
import java.util.Arrays;

public class findAllDuplicates {

  public static void main(String[] args) {
    int[] a = { 4, 3, 2, 7, 8, 2, 3, 1 };
    sort(a);

    ArrayList<Integer> list = new ArrayList<>();

    for (int i = 0; i < a.length; i++) {
      if (a[i] != i + 1) {
        list.add(a[i]);
      }
    }

    System.out.println(list);
  }

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
}

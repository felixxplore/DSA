import java.util.Arrays;

public class findMIssingelement {

  public static void main(String[] args) {
    int[] a = { 4, 1, 2, 0 };

    // normal sort :
    // selectionSort(a);
    sorting(a);
    System.out.println(findMissing(a));
  }

  static void selectionSort(int[] a) {
    for (int j = 0; j < a.length - 1; j++) {
      int min = Integer.MAX_VALUE;
      int minIndex = Integer.MAX_VALUE;
      for (int i = j; i < a.length; i++) {
        if (a[i] < min) {
          min = a[i];
          minIndex = i;
        }
      }

      int temp = a[j];
      a[j] = a[minIndex];
      a[minIndex] = temp;
    }
  }

  static int findMissing(int[] a) {
    for (int i = 0; i < a.length; i++) {
      if (a[i] != i) {
        return i;
      }
    }
    return a.length;
  }

  static void sorting(int[] a) {
    int i = 0;
    while (i < a.length) {
      int correctPosition = a[i];
      if (a[i] < a.length && a[i] != a[correctPosition]) {
        int temp = a[i];
        a[i] = a[correctPosition];
        a[correctPosition] = temp;
      } else {
        i++;
      }
    }
  }
}

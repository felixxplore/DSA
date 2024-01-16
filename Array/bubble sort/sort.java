import java.lang.reflect.Array;

public class sort {

  public static void main(String[] args) {
    int[] a = { 3, 1, 2, 4, 5 };

    for (int m : a) {
      System.out.print(m + " ");
    }
    System.out.println();

    for (int i = 0; i < a.length-i; i++) {
      for (int j = i + 1; j < a.length-j; j++) {
        if (a[i] > a[j]) {
          int temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }

    System.out.println();
    for (int m : a) {
      System.out.print(m + " ");
    }
  }
}

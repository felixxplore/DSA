package Array.insertionSort;

/**
 * sort
 */
public class sort {

  public static void main(String[] args) {
    int[] a = { 5, 2, 4, 1, 3 };

    for (int i = 0; i < a.length; i++) {
      int j = i;

      while (j > 0 && a[j - 1] > a[j]) {
        int temp = a[j - 1];
        a[j - 1] = a[j];
        a[j] = temp;
        j--;
      }
    }

    for (int i : a) {
      System.out.print(i + " ");
    }
  }
}

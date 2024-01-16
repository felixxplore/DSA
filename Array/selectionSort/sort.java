package Array.selectionSort;

public class sort {

  public static void main(String[] args) {
    int[] a = { 13, 46, 24, 52, 20, 9 };

    for (int i : a) {
      System.out.print(i + " ");
    }
    System.out.println();

    for (int j = 0; j < a.length-1; j++) {
      int min = Integer.MAX_VALUE;
      int minIndex = Integer.MAX_VALUE;

      for (int i = j; i < a.length; i++) {
        if (a[i] < min) {
          min = a[i];
          minIndex = i;
        }
      }

      int temp = a[minIndex];
      a[minIndex] = a[j];
      a[j] = temp;
    }

    for (int i : a) {
      System.out.print(i + " ");
    }
  }
}

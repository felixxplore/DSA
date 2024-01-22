import java.util.ArrayList;
import java.util.Arrays;

public class findAllMissingElement {

  public static void main(String[] args) {
    // now find all missing number :
    // range 1 to n :
    int[] a = { 4, 3, 2, 7, 8, 2, 3, 1 };
    cycleSort(a);

    System.out.println(missing(a));
  }

  static void cycleSort(int[] a) {
    int i = 0;
    while (i < a.length) {
      int correctPosition = a[i] - 1;
      
      if (a[i] != a[correctPosition]) {
        int temp = a[i];
        a[i] = a[correctPosition];
        a[correctPosition] = temp;
      } else {
        i++;
      }
    }
  }

  //   findmissing :
  static ArrayList<Integer> missing(int[] a) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < a.length; i++) {
      if (a[i] != i + 1) {
        list.add(i + 1);
      }
    }

    return list;
  }
}

import java.util.Arrays;

public class sort {

  public static void main(String[] args) {
    int[] a = { 5, 2, 4, 1, 3 };

    sorting(a);
    System.out.println(Arrays.toString(a));
  }

  static void sorting(int[] a) {
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
}

/*
 * Initial Array: { 3, 1, 4, 2, 5 }

First Iteration (i=0):

correctPosition = 3 - 1 = 2
Swap a[0] with a[2]: { 4, 1, 3, 2, 5 }
Increment i: i = 1
Second Iteration (i=1):

correctPosition = 1 - 1 = 0
Swap a[1] with a[0]: { 1, 4, 3, 2, 5 }
Increment i: i = 2
Third Iteration (i=2):

correctPosition = 4 - 1 = 3
Swap a[2] with a[3]: { 1, 4, 2, 3, 5 }
Increment i: i = 3
Fourth Iteration (i=3):

correctPosition = 2 - 1 = 1
Swap a[3] with a[1]: { 1, 2, 4, 3, 5 }
Increment i: i = 4
Fifth Iteration (i=4):

correctPosition = 5 - 1 = 4
Swap a[4] with a[4] (no change): { 1, 2, 4, 3, 5 }
Increment i: i = 5
End of Iteration:

The array is now sorted: { 1, 2, 3, 4, 5 }
 */
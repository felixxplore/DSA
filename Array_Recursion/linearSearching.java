package Array_Recursion;

public class linearSearching {

  public static void main(String[] args) {
    int[] a = { 1, 4, 18, 18, 9 };
    System.out.println(search(a, 0, 18));

    System.out.println(searchLastIndex(a, a.length - 1, 18));
  }

  static int search(int[] a, int index, int target) {
    if (index == a.length - 1) {
      return -1;
    }

    if (a[index] == target) {
      return index;
    }

    return search(a, index + 1, target);
  }

  static int searchLastIndex(int[] a, int index, int target) {
    if (index == -1) {
      return -1;
    }

    if (a[index] == target) {
      return index;
    }

    return search(a, index - 1, target);
  }
}

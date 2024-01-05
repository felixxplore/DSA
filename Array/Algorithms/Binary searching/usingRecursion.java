public class usingRecursion {

    // here we found element using recursive approach :
    // apply binary searching to find element :
    // time complexity of this algo is O(log n)
  public static void main(String[] args) {

  }

  static int findElement(int[] a, int element) {
    return binary(a, 0, a.length - 1, element);
  }

  static int binary(int[] a, int start, int end, int element) {
    int mid = start + (end - start) / 2;

    if (start > end) {
      return -1;
    }
    if (a[mid] == element) {
      return mid;
    } else if (element < a[mid]) {
      return binary(a, start, mid - 1, element);
    } else {
      return binary(a, start + 1, end, element);
    }
  }
}

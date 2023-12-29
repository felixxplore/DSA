public class maxFindInRange {

  public static void main(String[] args) {
    int[] num = { 10, 9, 10, 10, 20, 25, 18, 19, 20 };
    // ans : 5
    int start = 3;
    int last = num.length - 1;
    System.out.println(maximumRange(num, start, last));
  }

  static int maximumRange(int[] arr, int start, int last) {
    // writing test cases :
    if (arr.length == 0) {
      return -1;
    } else if (last < 0 || start < 0) {
      return -1;
    } else if (last < start) {
      return -1;
    } else if (last == start) {
      return arr[start];
    }
    int max = arr[start];

    for (int i = start; i <= last; i++) {
      max = Math.max(arr[i], max);
    }
    return max;
  }
}

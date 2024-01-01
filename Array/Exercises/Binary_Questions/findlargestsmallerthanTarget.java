package Array.Exercises.Binary_Questions;

public class findlargestsmallerthanTarget {

  public static void main(String[] args) {
    int[] a = { 2, 3, 5, 9, 14, 16, 18 };
    int target =-1;

    System.out.println(smallestElemet(a, target));
  }

  static int smallestElemet(int[] a, int target) {
    // if largest hain vo agar array ke end se bhee bada hua to : target set bada and usmee bhee smallest to nahi hoga :
    if (target < a[0]) {
      return -1; 
    }
    int start = 0;
    int end = a.length - 1;
    int min = Integer.MAX_VALUE;
    int mid = -1;
    while (start <= end) {
      mid = start + ((end - start) / 2);
      if (a[mid] == target) {
        return a[mid];
      } else if (a[mid] > target) {
        end = mid - 1;
      } else if (a[mid] < target) {
        start = mid + 1;
      }
    }

    return a[end];
  }
}

package Array.Exercises.Binary_Questions;

public class findCharacterSmallerletterGreatherThanTarget {

  public static void main(String[] args) {
    char[] a = { 'x', 'x', 'y', 'y' };
    char target = 'z';

    System.out.println(smallestElemet(a, target));
    // System.out.println('d'<target);
  }

  static char smallestElemet(char[] a, char target) {
    // if largest hain vo agar array ke end se bhee bada hua to : target set bada and usmee bhee smallest to nahi hoga :

    int start = 0;
    int end = a.length - 1;
    int mid = -1;
    if (target > a[a.length - 1]) {
      return a[start];
    }
    if (target < a[start]) {
      return a[start];
    }
    while (start <= end) {
      mid = start + ((end - start) / 2);
      if (a[mid] >= target) {
        end = mid - 1;
      } else if (a[mid] <= target) {
        start = mid + 1;
      }
    }

    return a[start];
  }
}

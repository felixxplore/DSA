public class Palindrom {

  public static void main(String[] args) {
    int num = 10;
    System.out.println(isPalindrom(num));
  }

  static boolean isPalindrom(int x) {
    String num = Integer.toString(x);

    int start = 0;
    int end = num.length() - 1;

    while (start <= end) {
      if (num.charAt(start) != num.charAt(end)) {
        return false;
      } else {
        start++;
        end--;
      }
    }
    return true;
  }
}

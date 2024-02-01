package Recursion;

public class reverseNumber {

  public static void main(String[] args) {
    int n = 54321;
    int digits = reverse(n);

    System.out.println(digits);
  }

  // reverse a number :
  static int reverseNum(int n) {
    // number ko reverse karne k liye :

    int digits = (int) Math.log10(n);
    return helper(n, digits);
  }

  static int helper(int n, int digits) {
    if (n % 10 == n) {
      return n;
    }
    int rem = n % 10;
    return rem * (int) Math.pow(10, digits) + helper(n / 10, digits - 1);
  }

  static int reverse(int n) {
    if (n == 0) {
        return 0;
    }

    int rem = n % 10;
    int sum = reverse(n / 10);
    return (sum * 10) + rem;
  }
}

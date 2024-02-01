package Recursion;

public class sumOfDigits {

  public static void main(String[] args) {
    System.out.println(digits(1342));
  }

  // sum of digits :
  static int sumofDigits(int n) {
    if (n == 0) {
      return 0;
    }
    return (n % 10) + sumofDigits(n / 10);
  }

  static int digits(int n) {
    if (n == 0) {
      return 0;
    }

    return digits(n / 10) + n % 10;
  }
}

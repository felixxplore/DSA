package Recursion;

public class sumOfDigits {
    public static void main(String[] args) {

    }

    // sum of digits :
    static int sumofDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumofDigits(n / 10);
    }
}

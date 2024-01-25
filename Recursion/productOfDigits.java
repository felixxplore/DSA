package Recursion;

public class productOfDigits {
    static int productofDigits(int n) {
        if (n == 1) {
            return 1;
        }
        return (n % 10) * productofDigits(n / 10);
    }
}

package Recursion;

public class reverseNumber {

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
}

package Recursion.Learning;

public class countZeros {
    public static void main(String[] args) {

        int n = 30201;

        int ans = count(n);
        System.out.println(ans);
    }

    static int count(int n) {
        if (n == 0) {
            return 0;
        }
        int rem = n % 10;

        if (rem == 0) {
            return 1 + count(n / 10);
        } else {
            return count(n / 10);
        }

    }
}

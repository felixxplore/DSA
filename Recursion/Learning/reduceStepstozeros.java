package Recursion.Learning;

public class reduceStepstozeros {
    public static void main(String[] args) {
        int number = 3;
        int ans = steps(number);
        System.out.println(ans);
    }

    static int steps(int n) {

        if (n == 0) {
            return 0;
        }

        if (n % 2 == 0) {
            return 1 + steps(n / 2);
        }
        return 1 + steps(n - 1);
    }
}

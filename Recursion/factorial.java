package Recursion;

public class factorial {

    // solving factorial using recurson that's my approach :
    static int fact(int n, int finalAnswer) {
        if (n <= 1) {
            return 1;
        }

        finalAnswer *= n;
        return fact(n - 1, finalAnswer);
    }

    public static void main(String[] args) {

    }

}

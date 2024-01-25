package Recursion;

public class palindrom {

    public static void main(String[] args) {
        int n = 12321;
        boolean answer = palin(n);
        System.out.println(answer);
    }

    static boolean palin(int n) {
        int first = 0;
        int last = String.valueOf(n).length() - 1;

        return checking(String.valueOf(n), first, last);

    }

    static boolean checking(String n, int first, int last) {

        if (first >= last) {
            return true;
        }
        // base case:
        if (n.charAt(first) == n.charAt(last)) {
            return checking(n, first + 1, last - 1);
        } else {
            return false;
        }

    }
}

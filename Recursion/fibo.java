package Recursion;

public class fibo {

  public static void main(String[] args) {
    int ans = fibonaci(50);
    System.out.println(ans);
  }

  static int fibonaci(int n) {
    

    if (n < 2) {
      return n;
    }
    return fibonaci(n - 1) + fibonaci(n - 2);
  }
}

import java.util.Scanner;

public class evenOrodd {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    System.out.println(check(n));
  }

  static boolean check(int n) {
    return (n & 1) == 0;
  }
}

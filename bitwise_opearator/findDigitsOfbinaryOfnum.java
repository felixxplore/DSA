package bitwise_opearator;

public class findDigitsOfbinaryOfnum {

  public static void main(String[] args) {
    int n = 8;

    String size = Integer.toBinaryString(n);

    System.out.println(size.length());

    int count = 0;
    while (n > 0) {
      count++;
      n = n >> 1;
    }
    System.out.println(count);

    // optimize code :
    int number = 8;
    int base = 2;
    // base decide decimal or binary :

    int ans = (int) (Math.log(number) / Math.log(base)) + 1;
    System.out.println(ans);
  }
}

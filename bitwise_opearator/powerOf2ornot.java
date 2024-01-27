package bitwise_opearator;

import javax.sound.midi.Track;

public class powerOf2ornot {

  public static void main(String[] args) {
    // for (int i = 1; i <= 10; i++) {
    //   int ans = (int) Math.pow(2, i);
    //   System.out.println(Integer.toBinaryString(ans));
    // }

    int n = 34;

    int count = 0;
    while (n > 0) {
      int lastDigit = n & 1;
      if (lastDigit == 1) {
        count++;
      }
      n >>= 1;
    }

    if (count <= 1) {
      System.out.println("this is power");
    } else {
      System.out.println("this is not power");
    }

    System.out.println(Integer.toBinaryString(10));

    // optimize code :
    int number = 8;

    System.out.println(ans(number));
  }

  static boolean ans(int n) {
    return (n & (n - 1)) == 0;
  }
}

package bitwise_opearator;

public class findRightMostSetBit {

  public static void main(String[] args) {
    int n = 8;
    System.out.println(rightMost(n));
    System.out.println(anotherWay(n));
  }

  static int rightMost(int n) {
    if (n == 0) {
      return -1;
    }
    if (n < 0) {
      n = n * -1;
    }

    int count = 0;

    while ((n & 1) == 0) {
      count++;
      n = n >> 1;
    }
    count++;
    return count;
  }

  static String anotherWay(int n) {
    int ans = n & -n;

    return Integer.toBinaryString(ans);
  }

  static int findRightMostSetBitPosition(int num) {
    if (num == 0) {
      return -1; // No set bit found in 0
    }

    // Use bitwise AND with the two's complement of the number to isolate the rightmost set bit
    int rightmostSetBit = num & -num;

    // Count the trailing zeros to get the position
    int position = Integer.numberOfTrailingZeros(rightmostSetBit);

    return position;
  }
}

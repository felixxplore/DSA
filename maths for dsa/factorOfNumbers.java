import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class factorOfNumbers {

  public static void main(String[] args) {
    int n = 20;

    factors2(n);
  }

  static ArrayList<Integer> factors(int n) {
    ArrayList<Integer> nums = new ArrayList<>();

    if (n < 0) {
      return nums;
    }
    if (n == 0) {
      nums.add(0);
      return nums;
    } else {
      nums.add(1);
      for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
          nums.add(i);
          nums.add(n / i);
        }
      }

      nums.add(n);
    }
    Collections.sort(nums);

    return nums;
  }

  static void factors2(int n) {
    ArrayList<Integer> nums = new ArrayList<>();

    if (n < 0) {
      return;
    }
    if (n == 0) {
      nums.add(0);
      return;
    } else {
      for (int i = 1; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
          System.out.print(i + " ");
          nums.add(n / i);
        }
      }
    }

    for (int i = nums.size() - 1; i >= 0; i--) {
      System.out.print(nums.get(i) + " ");
    }
  }
}

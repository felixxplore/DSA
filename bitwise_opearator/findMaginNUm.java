package bitwise_opearator;

public class findMaginNUm {

  public static void main(String[] args) {
    int n = 5;

    int count = 0;
    double sum = 0;
    // while (n > 0) {
    //   int lastDigit = n & 1;
    //   if (lastDigit == 1) {
    //     count++;
    //     sum = sum + Math.pow(5, count);
    //     n = n >> 1;
    //   } else {
    //     count++;
    //     n = n >> 1;
    //   }
    // }


    // optimize the code :  
    while (n > 0) {
      int lastDigit = n & 1;
      count++;
      if (lastDigit == 1) {
        sum = sum + Math.pow(5, count);
      }

      n = n >> 1;
    }

    System.out.println(sum);
  }
}

public class squareRootFind {

  public static int sqrtN(long N) {
    /*
     * Write your code here
     */

    //  initialize the start and n :
    long start = 1;
    long end = N;

    while (start <= end) {
      long mid = start + (end - start) / 2;
    //   multiple mid * mid and then check it's less than equal to n :
      long val = mid * mid;

    // agar mid * mid chota hain n se to use right taraf leke jao : 
      if (val <= N) {
    
        start = mid + 1;
      } else {

        // other wise left part taraph leke jao :
        end = mid - 1;
      }
    }

    // ab hamara jo input hain vo long me hain :
    // humko asnwer int me dena :
    // to above hum overflow ko handle kar rahe hain :
    // agar end hain vo more than hain Integer.MAX_VALUE se to Integer.MAX_VALUE ko return kar do :

    if (end > Integer.MAX_VALUE) {
      return Integer.MAX_VALUE;
    }
    // yaha pe hum end ko integer me return  kar rahe hain :
    return (int) end;
  }
}

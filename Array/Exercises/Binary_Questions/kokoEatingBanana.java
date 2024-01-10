public class kokoEatingBanana {

  public static void main(String[] args) {
    int[] a = { 3, 6, 7, 11 };
    int h = 8;

    System.out.println(minimumRateToEatBananas(a, h));
  }

  // minimum banana eat by koko in hour :
  static int minimumRateToEatBananas(int[] v, int h) {
    // start
    // end
    // totalhours :
    // max value :

    int start = 1;
    int end = findMax(v);
    // end hamara max value means 1 to max value hain jo array ki hain iske bich me hee hamara answer relay karta
    int ans = Integer.MAX_VALUE;

    // ye loop find karta hain minimum rate such tat the total hours to eat bananas is less than or equal to h :
    // the result stored in ans and return ans :

    while (start <= end) {
      int mid = start + (end - start) / 2;
      int totalHours = totalH(v, mid);
      //   here mid as  hour pass karege :

      if (totalHours <= h) {
        ans = mid;
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return ans;
  }

//   total hours calculates the hours needed to eat all the bananas at a given rate per hour
// assume ek mid nikla jo hamara hour : jo eat bananaper hour : to total pure array ko eat karne me kitna total time lagega :
// float values hogi both : current element and hour : and final value ko ceil karega means aage wali value lega :

  static int totalH(int[] a, int hour) {
    int totalHours = 0;

    for (int i = 0; i < a.length; i++) {
      totalHours += Math.ceil((double)a[i] /(double) hour);
    }
    return totalHours;
  }

  static int findMax(int[] a) {
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < a.length; i++) {
      if (a[i] > max) {
        max = a[i];
      }
    }
    return max;
  }
}

// * dry run code :
/*
int[] a = { 3, 6, 7, 11 };
int h = 8;
System.out.println(minimumRateToEatBananas(a, h));
Initial Setup:

start = 1
end = 11 (maximum value in the array)
ans = Integer.MAX_VALUE
Binary Search Iterations:

Iteration 1: mid = 6. totalH(a, 6) = 7+12+14+23 = 56 > h. So, end is updated to mid - 1 = 5.
Iteration 2: mid = 3. totalH(a, 3) = 10+20+24+38 = 92 > h. So, end is updated to mid - 1 = 2.
Iteration 3: mid = 2. totalH(a, 2) = 15+30+35+55 = 135 > h. So, end is updated to mid - 1 = 1.
Iteration 4: mid = 1. totalH(a, 1) = 31+62+73+115 = 281 > h. So, end is updated to mid - 1 = 0.
Final Result:

The function returns ans = 2 as the minimum rate to eat bananas per hour.
This algorithm efficiently finds the minimum rate using binary search and ensures that the total hours are less than or equal to the given limit.
 */

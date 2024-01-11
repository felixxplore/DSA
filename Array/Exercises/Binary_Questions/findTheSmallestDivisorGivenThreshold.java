public class findTheSmallestDivisorGivenThreshold {

  public static void main(String[] args) {
    int[] a = { 1, 2, 5, 9 };
    int threshold = 7;

    System.out.println(ans(a, threshold));
  }

  static int ans(int[] a, int threshold) {
    // we need start :
    int start = 1;
    // ans me hamara ans store hoga :
    int ans = -1;
    // maxi for find a maximum value in array it assign in end :
    // because our answer stay in between minimum 1 to maximum of element in array :
    int maxi = Integer.MIN_VALUE;
    for (int i = 0; i < a.length; i++) {
      maxi = Math.max(maxi, a[i]);
    }

    // find maximum value in array and assign in end :
    int end = maxi;

    while (start <= end) {
      int mid = start + (end - start) / 2;
      int sum = 0;

      //   sum of divisor each element
      for (int i = 0; i < a.length; i++) {
        sum += Math.ceil((double) a[i] / (double) mid);
      }
      //   if sum of divisor lessthan equal to threshold  so hold the answer and mid -1  kyonki hame minimum value chaiye ;
      if (sum <= threshold) {
        ans = mid;
        end = mid - 1;
      } else {
        // other wise we increase and go to right path :
        start = mid + 1;
      }
    }
    // store ans return : if value is not found it return their default value -1
    return ans;
  }
}

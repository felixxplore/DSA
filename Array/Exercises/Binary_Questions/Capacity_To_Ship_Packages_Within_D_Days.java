public class Capacity_To_Ship_Packages_Within_D_Days {

  public static int leastWeightCapacity(int[] w, int d) {
    // Write your code here.

    int max = Integer.MIN_VALUE;
    for (int i = 0; i < w.length; i++) {
      if (w[i] > max) {
        max = w[i];
      }
    }

    int start = max;

    int sum = 0;
    for (int i = 0; i < w.length; i++) {
      sum += w[i];
    }
    int end = sum;

    while (start <= end) {
      int mid = start + (end - start) / 2;
      int noOfDays = findDays(w, mid);
      if (noOfDays <= d) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return start;
  }

  static int findDays(int[] w, int mid) {
    int days = 1;
    int load = 0;

    for (int i = 0; i < w.length; i++) {
      if (w[i] + load > mid) {
        days += 1;
        load = w[i];
      } else {
        load += w[i];
      }
    }
    return days;
  }
}

public class kthMissingElement {

  public int findKthPositive(int[] vec, int k) {
    int start = 0;
    int end = vec.length - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2;

      int missing = vec[mid] - (mid + 1);
      if (missing < k) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return end + 1 + k;
  }
}

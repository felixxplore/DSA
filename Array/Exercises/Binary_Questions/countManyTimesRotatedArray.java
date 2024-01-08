public class countManyTimesRotatedArray {

  public static void main(String[] args) {
    // ye question min element in rotated sorted array se baut connected hain :
    // min element in rotated sorted array me hum elemnt value find karte the the
    // yaha pe uske index ko return karna hian :
    // means count karna hain ki kitne times array rotated hua huain:
    // we know jaha pe array rotated hota hain vaha pe min value hoti hain :
    // code vahi hoga bus jab harabar hum values compare karte the ab bus hum logko uska index bhee store karke rakhna padega :

    int[] a={3, 4, 5, 1, 2};
    System.out.println(findMin(a));
  }

  static int findMin(int[] nums) {
    int start = 0;
    int end = nums.length - 1;

    int ans = Integer.MAX_VALUE;
    int index = -1;
    while (start <= end) {
      int mid = start + (end - start) / 2;

      // here i have two part :
      // first we check in left part ki if our left part is sorted so get min value as start index
      // because we first left part is sorted or not :
      if (nums[start] <= nums[mid]) {
        if (nums[start] < ans) {
          index = start;
          ans = nums[start];
        }
        start = mid + 1;
      } // these condition true so we can say that our left part is sorted :
      else {
        // it choose right part
        // it choose if our left part is not sorted so definately our right part is sorted :
        // we can say that our left part is not sorted so mid is our min value  :

        if (nums[mid] < ans) {
          index = mid;
          ans = nums[mid];
        }
        end = mid - 1;
      }
    }
    return index;
  }
}

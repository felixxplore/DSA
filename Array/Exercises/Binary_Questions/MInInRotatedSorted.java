public class MInInRotatedSorted {

  public static void main(String[] args) {
    
    // in this arrya our left part is sorted
    int[] arr1 = { 3, 4, 5, 1, 2 };

    // in this array our left part is proper sorted 
    int[] arr2 = { 4, 5, 6, 7, 0, 1, 2 };
    int[] arr3 = { 11, 13, 15, 17 };

    System.out.println(findMin(arr1));

  }

  static int findMin(int[] nums) {
    int start = 0;
    int end = nums.length - 1;

    int ans = Integer.MAX_VALUE;

    while (start <= end) {
      int mid = start + (end - start) / 2;

      // here i have two part :
      // first we check in left part ki if our left part is sorted so get min value as start index
      // because we first left part is sorted or not :
      if (nums[start] <= nums[mid]) {
        ans = Math.min(ans, nums[start]);
        start = mid + 1;
      } // these condition true so we can say that our left part is sorted :
      else {
        // it choose right part
        // it choose if our left part is not sorted so definately our right part is sorted :
        // we can say that our left part is not sorted so mid is our min value  :
        ans = Math.min(ans, nums[mid]);
        end = mid - 1;
      }
    }
    return ans;
  }
}

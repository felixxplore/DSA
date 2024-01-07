public class firstAproach {

  public static void main(String[] args) {
    int[] a = { 4, 5, 6, 7, 7, 7, 7, 1, 2, 3, 3 };
    System.out.println(search(a, 3));

    // System.out.println(peakElement(a));
    // System.out.println(largestInRotedSorted(a));
    // System.out.println(minInRotedSorted(a));
  }

  static int search(int[] nums, int target) {
    // Function to find the pivot index
    int pivot = peakElement(nums);

    // Perform binary search in the appropriate half of the array
    // if (nums[pivot] <= target && target <= nums[nums.length - 1]) {
    //   return binarySearch(nums, pivot, nums.length - 1, target);
    // } else {
    //   return binarySearch(nums, 0, pivot, target);
    // }
    // Perform binary search in the appropriate half of the array
    if (nums[pivot] <= target && target <= nums[nums.length - 1]) {
      return binarySearch(nums, pivot, nums.length - 1, target);
    } else {
      return binarySearch(nums, 0, pivot, target);
    }
  }

  //   this is first to find pivot element for finding any element in rotated sorted array ;

  static int peakElement(int[] nums) {
    int left = 0, right = nums.length - 1;

    while (left < right) {
      int mid = (left + right) / 2;
      if (nums[mid] > nums[right]) {
        left = mid + 1;
      } else {
        right = mid;
      }
      //   if (nums[mid] < nums[right]) {
      //     right = mid - 1;
      //   } else {
      //     left = mid;
      //   }
    }

    return right;
  }

  //   above function is helpful to find any target element in array on O(log n) complexity

  private static int binarySearch(int[] nums, int left, int right, int target) {
    while (left <= right) {
      int mid = (left + right) / 2;

      if (nums[mid] == target) {
        return mid;
      } else if (nums[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }

    return -1;
  }

  // finding max value in rotated sorted array :

  static int largestInRotedSorted(int[] nums) {
    int left = 0;
    int right = nums.length - 1;

    while (left < right) {
      int mid = (left + right) / 2;

      if (nums[mid] < nums[mid + 1]) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }

    return right;
  }

  //   finding min value in rotated sorted array :

  static int minInRotedSorted(int[] nums) {
    int left = 0;
    int right = nums.length - 1;

    while (left < right) {
      int mid = (left + right) / 2;

      if (nums[mid] > nums[mid - 1]) {
        right = mid - 1;
      } else {
        left = mid;
      }
    }

    return left;
  }
}

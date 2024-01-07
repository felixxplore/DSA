public class secoundAproach {

  // here main logic :
  // check element exist or not
  /*
   * if element is exit return true otherwise return false
   * here has three to four situation :
   * may be your mid==targer return true
   * may be your first and mid are equal and may be your mid and end are equal : in this situation increment start and decrement end and the continue :
   * now third is to select where we need to go left or may be right part
   * check the condition and situation how to select left aprt :
   *  - if start<=mid now you selected left part
   *  - here check your target is has between start to mid : if yes, end=mid-1 other wise start=mid+1
   *
   * check the condition and situation here how to select right part :
   * else condition :
   *  if(target place between mid to end )
   *  so start=mid+1 other wise end=mid-1;
   */
  public boolean search(int[] nums, int target) {
    int left = 0, right = nums.length - 1;

    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (nums[mid] == target) {
        return true;
      }

      // Handle duplicates
      if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
        left++;
        right--;
        continue;
      }

      // Check which half is sorted
      if (nums[left] <= nums[mid]) {
        // Left half is sorted
        if (nums[left] <= target && target < nums[mid]) {
          right = mid - 1;
        } else {
          left = mid + 1;
        }
      } else {
        // Right half is sorted
        if (nums[mid] <= target && target <= nums[right]) {
          left = mid + 1;
        } else {
          right = mid - 1;
        }
      }
    }

    return false;
    //    int pivot = findPivot(nums);

    // // Perform binary search in the appropriate half of the array
    // if (nums[pivot] <= target && target <= nums[nums.length - 1]) {
    //     return binarySearch(nums, pivot, nums.length - 1, target);
    // } else {
    //     return binarySearch(nums, 0, pivot - 1, target);
  }

  private static int findPivot(int[] nums, int low, int high) {
    int left = low, right = high;

    while (left < right) {
      int mid = (left + right) / 2;

      if (nums[mid] > nums[right]) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }

    return left;
  }

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
}

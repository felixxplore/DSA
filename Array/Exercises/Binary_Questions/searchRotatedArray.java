/* Search Element in Rotated array :
 *  original array : [2,4,5,7,8,9,10,12] :
 * after rotated by 1 : [12,2,4,5,7,8,9,10]
 * after rotated by 2 : [10,12,2,4,5,7,8,9]
 * for finding element in array :
    - find pivot element in array : pivot means largest element
        - How to find pivot element in array :
            - first is whenver mid > mid+1 so mid is pivot element 
            - observe here [10,12,2,4,5,7,8,9] : assume 12 is pivot, but how see , if mid=12,mid>mid+1 => 12>2 os here 12 is pivot elemen                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             t 
            - 
 *
 *
 *
 *
 *
 *
 *
 *
 */

package Array.Exercises.Binary_Questions;

public class searchRotatedArray {

  public static int search(int[] nums, int target) {
    // Function to find the pivot index
    int pivot = pivot2(nums, target);

    // Perform binary search in the appropriate half of the array
    if (nums[pivot] <= target && target <= nums[nums.length - 1]) {
      return binarySearch(nums, pivot, nums.length - 1, target);
    } else {
      return binarySearch(nums, 0, pivot - 1, target);
    }
  }

  public static int findPivot(int[] nums) {
    int start = 0, end = nums.length - 1;

    while (start < end) {
      int mid = (start + end) / 2;

      if (nums[mid] > nums[end]) {
        start = mid + 1;
      } else {
        end = mid;
      }
    }

    return start;
  }

  public static int seaching2(int[] a, int target) {
    int pivotIndx = pivot2(a, target);

    if (pivotIndx == -1) {
      return binarySearch(a, 0, a.length - 1, target);
    }
    if (a[pivotIndx] == target) {
      return pivotIndx;
    }
    if (target >= a[0]) {
      return binarySearch(a, 0, pivotIndx - 1, target);
    } else {
      return binarySearch(a, pivotIndx + 1, a.length - 1, target);
    }
  }

  public static int pivot2(int[] a, int target) {
    int start = 0;
    int end = a.length - 1;

    while (start <= end) {
      // 4 cases to find pivot element :
      int mid = start + ((end - start) / 2);
      // first case : jaha pe hamara mid hain vo bada hain mid+1, to vaha pe return karo mid ko :
      if (a[mid] > a[mid + 1] && mid < end) {
        return mid;
      }
      if (a[mid] < a[mid - 1] && mid > start) {
        // ab yaha pe ek problem hain ki think ki hamara mid hain vo start location 0 pe hain to mid-1 vo to exceptino to error aa jayega to hamara mid hain vo hamesha start hain usse bada hona chaiye
        return mid - 1;
      }

      if (a[mid] <= a[start]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return -1;
  }

  public static int binarySearch(int[] nums, int start, int end, int target) {
    while (start <= end) {
      int mid = (start + end) / 2;

      if (nums[mid] == target) {
        return mid;
      } else if (nums[mid] < target) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
    int target = 1;
    // int result = search(nums, target);
    int result = seaching2(nums, target);

    System.out.println(result);
    // System.out.println(pivot2(nums, target));
  }
}

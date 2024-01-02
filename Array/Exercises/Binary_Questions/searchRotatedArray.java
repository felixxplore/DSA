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
            int pivot = findPivot(nums);
    
            // Perform binary search in the appropriate half of the array
            if (nums[pivot] <= target && target <= nums[nums.length - 1]) {
                return binarySearch(nums, pivot, nums.length - 1, target);
            } else {
                return binarySearch(nums, 0, pivot - 1, target);
            }
        }
    
        private static int findPivot(int[] nums) {
            int left = 0, right = nums.length - 1;
    
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
    
        public static void main(String[] args) {
            int[] nums = {4, 5, 6, 7, 0, 1, 2};
            int target = 0;
            int result = search(nums, target);
            System.out.println(result);
     }
    }

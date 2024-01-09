public class inArrayGetSingleElementInSortedArrayInDuplicates {

  public static void main(String[] args) {
    int[] a = { 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6 };

    System.out.println(singleNonDuplicate(a));
  }

  static int singleNonDuplicate(int[] nums) {
    // here our main task to find unique or single element that is not repeated :

    int n = nums.length;
    //agar array ki length 1 hain to use hee return kar do
    if (n == 1) {
      return nums[0];
    }
    // agar hamare pass 2 or more than 2 length ka array hain and first not equl to secound to first element ko return kar do
    if (nums[0] != nums[1]) {
      return nums[0];
    }

    // agaar hamare pass 2 ya 2 se jyada length ka array hain hame check karna hian secound last not equal to last hain to last element ko return karna hian :
    if (nums[n - 1] != nums[n - 2]) {
      return nums[n - 1];
    }

    int start = 1;
    int end = n - 2;

    while (start <= end) {
      int mid = start + (end - start) / 2;
      //  ye condition tab apply hogi jab mid-1 and mid+1 not equal but what to do jab duplicates ho
      if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
        return nums[mid];
      }

      //  if mid == mid-1 and mid==mid+1 how to handle :
      // we are in left :
      if (
        (mid % 2 == 1 && nums[mid] == nums[mid - 1]) ||
        (mid % 2 == 0 && nums[mid] == nums[mid + 1])
      ) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return -1;
  }
}

public class peakElementStriver {

  public static void main(String[] args) {
    int[] a = { 1, 5, 1, 2, 1 };
    System.out.println(peakIndexInMountainArray(a));
  }

  static int peakIndexInMountainArray(int[] arr) {
    // size of array :
    int n = arr.length;

    // agar size 1 hain array ka to index 0 return kar de kyonki array ki size one hain:
    if (n == 1) {
      return 0;
    }
    // assume ki first index bada hain secound index se to index 0 return kar de
    if (arr[0] > arr[1]) {
      return 0;
    }
    // assume tera last element bada hain sedcound last elemet se
    if (arr[n - 1] > arr[n - 2]) {
      return n - 1;
    }

    int start = 1;
    int end = arr.length - 2;

    while (start <= end) {
      //  find mid :
      int mid = start + (end - start) / 2;

      // assume kar hamari mid hain vo bada hian mid-1 se and mid bada hain mid+1 se to mid ko return kar :

      if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
        return mid;
      }
      // agar mid chota hain aage wala se to use aur aage jane de:
      else if (arr[mid] > arr[mid - 1]) {
        start = mid + 1;
      }
      //  agar mid hai vo bada hain mid+1 se to left side aa :
      else {
        end = mid - 1;
      }
    }

    // return  -1 not mendatory but our function is return type is int so we need to return -1 :
    return -1;
  }
}

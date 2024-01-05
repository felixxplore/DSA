public class lowerbound {

  /*
     * What is lower bound :
     - smallest index is number of that index is larger than given number :
     - let assume : 1,2,3,3,5,8,10,10,11 
     - here our n is 9 :  our ans is 10 :
     how many steps :

     first start =0 end=a.length-1, length=9
     our first mid=
     */

  public static void main(String[] args) {
    int[] a = { 1, 2, 2, 3 };
    int n = 4;
    int ans = lowerBound(a, n);
    System.out.println(ans);
  }

  static int lowerBound(int[] a, int n) {
    int start = 0;
    int end = a.length - 1;
    int ans = -1;
    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (a[mid] >= n) {
        ans = mid;
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return ans;
  }
}

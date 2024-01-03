package Array.Exercises.Binary_Questions;

public class countHowManyTimesArrayRoated {

  public static void main(String[] args) {
    int[] a = {12, 15,7, 9, 11};

    System.out.println(countFind(a));
  }

  static int pivot(int[] a) {
    int start = 0;
    int end = a.length - 1;

    while (start <= end) {
      int mid = start + ((end - start) / 2);

      // 4 cases :
      if (a[mid] > a[mid + 1] && mid < end) {
        return mid;
      }
      if (a[mid] < a[mid - 1] && mid > start) {
        return mid - 1;
      }
      if (a[mid] >= a[start]) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return -1;
  }

  static int count(int[] a) {
    int pivotIndex = pivot(a);
  return pivotIndex+1;
}


static int countFind(int[] a){
    int start=0;
    int end=a.length-1;

    if(a[start]<a[end]) return 0;

    while (start<end) {
        int mid=start+((end-start)/2);

        if(a[mid]>=a[0]){
            start=mid+1;
        }
        else{
            end=mid;
        }
    }
    return end;
}
}

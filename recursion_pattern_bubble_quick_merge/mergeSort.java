package recursion_pattern_bubble_quick_merge;

public class mergeSort {

  public static void main(String[] args) {
    int[] a = { 4, 2, 1, 3 };

    mergeSorting(a, 0, a.length - 1);

    printArray(a);
  }

  static void mergeSorting(int[] a, int start, int end) {
    if (start >= end) {
      return;
    }

    int mid = start + (end - start) / 2;

    mergeSorting(a, start, mid);
    mergeSorting(a, mid + 1, end);

    // now merge 2 sorted array :
    merge(a, start, mid, end);
  }

  static void merge(int[] a, int start, int mid, int end) {
    // decide the size of 2 sorted array ;
    int n1 = mid - start + 1;
    int n2 = end - mid;

    // create temporary array :
    int[] leftArray = new int[n1];
    int[] rightArray = new int[n2];

    // copy data to temporary array :
    for (int i = 0; i < n1; i++) {
      leftArray[i] = a[start + i];
    }
    for (int j = 0; j < n2; j++) {
      rightArray[j] = a[mid + 1 + j];
    }

    // merge 2 sorted array :
    // ab humko 2 pointer lagane padega jisse hum 2 sorted array k elements ko add kar paye hamare array mein :
    int i = 0;
    int j = 0;

    int k = start;
    while (i < n1 && j < n2) {
      if (leftArray[i] < rightArray[j]) {
        a[k++] = leftArray[i++];
      } else {
        a[k++] = rightArray[j++];
      }
    }

    while (i < n1) {
      a[k++] = leftArray[i++];
    }
    while (j < n2) {
      a[k++] = rightArray[j++];
    }
  }

  static void printArray(int[] a) {
    for (int num : a) {
      System.out.print(num + " ");
    }
  }
}

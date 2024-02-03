package recursion_pattern_bubble_quick_merge;

public class quickSorting {

  public static void main(String[] args) {
    int[] a = { 4, 3, 6, 3, 1, 3 };

    // 0,1,2,3,4,5
    // 1,2,3,4,5,6

    quickSort(a, 0, a.length - 1);
    printArray(a);
  }

  static void swap(int[] a, int x, int y) {
    int temp = a[x];
    a[x] = a[y];
    a[y] = temp;
  }

  static void printArray(int[] a) {
    for (int numm : a) {
      System.out.print(numm + " ");
    }
  }

  static void quickSort(int[] a, int start, int end) {
    if (start >= end) {
      return;
    }

    int pi = partition(a, start, end);
    quickSort(a, start, pi - 1);
    quickSort(a, pi + 1, end);
  }

  static int partition(int[] a, int start, int end) {
    // choosing first element as pivot element :
    int pivot = a[start];

    // find the right position of the pivot element index :
    // to us k liye hum count karege from start to end : jitne bhee element pivot se chote hoge count karege :
    int count = 0;
    // start + 1 : se chalega kyonki first element hum pivot le rahe hain :
    for (int i = start + 1; i <= end; i++) {
      if (a[i] <= pivot) {
        count++;
      }
    }
    //   and agar hamare array me duplicates array hain to use pivot element k left side pe put karna hain : isliye yaha pe equal lagaya hain :

    int pivotIndex = count + start;
    //   yaha pe pivotIndex start+count karne ka ek reason ye hain ki  : harbaar start 0 nhi hoga :
    // assume abhi start 2 pe hain and count 3 aaya to pivot ka right index 2+3= 5 index hoga : ab yaha pe only count assign karege to galat index hoga pivo k liye :

    swap(a, start, pivotIndex);

    //   ab rearrage karna hain means :  jo bhee element chote hain pivot element se use left side and jo bhee elements bade hain pivot element se use right side arrange karna hain :

    int k = start, j = end;

    while (k < pivotIndex && j > pivotIndex) {
      while (a[k] <= pivot) {
        k++;
      }

      while (a[j] > pivot) {
        j--;
      }

      //  ek time aayega jaha pe ek element hoga left side pe vo bada hoga pivot element se :
      // and ek element hoga right side pe vo chota hoga pivot element se to use swap karna hoga :

      // swap karne se pahle check karna padega ki jo k index hain chota hona chiaye and j hain vo bada hona chaiye pivotIndex se , nahi to swap ache se nahi hoga : galat element rearrange ho jayege  :
      if (k < pivotIndex && j > pivotIndex) {
        swap(a, k, j);
        k++;
        j--;
      }
    }

    return pivotIndex;
  }
}
/* 
? check quick sort is stable algorithm or not :
-> no quick sort is not stable algorithm :

? agar hamra array completely sorted array hain and hum use quick sort se sort karege to complexity n2 aayegi :

? but hamra array sorted nahi hain to time complexity n longn aayegi :

 */

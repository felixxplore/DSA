package Linear2;

public class FindMaxMin {
    public static void main(String[] args) {}

    //   create a function which find max value :
  
    static int findMax(int[] a) {
      if (a.length == 0) {
        return -1;
      }
      int max = a[0];
      for (int i = 1; i < a.length; i++) {
        if (a[i] > max) {
          max = a[i];
        }
      }
      return max;
    }
  
    static int findMin(int[] a) {
      if (a.length == 0) {
        return -1;
      }
      int min = a[0];
      for (int i = 1; i < a.length; i++) {
        if (a[i] < min) {
          min = a[i];
        }
      }
      return min;
    }
}

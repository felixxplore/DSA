package Array.Exercises;

import java.util.ArrayList;
import java.util.Collections;

public class Rotate_array_by_k_position {

  public static void main(String[] args) {
    // int[] a = { 1, 2, 3, 4, 5 };

    int k = 2; // 3 4 5 1 2

    // logic :
    /*
     *
     */
    ArrayList<Integer> first = new ArrayList<>();
    first.add(1);
    first.add(2);
    first.add(3);
    first.add(4);
    first.add(5);

    ArrayList<Integer> sec = new ArrayList<>();
    // for (int i = k; i < a.length; i++) {
    //   first.add(a[i]);
    // }
    // for (int i = 0; i < k; i++) {
    //   first.add(a[i]);
    // }
    // System.out.println(first);

    System.out.println(first);

    for (int i = 0; i < first.size() && k < first.size(); i++) {
      first.add(i, first.get(k));
      k++;
    }
    System.out.println(first);
  }

  public static ArrayList<Integer> rotateArraymethod1(
    ArrayList<Integer> arr,
    int k
  ) {
    // Write your code here.

    ArrayList<Integer> first = new ArrayList<>();
    for (int i = k; i < arr.size(); i++) {
      first.add(arr.get(i));
    }
    for (int i = 0; i < k; i++) {
      first.add(arr.get(i));
    }
    return first;
  }

  //   secound apporach optimal aproach :
  public static ArrayList<Integer> rotateArraymethod2(
    ArrayList<Integer> arr,
    int k
  ) {
    // Write your code here.

    int size = arr.size();

    reverseArrayList(arr, k);

    return arr;
  }

  private static void reverseArrayList(ArrayList<Integer> list, int k) {
    int size = list.size();

    reverse(list, 0, k - 1);
    reverse(list, k, size - 1);
    reverse(list, 0, size - 1);
  }

  private static void reverse(ArrayList<Integer> list, int start, int last) {
    while (start < last) {
      Collections.swap(list, start, last);
      start++;
      last--;
    }
  }
}

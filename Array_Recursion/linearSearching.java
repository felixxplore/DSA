package Array_Recursion;

import java.util.ArrayList;

public class linearSearching {

  public static void main(String[] args) {
    int[] a = { 1, 4, 18, 18, 9 };
    // System.out.println(search(a, 0, 18));

    // System.out.println(searchLastIndex(a, a.length - 1, 18));

    // System.out.println(findAllIndex(a, 0, 18, new ArrayList<>()));

    System.out.println(findAllIndex2(a, 0, 18));
  }

  static int search(int[] a, int index, int target) {
    if (index == a.length - 1) {
      return -1;
    }

    if (a[index] == target) {
      return index;
    }

    return search(a, index + 1, target);
  }

  static int searchLastIndex(int[] a, int index, int target) {
    if (index == -1) {
      return -1;
    }

    if (a[index] == target) {
      return index;
    }

    return search(a, index - 1, target);
  }

  static ArrayList<Integer> findAllIndex(
    int[] a,
    int i,
    int target,
    ArrayList<Integer> list
  ) {
    if (i == a.length) {
      return list;
    }

    if (a[i] == target) {
      list.add(i);
    }
    return findAllIndex(a, i + 1, target, list);
  }

  static ArrayList<Integer> findAllIndex2(int[] a, int i, int target) {
    ArrayList<Integer> ans = new ArrayList<>();

    if (i == a.length) {
      return ans;
    }
    if (a[i] == target) {
      ans.add(i);
    }
    ArrayList<Integer> allCall = findAllIndex2(a, i + 1, target);

    ans.addAll(allCall);

    return ans;
  }
}

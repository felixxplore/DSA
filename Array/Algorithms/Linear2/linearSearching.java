package Linear2;

import java.util.Arrays;

public class linearSearching {

  public static void main(String[] args) {
    // linear searching :

    // int[] nums = { 1, 2, 4, 3, 5 };
    // int target = -1;

    // System.out.println(linearWay(nums, target));

    // String[] names = { "sattu", "krunal", "yash" };
    // System.out.println(findString(names, "krunall"));

    // String dumbells = "Dumbells";
    // char ch = 'e';
    // System.out.println(findCharacter(dumbells, ch));
    // work on string :
    /*
     * convert string  to character array
     * convert character array to string :
     */

    // ? convert String to character array :

    String laptop = "dell Laptop";
    System.out.println("String form : " + laptop);
    System.out.println(
      "character array : " + Arrays.toString(laptop.toCharArray())
    );
  }

  public static int linearWay(int[] a, int target) {
    int n = a.length;

    if (n == 0) {
      return -1;
    }

    for (int i = 0; i < a.length; i++) {
      if (a[i] == target) {
        return a[i];
      }
    }
    return Integer.MAX_VALUE;
  }

  //   jo kaam hamne integer k sath kiya now work with string :

  public static String findString(String[] a, String target) {
    if (a.length == 0) {
      return "not exist";
    }
    for (int i = 0; i < a.length; i++) {
      if (a[i] == target) {
        return a[i];
      }
    }

    return "not exist";
  }

  // make function which find a characer in string if exist return true otherwise return false:

  public static boolean findCharacter(String a, char c) {
    if (a.length() == 0) {
      return false;
    }

    //? using for loop :
    // for (int i = 0; i < a.length(); i++) {
    //   if (a.charAt(i) == c) {
    //     return true;
    //   }
    // }

    //? using forEach loop :
    for (char temp : a.toCharArray()) {
      if (temp == c) {
        return true;
      }
    }

    return false;
  }
}

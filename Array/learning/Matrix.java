import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Matrix {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 2d array like matrix :
    /*
        1 2 3 
        4 5 6
        7 8 9
      
     */

    //  create 2d array two way :

    // int[][] nums=new int[3][];
    // here rows are mendatori but columns are not mendatory :
    // you can add but not mendatory :

    int[][] arr = new int[3][3];

    System.out.println("array length : " + arr.length);

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        arr[i][j] = sc.nextInt();
      }
    }

    // // outer loop focus on row :
    // for (int i = 0; i < arr.length; i++) {
    //     // inner loop focus on columns :
    //   for (int j = 0; j < arr[i].length; j++) {
    //     System.out.print(arr[i][j] + " ");
    //   }
    //   //   after completing first row we add new line or after printing each row add new line

    //   System.out.println();
    // }

    // print 2d arrya secound way :
    // for (int i = 0; i < arr.length; i++) {
    //   System.out.println(Arrays.toString(arr[i]));
    // }

    // print 2d array using foreach loop :
    // for (int[] nums : arr) {
    //   System.out.println(Arrays.toString(nums));
    // }

    // 3rd way to print 2d array :
    for (int[] nums : arr) {
      for (int element : nums) {
        System.out.print(element + " ");
      }
      System.out.println();
    }
  }
}

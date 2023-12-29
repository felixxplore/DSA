public class intro {

  public static void main(String[] args) {
    // int[] nums = new int[5];

    //
    // System.out.println(nums[0]);
    //
    // String[] name = new String[5];

    // name[0]="HareKrishna";

    // System.out.println(name[0]);

    int[] nums = { 1, 2, 3, 4, 5 };

    System.out.println("before modify : " + nums[0]);
    change(nums);
    System.out.println("AFter modify : " + nums[0]);
  }

  static int change(int[] arr) {
    return arr[0] = 99;
  }
}

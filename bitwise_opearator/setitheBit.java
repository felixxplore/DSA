package bitwise_opearator;

public class setitheBit {

  public static void main(String[] args) {
    int n = 8;
    int i = 3;

    // 2 : 11
    // 2nc :01;

    int shift = n >> (i - 1);
    System.out.println(shift|1);
  }
}

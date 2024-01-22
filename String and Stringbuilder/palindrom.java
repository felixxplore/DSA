// package String and Stringbuilder;

public class palindrom {

  public static void main(String[] args) {
    String word = "lol";

    int start = 0;
    int end = word.length() - 1;

    while (start < end) {
      if (word.charAt(start) == word.charAt(end)) {
        start++;
        end--;
      } else {
        System.out.println(false);
        break;
      }
    }
  }
}

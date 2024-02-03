package subset_subsequence_stringQuestions;

import java.util.ArrayList;

public class subsets {

  public static void main(String[] args) {
    int[] a = { 3, 5, 9 };

    // subSequence("", "abc");
    // System.out.println(subSequence2("", "abc"));
    // subSequenceAscii("", "abc");

    System.out.println(subSequenceAsciiList("", "abc"));
  }

  static void subSequence(String ans, String que) {
    if (que.isEmpty()) {
      System.out.println(ans);
      return;
    }
    char ch = que.charAt(0);

    subSequence(ans + ch, que.substring(1));
    subSequence(ans, que.substring(1));
  }

  static void subSequenceAscii(String ans, String que) {
    if (que.isEmpty()) {
      System.out.println(ans);
      return;
    }
    char ch = que.charAt(0);

    subSequenceAscii(ans + ch, que.substring(1));
    subSequenceAscii(ans, que.substring(1));
    subSequenceAscii(ans + (ch + 0), que.substring(1));
  }

  static ArrayList<String> subSequence2(String ans, String que) {
    if (que.isEmpty()) {
      ArrayList<String> list = new ArrayList<>();
      list.add(ans);
      return list;
    }
    char ch = que.charAt(0);

    ArrayList<String> left = subSequence2(ans + ch, que.substring(1));
    ArrayList<String> right = subSequence2(ans, que.substring(1));

    left.addAll(right);
    return left;
  }

  static ArrayList<String> subSequenceAsciiList(String ans, String que) {
    if (que.isEmpty()) {
      ArrayList<String> list = new ArrayList<>();
      list.add(ans);
      return list;
    }
    char ch = que.charAt(0);

    ArrayList<String> first = subSequenceAsciiList(ans + ch, que.substring(1));
    ArrayList<String> sec = subSequenceAsciiList(ans, que.substring(1));
    ArrayList<String> third = subSequenceAsciiList(
      ans + (ch + 0),
      que.substring(1)
    );

    first.addAll(sec);
    first.addAll(third);
    return first;
  }
}

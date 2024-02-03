public class remvoeCharacter_fromString {

  public static void main(String[] args) {
    String que = "baccad";
    // ans : bccd :

    String ans = "";
    // for (int i = 0; i < que.length(); i++) {
    //   if (que.charAt(i) != 'a') {
    //     ans += que.charAt(i);
    //   }
    // }

    // System.out.println(removeCharacter(que, 'a', 0, ans));
    // removeCharacters2(ans, que);
    // System.out.println(removecharacters3(que));
    // System.out.println(skipString("bcdapplejg"));
    System.out.println(skip_app_not_apple("bacapplcdah"));
  }

  // -------------------------------------------------------------------------

  //   how can be done using recursion :
  static String removeCharacter(String str, char ch, int i, String ans) {
    if (i == str.length()) {
      return ans;
    }

    if (str.charAt(i) != ch) {
      ans += str.charAt(i);
    }
    return removeCharacter(str, ch, i + 1, ans);
  }

  // -------------------------------------------------------------------------
  static void removeCharacters2(String ans, String que) {
    if (que.isEmpty()) {
      System.out.println(ans);
      return;
    }

    char ch = que.charAt(0);
    if (ch == 'a') {
      removeCharacters2(ans, que.substring(1));
    } else {
      removeCharacters2(ans + ch, que.substring(1));
    }
  }

  // -------------------------------------------------------------------------
  static String removecharacters3(String que) {
    if (que.isEmpty()) {
      return "";
    }

    char ch = que.charAt(0);

    if (ch == 'a') {
      return removecharacters3(que.substring(1));
    }
    return ch + removecharacters3(que.substring(1));
  }

  // -------------------------------------------------------------------------
  // ? now skip the word from string :

  static String skipString(String que) {
    if (que.isEmpty()) {
      return "";
    }

    if (que.startsWith("apple")) {
      return skipString(que.substring("apple".length()));
    } else {
      return que.charAt(0) + skipString(que.substring(1));
    }
  }

  // -------------------------------------------------------------------------

  static String skip_app_not_apple(String que) {
    if (que.isEmpty()) return "";
    // skip apple not apple :
    if (que.startsWith("app") && !que.startsWith("apple")) {
      return skip_app_not_apple(que.substring("app".length()));
    } else {
      return que.charAt(0) + skip_app_not_apple(que.substring(1));
    }
  }
}

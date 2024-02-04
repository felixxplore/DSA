import java.util.ArrayList;

public class allSubsequences {

  public static void main(String[] args) {
    String que = "abc";
    ArrayList<String> ans = ssq(que);

    // printAllssq(que, "");

    System.out.println(removeCharacter(que));
  }

  static ArrayList<String> ssq(String que) {
    ArrayList<String> ans = new ArrayList<>();

    if (que.isEmpty()) {
      ans.add("");
      return ans;
    }

    char ch = que.charAt(0);

    ArrayList<String> sequences = ssq(que.substring(1));

    for (String s : sequences) {
      ans.add(s);
      ans.add(ch + s);
    }
    return ans;
  }

  static void printAllssq(String que, String ans) {
    // que empty hoga to return karega and our function is closed :
    if (que.isEmpty()) {
      // return k pahle ans print hoga :
      System.out.println(ans);
      return;
    }

    // string ka first character choose karega :
    char ch = que.charAt(0);

    // first call pe choose karega and concat karega ans k sath ;
    printAllssq(que.substring(1), ans + ch);

    // secound call pe choose nahi karega and single rahega concat nahi karega :
    printAllssq(que.substring(1), ans);
  }

  static String removeCharacter(String que) {
    if (que.isEmpty()) {
      return "";
    }

    char ch = que.charAt(0);
    if (ch == 'a') {
      return removeCharacter(que.substring(1));
    }
    return ch + removeCharacter(que.substring(1));
  }
}

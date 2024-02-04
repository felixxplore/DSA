package subset_subsequence_stringQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class allsubsetinArray {

  public static ArrayList<ArrayList<Integer>> ans;

  public static void main(String[] args) {
    ArrayList<Integer> num = new ArrayList<>();
    num.add(1);
    num.add(2);
    num.add(3);
    num.add(3);
    // ArrayList<ArrayList<Integer>> subset = new ArrayList<>();
    // generate(num, subset, 0, new ArrayList<Integer>());

    // System.out.println(subset);

    // ----------------------------------------------------------
    ArrayList<ArrayList<Integer>> subset = generatelist(
      num,
      0,
      new ArrayList<Integer>()
    );
    System.out.println(subset);

    // ------------------------------------------------

  }

  static void generate(
    ArrayList<Integer> original,
    ArrayList<ArrayList<Integer>> subset,
    int index,
    ArrayList<Integer> current
  ) {
    // base case :
    if (index == original.size()) {
      subset.add(new ArrayList<>(current));
      return;
    }

    current.add(original.get(index));
    generate(original, subset, index + 1, current);

    current.remove(current.size() - 1);
    generate(original, subset, index + 1, current);
  }

  static ArrayList<ArrayList<Integer>> generatelist(
    ArrayList<Integer> original,
    int index,
    ArrayList<Integer> current
  ) {
    ArrayList<ArrayList<Integer>> subset = new ArrayList<>();
    // base case :
    if (index == original.size()) {
      subset.add(new ArrayList<>(current));
      return subset;
    }

    current.add(original.get(index));
    subset.addAll(generatelist(original, index + 1, current));

    current.remove(current.size() - 1);
    subset.addAll(generatelist(original, index + 1, current));

    return subset;
  }
}
/*
How work : diagram 
                            []
               /                           \
           [1]                             []
          /   \                           /   \
      [1, 2]  [1]                    [2]      []
      /   \     \                   /  \      \
 [1, 2, 3] [1, 2] [1, 3]          [2, 3] [2]   [3]

 */

import java.util.ArrayList;

public class searchIngdarray {
       static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        // Write your code here.
         int m = mat.size();
        if (m == 0) {
            return false;
        }
        int n = mat.get(0).size();

        int row = 0, col = n - 1;

        while (row < m && col >= 0) {
            if (mat.get(row).get(col) == target) {
                return true;
            } else if (mat.get(row).get(col) > target) {
                col--;
            } else {
                row++;
            }
        }

        return false;
    }
}

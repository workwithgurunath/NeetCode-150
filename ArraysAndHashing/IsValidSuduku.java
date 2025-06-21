package ArraysAndHashing;

import java.util.HashSet;
import java.util.Set;

public class IsValidSuduku {
    public boolean isValidSudoku(char[][] board) {
        // Create sets to track rows, columns, and subgrids
        Set<String> seen = new HashSet();

        // Traverse the board
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];

                // Ignore empty cells
                if (num == '.')
                    continue;

                // Check row, column, and subgrid uniqueness using sets
                if (!seen.add(num + " in row " + i) ||
                        !seen.add(num + " in col " + j) ||
                        !seen.add(num + " in block " + (i / 3) + "-" + (j / 3))) {
                    return false; // If any condition fails, the board is invalid
                }
            }
        }

        return true; // Passed all checks
    }
}

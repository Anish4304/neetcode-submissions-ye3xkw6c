class Solution {
    public boolean isValidSudoku(char[][] board) {

        // Check rows
        for (int i = 0; i < 9; i++) {
            HashSet<Character> map = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (map.contains(board[i][j])) {
                        return false;
                    }
                    map.add(board[i][j]);
                }
            }
        }

        // Check columns
        for (int i = 0; i < 9; i++) {
            HashSet<Character> map = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.') {
                    if (map.contains(board[j][i])) {
                        return false;
                    }
                    map.add(board[j][i]);
                }
            }
        }

        // Check 3x3 boxes
        for (int box = 0; box < 9; box++) {
            HashSet<Character> map = new HashSet<>();

            int row = (box / 3) * 3;
            int col = (box % 3) * 3;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    char num = board[row + i][col + j];
                    if (num != '.') {
                        if (map.contains(num)) {
                            return false;
                        }
                        map.add(num);
                    }
                }
            }
        }

        return true;
    }
}
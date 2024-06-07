public class Nqueen {

    boolean board[][];

    public int totalNQueens(int n) {

        board = new boolean[n][n];

        return helper(0, n);

    }

    int helper(int row, int n) {

        if (row == n) {
            return 1;
        }
        int count = 0;
        for (int col = 0; col < n; col++) {
            if (willIPlaceOrNot(row, col)) {
                board[row][col] = true;
                count = count + helper(row + 1, n);
                board[row][col] = false;
            }
        }

        return count;
    }

    boolean willIPlaceOrNot(int row, int col) {

        for (int i = row; i >= 0; i--) {
            if (board[i][col] == true) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == true) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j < board[row].length; i--, j++) {
            if (board[i][j] == true) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Nqueen obj = new Nqueen();

        System.out.println(obj.totalNQueens(4));

    }
}

class Solution {
    public boolean isValidSudoku(char[][] board) {
        // HashSet<Character>[] hashbox = new HashSet[board.length];
        // HashSet<Character>[] hashrow = new HashSet[board.length];
        // HashSet<Character>[] hashcolumn = new HashSet[board.length];

        // for(int i=0;i<board.length;i++){
        //     hashrow[i] = new HashSet<>();
        //     hashcolumn[i] = new HashSet<>();
        //     hashbox[i] = new HashSet<>();
        // }

        // for(int i=0;i<board.length;i++)
        // {
        //     for(int j=0;j<board.length;j++)
        //     {
        //         if(board[i][j] == '.') continue;

        //         int boxIndex = (i / 3) * 3 + (j / 3);  // to check which box it is present in

        //         if(hashrow[i].contains(board[i][j]) || hashcolumn[j].contains(board[i][j]) || hashbox[boxIndex].contains(board[i][j]))
        //         {
        //             return false;
        //         }
        //         hashrow[i].add(board[i][j]);
        //         hashcolumn[j].add(board[i][j]);
        //         hashbox[boxIndex].add(board[i][j]);
        //     }
        // }

        boolean[][] hashrow = new boolean[9][9];
        boolean[][] hashcolumn = new boolean[9][9];
        boolean[][] hashbox = new boolean[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int boxIndex = (i / 3) * 3 + (j / 3);
                    if (hashrow[i][board[i][j] - '1'] || hashcolumn[j][board[i][j] - '1'] || hashbox[boxIndex][board[i][j] - '1']) {
                        return false;
                    }
                    hashrow[i][board[i][j] - '1'] = hashcolumn[j][board[i][j] - '1'] = hashbox[boxIndex][board[i][j] - '1'] = true;
                }
            }
        }
        return true;
    }
}
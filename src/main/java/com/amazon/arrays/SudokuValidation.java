package com.amazon.arrays;

public class SudokuValidation {

  public boolean isValid(char[][] board) {

    short[] rows = new short[9];
    short[] colummns = new short[9];
    short[] squares = new short[9];

    for (int row=0; row<board.length; row++) {
      for (int col=0; col<board.length; col++) {

        if(board[row][col] == '.') continue;

        short value = (short) (1 << (board[row][col] - '1'));

        if((value & rows[row]) > 0) return false;
        if((value & colummns[col]) > 0) return false;
        if((value & squares[3*(row/3) + col/3]) > 0) return false;

        rows[row] |= value;
        colummns[col] |= value;
        squares[3*(row/3)+col/3] |= value;

      }
    }
    return true;
  }

}

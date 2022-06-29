package JavaCompleto.ChessSystem.chess.pieces;

import JavaCompleto.ChessSystem.boardgame.Board;
import JavaCompleto.ChessSystem.chess.ChessPiece;
import JavaCompleto.ChessSystem.chess.Color;

public class Rook extends ChessPiece {


  public Rook(Board board, Color color) {
    super(board, color);
  }

  @Override
  public String toString(){
    return "R";
  }

}

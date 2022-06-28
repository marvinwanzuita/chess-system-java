package JavaCompleto.ChessSystem.chess;

import JavaCompleto.ChessSystem.boardgame.Board;
import JavaCompleto.ChessSystem.boardgame.Piece;

public class ChessPiece extends Piece {

  private Color color;

  public ChessPiece(Board board, Color color) {
    super(board);
    this.color = color;
  }

  public Color getColor(){
      return color;
  }

}

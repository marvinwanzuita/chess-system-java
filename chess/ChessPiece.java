package JavaCompleto.ChessSystem.chess;

import JavaCompleto.ChessSystem.boardgame.Board;
import JavaCompleto.ChessSystem.boardgame.Piece;
import JavaCompleto.ChessSystem.boardgame.Position;

public abstract class ChessPiece extends Piece {

  private Color color;

  public ChessPiece(Board board, Color color) {
    super(board);
    this.color = color;
  }

  public Color getColor(){
      return color;
  }

  protected boolean isThereOpponentPiece(Position position){
    ChessPiece p = (ChessPiece)getBoard().piece(position);
    return p != null && p.getColor() != color;
  }

}

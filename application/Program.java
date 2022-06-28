package JavaCompleto.ChessSystem.application;

import JavaCompleto.ChessSystem.boardgame.Position;
import JavaCompleto.ChessSystem.chess.ChessMatch;

public class Program {

  public static void main(String[] args) {

    ChessMatch chessMatch = new ChessMatch();
    UI.printBoard(chessMatch.getPieces());


  }
}

package JavaCompleto.ChessSystem.application;

import JavaCompleto.ChessSystem.boardgame.Position;
import JavaCompleto.ChessSystem.chess.ChessException;
import JavaCompleto.ChessSystem.chess.ChessMatch;
import JavaCompleto.ChessSystem.chess.ChessPiece;
import JavaCompleto.ChessSystem.chess.ChessPosition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    ChessMatch chessMatch = new ChessMatch();


    while (true){

      try{

        UI.clearScreen();
        System.out.println();
        UI.printBoard(chessMatch.getPieces());

        System.out.println();
        System.out.print("Source: ");
        ChessPosition source = UI.readChessPosition(sc);

        System.out.print("Target: ");
        ChessPosition target = UI.readChessPosition(sc);

        ChessPiece capturedPiece = chessMatch.performChessMove(source, target);

      }
      catch (ChessException e){
        System.out.println(e.getMessage());
        sc.nextLine();
      }
      catch (InputMismatchException e){
        System.out.println(e.getMessage());
        sc.nextLine();
      }

    }


  }
}

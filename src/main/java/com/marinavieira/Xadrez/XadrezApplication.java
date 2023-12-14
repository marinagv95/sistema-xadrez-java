package com.marinavieira.Xadrez;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.marinavieira.chess.ChessMatch;
import com.marinavieira.chess.ChessPiece;
import com.marinavieira.chess.ChessPosition;

@SpringBootApplication
public class XadrezApplication {

	public static void main(String[] args) {
		SpringApplication.run(XadrezApplication.class, args);

		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();


		while (true) {
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(sc);

			System.out.println();
			System.out.println("Target: ");
			ChessPosition target = UI.readChessPosition(sc);

			ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
		}

	}

}

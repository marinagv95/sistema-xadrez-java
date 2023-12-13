package com.marinavieira.Xadrez;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.marinavieira.chess.ChessMatch;

@SpringBootApplication
public class XadrezApplication {

	public static void main(String[] args) {
		SpringApplication.run(XadrezApplication.class, args);

		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());

	}

}

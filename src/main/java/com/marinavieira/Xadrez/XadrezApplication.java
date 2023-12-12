package com.marinavieira.Xadrez;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.marinavieira.boardgame.Board;


@SpringBootApplication
public class XadrezApplication {

	public static void main(String[] args) {
		SpringApplication.run(XadrezApplication.class, args);
	
			Board board = new Board(8, 8);
	
	
	}

}

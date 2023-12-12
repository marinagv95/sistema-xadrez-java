package com.marinavieira.Xadrez;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.marinavieira.boardgame.Position;

@SpringBootApplication
public class XadrezApplication {

	public static void main(String[] args) {
		SpringApplication.run(XadrezApplication.class, args);
	
		Position pos = new Position(3, 5);
		System.out.println(pos);
	
	
	}

}

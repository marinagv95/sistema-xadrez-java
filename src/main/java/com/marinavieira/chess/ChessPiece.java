package com.marinavieira.chess;

import com.marinavieira.boardgame.Board;
import com.marinavieira.boardgame.Piece;

import lombok.Data;
import lombok.Getter;

@Data
public class ChessPiece extends Piece {
    @Getter
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

}

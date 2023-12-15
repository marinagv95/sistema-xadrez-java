package com.marinavieira.chess;

import com.marinavieira.boardgame.Board;
import com.marinavieira.boardgame.Piece;
import com.marinavieira.boardgame.Position;

import lombok.Data;
import lombok.Getter;

@Data
public abstract class ChessPiece extends Piece {
    @Getter
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    protected boolean isThereOpponentPiece(Position position){
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && p.getColor() != color;
    }

}

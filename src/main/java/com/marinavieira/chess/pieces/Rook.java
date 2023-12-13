package com.marinavieira.chess.pieces;

import com.marinavieira.boardgame.Board;
import com.marinavieira.chess.ChessPiece;
import com.marinavieira.chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "R";
    }
    
}

package com.marinavieira.chess.pieces;

import com.marinavieira.boardgame.Board;
import com.marinavieira.chess.ChessPiece;
import com.marinavieira.chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }

}

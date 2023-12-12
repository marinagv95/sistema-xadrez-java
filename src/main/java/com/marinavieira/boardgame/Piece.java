package com.marinavieira.boardgame;

public class Piece {

    protected Position position;
    private Board board;

    public Piece() {
    }

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    public Board getBoard() {
        return board;
    }

}

package com.technogise.codingtest.chess.model.board;

public enum Dimension {

	MIN_ROW('A'),
	MAX_ROW('H'),
	MIN_COL('1'),
	MAX_COL('8');
	
    private char val;

    private Dimension(char val) {
        this.val = val;
    }

    public char get() {
        return val;
    }
}

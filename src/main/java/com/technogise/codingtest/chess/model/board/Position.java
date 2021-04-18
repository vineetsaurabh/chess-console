package com.technogise.codingtest.chess.model.board;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.util.StringUtils;

import com.technogise.codingtest.chess.model.piece.Piece;

public class Position {
	private static final Logger logger = LogManager.getLogger(Position.class);

	private Piece piece;

	private char row;
	private char col;
	private char east = '-';
	private char west = '-';
	private char north = '-';
	private char south = '-';

	public Position(char row, char col, Piece piece) throws IllegalArgumentException {
		if (row >= Dimension.MIN_ROW.get() && row <= Dimension.MAX_ROW.get() && col >= Dimension.MIN_COL.get()
				&& col <= Dimension.MAX_COL.get()) {
			this.row = row;
			this.col = col;
			this.piece = piece;
		} else {
			logger.error("Incorrect Position");
			throw new IllegalArgumentException("Incorrect Position");
		}
	}

	public Position(char row, char col) throws IllegalArgumentException {
		this(row, col, null);
	}

	public Position(String position, Piece piece) throws IllegalArgumentException {
		if (isPositionValid(position)) {
			this.row = position.charAt(0);
			this.col = position.charAt(1);
			this.piece = piece;
			setInitialNeighbour();
		}
		logger.debug("Position is set as Row {} Column {} ", this.row, this.col);
	}

	public Position(String position) throws IllegalArgumentException {
		this(position, null);
	}

	private boolean isPositionValid(String position) throws IllegalArgumentException {
		if (!StringUtils.hasLength(position) || position.length() != 2) {
			logger.error("Incorrect Position");
			throw new IllegalArgumentException("Incorrect Position");
		}
		char row = position.charAt(0);
		if (row < Dimension.MIN_ROW.get() && row > Dimension.MAX_ROW.get()) {
			logger.error("Incorrect Row");
			throw new IllegalArgumentException("Incorrect Row");
		}
		char col = position.charAt(1);
		if (col < Dimension.MIN_COL.get() && col > Dimension.MAX_COL.get()) {
			logger.error("Incorrect Column");
			throw new IllegalArgumentException("Incorrect Column");
		}
		return true;
	}

	private void setInitialNeighbour() {
		if (row != Dimension.MAX_ROW.get()) {
			north = (char) (row + 1);
		}
		if (row != Dimension.MIN_ROW.get()) {
			south = (char) (row - 1);
		}
		if (col != Dimension.MAX_COL.get()) {
			east = (char) (col + 1);
		}
		if (col != Dimension.MIN_COL.get()) {
			west = (char) (col - 1);
		}
	}

	public char getRow() {
		return this.row;
	}

	public char getCol() {
		return this.col;
	}

	public Piece getPiece() {
		return this.piece;
	}

	public char getEast() {
		return this.east;
	}

	public char getWest() {
		return this.west;
	}

	public char getNorth() {
		return this.north;
	}

	public char getSouth() {
		return this.south;
	}

	@Override
	public String toString() {
		return "" + this.row + this.col;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + col;
		result = prime * result + row;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		if (col != other.col)
			return false;
		if (row != other.row)
			return false;
		return true;
	}
}

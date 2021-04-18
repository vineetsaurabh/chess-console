package com.technogise.codingtest.chess.move;

import java.util.Set;

import com.technogise.codingtest.chess.model.board.Position;

public interface Move {

	public Set<Position> possibleMoves(Position position, boolean canMoveOnlyOneBlock);
}

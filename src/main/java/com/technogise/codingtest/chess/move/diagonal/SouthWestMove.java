package com.technogise.codingtest.chess.move.diagonal;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.technogise.codingtest.chess.model.board.Dimension;
import com.technogise.codingtest.chess.model.board.Position;

@Component
public class SouthWestMove implements DiagonalMove {

	@Override
	public Set<Position> possibleMoves(Position position, boolean canMoveOnlyOneBlock) {
		Set<Position> positions = new HashSet<>();
		char south = position.getSouth();
		char west = position.getWest();
		if (south != '-' && west != '-') {
			while (south >= Dimension.MIN_ROW.get() && west >= Dimension.MIN_COL.get()) {
				positions.add(new Position(south, west));
				if (canMoveOnlyOneBlock) {
					break;
				}
				south--;
				west--;
			}
		}
		return positions;
	}

}

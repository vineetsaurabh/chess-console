package com.technogise.codingtest.chess.move.straight;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.technogise.codingtest.chess.model.board.Dimension;
import com.technogise.codingtest.chess.model.board.Position;

@Component
public class SouthMove implements StraightMove {

	@Override
	public Set<Position> possibleMoves(Position position, boolean canMoveOnlyOneBlock) {
		Set<Position> positions = new HashSet<>();
		char south = position.getSouth();
		if (south != '-') {
			while (south >= Dimension.MIN_ROW.get()) {
				positions.add(new Position(south, position.getCol()));
				if (canMoveOnlyOneBlock) {
					break;
				}
				south--;
			}
		}
		return positions;
	}
}

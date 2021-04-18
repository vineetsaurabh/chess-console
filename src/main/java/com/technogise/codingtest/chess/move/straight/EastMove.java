package com.technogise.codingtest.chess.move.straight;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.technogise.codingtest.chess.model.board.Dimension;
import com.technogise.codingtest.chess.model.board.Position;

@Component
public class EastMove implements StraightMove {

	@Override
	public Set<Position> possibleMoves(Position position, boolean canMoveOnlyOneBlock) {
		Set<Position> positions = new HashSet<>();
		char east = position.getEast();
		if (east != '-') {
			while (east <= Dimension.MAX_COL.get()) {
				positions.add(new Position(position.getRow(), east));
				if (canMoveOnlyOneBlock) {
					break;
				}
				east++;
			}
		}
		return positions;
	}

}

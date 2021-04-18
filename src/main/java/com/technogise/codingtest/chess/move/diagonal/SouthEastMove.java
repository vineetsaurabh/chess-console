package com.technogise.codingtest.chess.move.diagonal;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.technogise.codingtest.chess.model.board.Dimension;
import com.technogise.codingtest.chess.model.board.Position;

@Component
public class SouthEastMove implements DiagonalMove {

	@Override
	public Set<Position> possibleMoves(Position position, boolean canMoveOnlyOneBlock) {
		Set<Position> positions = new HashSet<>();
		char south = position.getSouth();
		char east = position.getEast();
		if (south != '-' && east != '-') {
			while (south >= Dimension.MIN_ROW.get() && east <= Dimension.MAX_COL.get()) {
				positions.add(new Position(south, east));
				if (canMoveOnlyOneBlock) {
					break;
				}
				south--;
				east++;
			}
		}
		return positions;
	}

}

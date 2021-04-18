package com.technogise.codingtest.chess.move.diagonal;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.technogise.codingtest.chess.model.board.Dimension;
import com.technogise.codingtest.chess.model.board.Position;
import com.technogise.codingtest.chess.move.LinearMove;

@Component
public class NorthEastMove implements DiagonalMove, LinearMove {

	@Override
	public Set<Position> possibleMoves(Position position, boolean canMoveOnlyOneBlock) {
		Set<Position> positions = new HashSet<>();
		char north = position.getNorth();
		char east = position.getEast();
		if (north != '-' && east != '-') {
			while (north <= Dimension.MAX_ROW.get() && east <= Dimension.MAX_COL.get()) {
				positions.add(new Position(north, east));
				if (canMoveOnlyOneBlock) {
					break;
				}
				north++;
				east++;
			}
		}
		return positions;
	}

}

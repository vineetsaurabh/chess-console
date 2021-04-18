package com.technogise.codingtest.chess.move.straight;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.technogise.codingtest.chess.model.board.Dimension;
import com.technogise.codingtest.chess.model.board.Position;
import com.technogise.codingtest.chess.move.PawnMove;

@Component
public class NorthMove implements StraightMove, PawnMove {

	@Override
	public Set<Position> possibleMoves(Position position, boolean canMoveOnlyOneBlock) {
		Set<Position> positions = new HashSet<>();
		char north = position.getNorth();
		if (north != '-') {
			while (north <= Dimension.MAX_ROW.get()) {
				positions.add(new Position(north, position.getCol()));
				if (canMoveOnlyOneBlock) {
					break;
				}
				north++;
			}
		}
		return positions;
	}

}

package com.technogise.codingtest.chess.move.straight;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.technogise.codingtest.chess.model.board.Dimension;
import com.technogise.codingtest.chess.model.board.Position;

@Component
public class WestMove implements StraightMove {

	@Override
	public Set<Position> possibleMoves(Position position, boolean canMoveOnlyOneBlock) {
		Set<Position> positions = new HashSet<>();
		char west = position.getWest();
		if (west != '-') {
			while (west >= Dimension.MIN_COL.get()) {
				positions.add(new Position(position.getRow(), west));
				if (canMoveOnlyOneBlock) {
					break;
				}
				west--;
			}
		}
		return positions;
	}

}

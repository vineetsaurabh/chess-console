package com.technogise.codingtest.chess.move.diagonal;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.technogise.codingtest.chess.model.board.Dimension;
import com.technogise.codingtest.chess.model.board.Position;

@Component
public class NorthWestMove implements DiagonalMove {

	@Override
	public Set<Position> possibleMoves(Position position, boolean canMoveOnlyOneBlock) {
		Set<Position> positions = new HashSet<>();
		char north = position.getNorth();
		char west = position.getWest();
		if (north != '-' && west != '-') {
			while (north <= Dimension.MAX_ROW.get() && west >= Dimension.MIN_COL.get()) {
				positions.add(new Position(north, west));
				if (canMoveOnlyOneBlock) {
					break;
				}
				north++;
				west--;
			}
		}
		return positions;
	}

}

package com.technogise.codingtest.chess.move.horse;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.technogise.codingtest.chess.model.board.Dimension;
import com.technogise.codingtest.chess.model.board.Position;

@Component
public class EastHorseMove implements HorseMove {

	@Override
	public Set<Position> possibleMoves(Position position, boolean canMoveOnlyOneBlock) {
		Set<Position> positions = new HashSet<>();
		char col = position.getCol();
		char eastH = '-';
		if (col < Dimension.MAX_COL.get() - 1) {
			eastH = (char) (col + 2);
		}
		char north = position.getNorth();
		if (eastH != '-' && north != '-' && north <= Dimension.MAX_ROW.get()) {
			positions.add(new Position(north, eastH));
		}
		char south = position.getSouth();
		if (eastH != '-' && south != '-' && south >= Dimension.MIN_ROW.get()) {
			positions.add(new Position(south, eastH));
		}
		return positions;
	}

}

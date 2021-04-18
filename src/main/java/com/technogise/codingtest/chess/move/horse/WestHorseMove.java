package com.technogise.codingtest.chess.move.horse;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.technogise.codingtest.chess.model.board.Dimension;
import com.technogise.codingtest.chess.model.board.Position;

@Component
public class WestHorseMove implements HorseMove {

	@Override
	public Set<Position> possibleMoves(Position position, boolean canMoveOnlyOneBlock) {
		Set<Position> positions = new HashSet<>();
		char col = position.getCol();
		char westH = '-';
		if (col > Dimension.MIN_COL.get() + 1) {
			westH = (char) (col - 2);
		}
		char north = position.getNorth();
		if (westH != '-' && north != '-' && north <= Dimension.MAX_ROW.get()) {
			positions.add(new Position(north, westH));
		}
		char south = position.getSouth();
		if (westH != '-' && south != '-' && south >= Dimension.MIN_ROW.get()) {
			positions.add(new Position(south, westH));
		}
		return positions;
	}
}

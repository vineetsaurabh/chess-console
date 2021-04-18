package com.technogise.codingtest.chess.move.horse;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.technogise.codingtest.chess.model.board.Dimension;
import com.technogise.codingtest.chess.model.board.Position;

@Component
public class NorthHorseMove implements HorseMove {

	@Override
	public Set<Position> possibleMoves(Position position, boolean canMoveOnlyOneBlock) {
		Set<Position> positions = new HashSet<>();
		char row = position.getRow();
		char northH = '-';
		if (row < Dimension.MAX_ROW.get() - 1) {
			northH = (char) (row + 2);
		}
		char east = position.getEast();
		if (northH != '-' && east != '-' && east <= Dimension.MAX_COL.get()) {
			positions.add(new Position(northH, east));
		}
		char west = position.getWest();
		if (northH != '-' && west != '-' && west >= Dimension.MIN_COL.get()) {
			positions.add(new Position(northH, west));
		}
		return positions;
	}
}

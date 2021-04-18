package com.technogise.codingtest.chess.move.horse;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.technogise.codingtest.chess.model.board.Dimension;
import com.technogise.codingtest.chess.model.board.Position;

@Component
public class SouthHorseMove implements HorseMove {

	@Override
	public Set<Position> possibleMoves(Position position, boolean canMoveOnlyOneBlock) {
		Set<Position> positions = new HashSet<>();
		char row = position.getRow();
		char southH = '-';
		if (row > Dimension.MIN_ROW.get() + 1) {
			southH = (char) (row - 2);
		}
		char east = position.getEast();
		if (southH != '-' && east != '-' && east <= Dimension.MAX_COL.get()) {
			positions.add(new Position(southH, east));
		}
		char west = position.getWest();
		if (southH != '-' && west != '-' && west >= Dimension.MIN_COL.get()) {
			positions.add(new Position(southH, west));
		}
		return positions;
	}
}

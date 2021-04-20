package com.technogise.codingtest.chess.model.piece;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.technogise.codingtest.chess.exception.ChessException;
import com.technogise.codingtest.chess.model.board.Position;
import com.technogise.codingtest.chess.move.Move;

@Component
public abstract class AbstractPiece implements Piece {

	@Override
	public Set<Position> possibleMoves(Position position) throws ChessException {
		Set<Position> positions = new HashSet<>();
		for (Move move : getMoves()) {
			positions.addAll(move.possibleMoves(position, canMoveOnlyOneBlock()));
		}
		return positions;
	}
}

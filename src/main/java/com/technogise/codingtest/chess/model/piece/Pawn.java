package com.technogise.codingtest.chess.model.piece;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.technogise.codingtest.chess.exception.ChessException;
import com.technogise.codingtest.chess.model.board.Position;
import com.technogise.codingtest.chess.move.Move;
import com.technogise.codingtest.chess.move.PawnMove;

@Component
public class Pawn extends AbstractPiece {

	@Autowired
	List<PawnMove> moves;

	@Override
	public Set<Position> possibleMoves(Position position) throws ChessException {
		Set<Position> positions = new HashSet<>();
		for (Move move : moves) {
			positions.addAll(move.possibleMoves(position, canMoveOnlyOneBlock));
		}
		return positions;
	}
}
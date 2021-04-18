package com.technogise.codingtest.chess.model.piece;

import java.util.Set;

import org.springframework.stereotype.Component;

import com.technogise.codingtest.chess.exception.ChessException;
import com.technogise.codingtest.chess.model.board.Position;

@Component
public class Queen extends King {

	@Override
	public Set<Position> possibleMoves(Position position) throws ChessException {
		super.canMoveOnlyOneBlock = false;
		return super.possibleMoves(position);
	}

}

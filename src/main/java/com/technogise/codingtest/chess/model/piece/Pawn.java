package com.technogise.codingtest.chess.model.piece;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.technogise.codingtest.chess.move.PawnMove;

@Component
public class Pawn extends AbstractSingleMovePiece {

	@Autowired
	List<PawnMove> moves;

	@Override
	public List<PawnMove> getMoves() {
		return moves;
	}

}

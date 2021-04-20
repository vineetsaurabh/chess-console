package com.technogise.codingtest.chess.model.piece;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.technogise.codingtest.chess.move.straight.StraightMove;

@Component
public class Rook extends AbstractMultiMovePiece {

	@Autowired
	List<StraightMove> moves;

	@Override
	public List<StraightMove> getMoves() {
		return moves;
	}

}

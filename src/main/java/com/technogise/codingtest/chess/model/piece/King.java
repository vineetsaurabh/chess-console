package com.technogise.codingtest.chess.model.piece;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.technogise.codingtest.chess.move.LinearMove;

@Component
public class King extends AbstractSingleMovePiece {

	@Autowired
	private List<LinearMove> moves;

	@Override
	public List<LinearMove> getMoves() {
		return moves;
	}

}

package com.technogise.codingtest.chess.model.piece;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.technogise.codingtest.chess.move.diagonal.DiagonalMove;

@Component
public class Bishop extends AbstractMultiMovePiece {

	@Autowired
	private List<DiagonalMove> moves;

	@Override
	public List<DiagonalMove> getMoves() {
		return moves;
	}

}

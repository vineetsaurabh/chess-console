package com.technogise.codingtest.chess.model.piece;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.technogise.codingtest.chess.move.horse.HorseMove;

@Component
public class Horse extends AbstractSingleMovePiece {

	@Autowired
	private List<HorseMove> moves;

	@Override
	public List<HorseMove> getMoves() {
		return moves;
	}

}

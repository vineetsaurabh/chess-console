package com.technogise.codingtest.chess.model.piece;

public abstract class AbstractSingleMovePiece extends AbstractPiece {

	@Override
	public boolean canMoveOnlyOneBlock() {
		return true;
	}

}

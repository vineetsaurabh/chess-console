package com.technogise.codingtest.chess.model.piece;

public abstract class AbstractMultiMovePiece extends AbstractPiece {

	@Override
	public boolean canMoveOnlyOneBlock() {
		return false;
	}

}

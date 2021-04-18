package com.technogise.codingtest.chess.model.piece;

import org.springframework.stereotype.Component;

@Component
public abstract class AbstractPiece implements Piece {
	protected boolean canMoveOnlyOneBlock = true;
}

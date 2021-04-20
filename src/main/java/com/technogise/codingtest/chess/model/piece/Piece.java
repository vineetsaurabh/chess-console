package com.technogise.codingtest.chess.model.piece;

import java.util.List;
import java.util.Set;

import com.technogise.codingtest.chess.exception.ChessException;
import com.technogise.codingtest.chess.model.board.Position;
import com.technogise.codingtest.chess.move.Move;

public interface Piece {

	Set<Position> possibleMoves(Position p) throws ChessException;

	List<? extends Move> getMoves();

	boolean canMoveOnlyOneBlock();
}

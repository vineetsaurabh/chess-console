package com.technogise.codingtest.chess.model.piece;

import java.util.Set;

import com.technogise.codingtest.chess.exception.ChessException;
import com.technogise.codingtest.chess.model.board.Position;

public interface Piece {

	Set<Position> possibleMoves(Position p) throws ChessException;
}

package com.technogise.codingtest.chess.service;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technogise.codingtest.chess.exception.ChessException;
import com.technogise.codingtest.chess.model.board.Position;
import com.technogise.codingtest.chess.model.piece.Piece;
import com.technogise.codingtest.chess.model.piece.PieceFactory;

@Service
public class ChessService {

	@Autowired
	PieceFactory pieceFactory;

	public String getMoves(String pieceType, String position) throws ChessException {
		Piece piece = pieceFactory.getPiece(pieceType);
		Position pos = new Position(position, piece);

		Set<Position> positions = piece.possibleMoves(pos);
		return positions.stream().map(Object::toString).collect(Collectors.joining(","));
	}
}

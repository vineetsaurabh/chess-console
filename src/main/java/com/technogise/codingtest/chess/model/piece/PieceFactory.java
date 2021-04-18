package com.technogise.codingtest.chess.model.piece;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.technogise.codingtest.chess.exception.ChessException;

@Component
public class PieceFactory {
	private static final Logger logger = LogManager.getLogger(PieceFactory.class);
	
	@Autowired
	List<Piece> pieces;
	
	public Piece getPiece(String pieceType) throws ChessException {
		Piece piece = null;
		for(Piece p : pieces) {
			if(pieceType.equals(p.getClass().getSimpleName())) {
				piece = p;
			}
		}
		if(piece == null) {
			logger.error("Invalid piece type {}", pieceType);
			throw new ChessException("Invalid piece type = " + pieceType);
		}
		return piece;
	}

}

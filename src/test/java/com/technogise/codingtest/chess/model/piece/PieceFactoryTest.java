package com.technogise.codingtest.chess.model.piece;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.technogise.codingtest.chess.exception.ChessException;

@SpringBootTest
class PieceFactoryTest {

	@Autowired
	PieceFactory pieceFactory;

	@Test
	void testGetPiece() throws ChessException {
		Piece piece = pieceFactory.getPiece("King");
		assertTrue(piece instanceof King);
	}

}

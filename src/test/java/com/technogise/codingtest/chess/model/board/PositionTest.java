package com.technogise.codingtest.chess.model.board;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.technogise.codingtest.chess.model.piece.King;
import com.technogise.codingtest.chess.model.piece.Pawn;

class PositionTest {

	Position position = new Position("D5", new King());

	@Test
	void testPositionCharCharPiece() {
		Position position = new Position('A', '6', new King());
		assertNotNull(position);
	}

	@Test
	void testPositionCharChar() {
		Position position = new Position('B', '5');
		assertNotNull(position);
	}

	@Test
	void testPositionStringPiece() {
		Position position = new Position("F5", new Pawn());
		assertNotNull(position);
	}

	@Test
	void testGetRow() {
		assertEquals('D', position.getRow());
	}

	@Test
	void testGetCol() {
		assertEquals('5', position.getCol());
	}

	@Test
	void testGetPiece() {
		assertTrue(position.getPiece() instanceof King);
	}

	@Test
	void testGetEast() {
		assertEquals('6', position.getEast());
	}

	@Test
	void testGetWest() {
		assertEquals('4', position.getWest());
	}

	@Test
	void testGetNorth() {
		assertEquals('E', position.getNorth());
	}

	@Test
	void testGetSouth() {
		assertEquals('C', position.getSouth());
	}

	@Test
	void testToString() {
		assertEquals("D5", position.toString());
	}

	@Test
	void testEqualsObject() {
		Position test = new Position('D', '5');
		assertTrue(test.equals(position));
	}

}

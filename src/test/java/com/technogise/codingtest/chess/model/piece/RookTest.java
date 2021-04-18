package com.technogise.codingtest.chess.model.piece;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.technogise.codingtest.chess.exception.ChessException;
import com.technogise.codingtest.chess.model.board.Position;

@SpringBootTest
class RookTest {

	@Autowired
	Rook rook;

	@Test
	void testPossibleMoves() throws ChessException {
		Position position = new Position("D5");
		Set<Position> result = rook.possibleMoves(position);
		Set<Position> expected = Stream.of(new Position("D1"), new Position("D2"), new Position("D3"),
				new Position("D4"), new Position("D6"), new Position("D7"), new Position("D8"), new Position("A5"),
				new Position("B5"), new Position("C5"), new Position("E5"), new Position("F5"), new Position("G5"),
				new Position("H5")).collect(Collectors.toSet());
		assertEquals(expected, result);
	}

}

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
class BishopTest {

	@Autowired
	Bishop bishop;

	@Test
	void testPossibleMoves() throws ChessException {
		Position position = new Position("A1");
		Set<Position> result = bishop.possibleMoves(position);
		Set<Position> expected = Stream.of(new Position("B2"), new Position("C3"), new Position("D4"),
				new Position("E5"), new Position("F6"), new Position("G7"), new Position("H8"))
				.collect(Collectors.toSet());
		assertEquals(expected, result);
	}

}

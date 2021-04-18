package com.technogise.codingtest.chess.move.diagonal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.technogise.codingtest.chess.model.board.Position;

@SpringBootTest
class NorthWestMoveTest {

	@Autowired
	NorthWestMove northWestMove;

	@Test
	void testPossibleMoves() {
		Position position = new Position("D4");
		boolean canMoveOnlyOneBlock = true;
		Set<Position> result = northWestMove.possibleMoves(position, canMoveOnlyOneBlock);
		Set<Position> expected = Stream.of(new Position("E3")).collect(Collectors.toSet());
		assertEquals(expected, result);

		position = new Position("A1");
		result = northWestMove.possibleMoves(position, canMoveOnlyOneBlock);
		assertEquals(0, result.size());

		canMoveOnlyOneBlock = false;

		position = new Position("B4");
		result = northWestMove.possibleMoves(position, canMoveOnlyOneBlock);
		expected = Stream.of(new Position("C3"), new Position("D2"), new Position("E1")).collect(Collectors.toSet());
		assertEquals(expected, result);

		position = new Position("C1");
		result = northWestMove.possibleMoves(position, canMoveOnlyOneBlock);
		assertEquals(0, result.size());
	}

}

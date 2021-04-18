package com.technogise.codingtest.chess.move.straight;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.technogise.codingtest.chess.model.board.Position;

@SpringBootTest
class EastMoveTest {

	@Autowired
	EastMove eastMove;

	@Test
	void testPossibleMoves() {
		Position position = new Position("D4");
		boolean canMoveOnlyOneBlock = true;
		Set<Position> result = eastMove.possibleMoves(position, canMoveOnlyOneBlock);
		Set<Position> expected = Stream.of(new Position("D5")).collect(Collectors.toSet());
		assertEquals(expected, result);

		position = new Position("A8");
		result = eastMove.possibleMoves(position, canMoveOnlyOneBlock);
		assertEquals(0, result.size());

		canMoveOnlyOneBlock = false;

		position = new Position("B5");
		result = eastMove.possibleMoves(position, canMoveOnlyOneBlock);
		expected = Stream.of(new Position("B6"), new Position("B7"), new Position("B8")).collect(Collectors.toSet());
		assertEquals(expected, result);

		position = new Position("B8");
		result = eastMove.possibleMoves(position, canMoveOnlyOneBlock);
		assertEquals(0, result.size());
	}

}

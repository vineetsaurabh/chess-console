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
class NorthMoveTest {

	@Autowired
	NorthMove northMove;

	@Test
	void testPossibleMoves() {
		Position position = new Position("D4");
		boolean canMoveOnlyOneBlock = true;
		Set<Position> result = northMove.possibleMoves(position, canMoveOnlyOneBlock);
		Set<Position> expected = Stream.of(new Position("E4")).collect(Collectors.toSet());
		assertEquals(expected, result);

		position = new Position("H5");
		result = northMove.possibleMoves(position, canMoveOnlyOneBlock);
		assertEquals(0, result.size());

		canMoveOnlyOneBlock = false;

		position = new Position("E5");
		result = northMove.possibleMoves(position, canMoveOnlyOneBlock);
		expected = Stream.of(new Position("F5"), new Position("G5"), new Position("H5")).collect(Collectors.toSet());
		assertEquals(expected, result);

		position = new Position("H3");
		result = northMove.possibleMoves(position, canMoveOnlyOneBlock);
		assertEquals(0, result.size());
	}

}

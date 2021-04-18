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
class SouthMoveTest {

	@Autowired
	SouthMove southMove;

	@Test
	void testPossibleMoves() {
		Position position = new Position("D4");
		boolean canMoveOnlyOneBlock = true;
		Set<Position> result = southMove.possibleMoves(position, canMoveOnlyOneBlock);
		Set<Position> expected = Stream.of(new Position("C4")).collect(Collectors.toSet());
		assertEquals(expected, result);

		position = new Position("A1");
		result = southMove.possibleMoves(position, canMoveOnlyOneBlock);
		assertEquals(0, result.size());

		canMoveOnlyOneBlock = false;

		position = new Position("C3");
		result = southMove.possibleMoves(position, canMoveOnlyOneBlock);
		expected = Stream.of(new Position("B3"), new Position("A3")).collect(Collectors.toSet());
		assertEquals(expected, result);

		position = new Position("A4");
		result = southMove.possibleMoves(position, canMoveOnlyOneBlock);
		assertEquals(0, result.size());
	}

}

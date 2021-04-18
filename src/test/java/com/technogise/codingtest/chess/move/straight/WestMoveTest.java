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
class WestMoveTest {

	@Autowired
	WestMove westMove;

	@Test
	void testPossibleMoves() {
		Position position = new Position("D4");
		boolean canMoveOnlyOneBlock = true;
		Set<Position> result = westMove.possibleMoves(position, canMoveOnlyOneBlock);
		Set<Position> expected = Stream.of(new Position("D3")).collect(Collectors.toSet());
		assertEquals(expected, result);

		position = new Position("A1");
		result = westMove.possibleMoves(position, canMoveOnlyOneBlock);
		assertEquals(0, result.size());

		canMoveOnlyOneBlock = false;

		position = new Position("B4");
		result = westMove.possibleMoves(position, canMoveOnlyOneBlock);
		expected = Stream.of(new Position("B3"), new Position("B2"), new Position("B1")).collect(Collectors.toSet());
		assertEquals(expected, result);

		position = new Position("B1");
		result = westMove.possibleMoves(position, canMoveOnlyOneBlock);
		assertEquals(0, result.size());
	}

}

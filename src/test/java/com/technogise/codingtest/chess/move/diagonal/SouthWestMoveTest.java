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
class SouthWestMoveTest {

	@Autowired
	SouthWestMove southWestMove;

	@Test
	void testPossibleMoves() {
		Position position = new Position("D4");
		boolean canMoveOnlyOneBlock = true;
		Set<Position> result = southWestMove.possibleMoves(position, canMoveOnlyOneBlock);
		Set<Position> expected = Stream.of(new Position("C3")).collect(Collectors.toSet());
		assertEquals(expected, result);

		position = new Position("A8");
		result = southWestMove.possibleMoves(position, canMoveOnlyOneBlock);
		assertEquals(0, result.size());

		canMoveOnlyOneBlock = false;

		position = new Position("B5");
		result = southWestMove.possibleMoves(position, canMoveOnlyOneBlock);
		expected = Stream.of(new Position("A4")).collect(Collectors.toSet());
		assertEquals(expected, result);

		position = new Position("A4");
		result = southWestMove.possibleMoves(position, canMoveOnlyOneBlock);
		assertEquals(0, result.size());
	}

}

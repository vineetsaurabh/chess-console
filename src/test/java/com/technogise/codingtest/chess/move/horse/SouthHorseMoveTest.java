package com.technogise.codingtest.chess.move.horse;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.technogise.codingtest.chess.model.board.Position;

@SpringBootTest
class SouthHorseMoveTest {

	@Autowired
	SouthHorseMove southHorseMove;

	boolean canMoveOnlyOneBlock = false;

	@Test
	void testPossibleMoves() {
		Position position = new Position("D4");
		Set<Position> result = southHorseMove.possibleMoves(position, canMoveOnlyOneBlock);
		Set<Position> expected = Stream.of(new Position("B3"), new Position("B5")).collect(Collectors.toSet());
		assertEquals(expected, result);

		position = new Position("A8");
		result = southHorseMove.possibleMoves(position, canMoveOnlyOneBlock);
		assertEquals(0, result.size());
	}
}

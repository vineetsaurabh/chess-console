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
class WestHorseMoveTest {

	@Autowired
	WestHorseMove westHorseMove;

	boolean canMoveOnlyOneBlock = false;

	@Test
	void testPossibleMoves() {
		Position position = new Position("D4");
		Set<Position> result = westHorseMove.possibleMoves(position, canMoveOnlyOneBlock);
		Set<Position> expected = Stream.of(new Position("C2"), new Position("E2")).collect(Collectors.toSet());
		assertEquals(expected, result);

		position = new Position("B1");
		result = westHorseMove.possibleMoves(position, canMoveOnlyOneBlock);
		assertEquals(0, result.size());
	}

}

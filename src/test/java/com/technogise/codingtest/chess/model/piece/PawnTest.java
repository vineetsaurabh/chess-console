package com.technogise.codingtest.chess.model.piece;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.technogise.codingtest.chess.exception.ChessException;
import com.technogise.codingtest.chess.model.board.Position;
import com.technogise.codingtest.chess.move.PawnMove;

@SpringBootTest
class PawnTest {

	@Autowired
	Pawn pawn;

	@Test
	public void testGetMoves() {
		List<PawnMove> moves = pawn.getMoves();
		assertEquals(1, moves.size());
	}

	@Test
	void testPossibleMoves() throws ChessException {
		Position position = new Position("D5");
		Set<Position> result = pawn.possibleMoves(position);
		Set<Position> expected = Stream.of(new Position("E5")).collect(Collectors.toSet());
		assertEquals(expected, result);
	}

}

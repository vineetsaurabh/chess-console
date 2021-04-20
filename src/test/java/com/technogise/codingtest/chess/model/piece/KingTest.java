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
import com.technogise.codingtest.chess.move.LinearMove;

@SpringBootTest
class KingTest {

	@Autowired
	King king;

	@Test
	public void testGetMoves() {
		List<LinearMove> moves = king.getMoves();
		assertEquals(8, moves.size());
	}

	@Test
	void testPossibleMoves() throws ChessException {
		Position position = new Position("D5");
		Set<Position> result = king.possibleMoves(position);
		Set<Position> expected = Stream.of(new Position("C4"), new Position("C5"), new Position("C6"),
				new Position("D4"), new Position("D6"), new Position("E4"), new Position("E5"), new Position("E6"))
				.collect(Collectors.toSet());
		assertEquals(expected, result);
	}

}

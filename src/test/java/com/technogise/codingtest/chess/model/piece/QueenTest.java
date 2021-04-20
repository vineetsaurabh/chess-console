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
class QueenTest {

	@Autowired
	Queen queen;

	@Test
	public void testGetMoves() {
		List<LinearMove> moves = queen.getMoves();
		assertEquals(8, moves.size());
	}

	@Test
	void testPossibleMoves() throws ChessException {
		Position position = new Position("D5");
		Set<Position> result = queen.possibleMoves(position);
		Set<Position> expected = Stream.of(new Position("A8"), new Position("D8"), new Position("C6"),
				new Position("D6"), new Position("E6"), new Position("G8"), new Position("C4"), new Position("A2"),
				new Position("D4"), new Position("E4"), new Position("D2"), new Position("G2"), new Position("B7"),
				new Position("A5"), new Position("D7"), new Position("B5"), new Position("C5"), new Position("F7"),
				new Position("B3"), new Position("E5"), new Position("F5"), new Position("D3"), new Position("G5"),
				new Position("F3"), new Position("H5"), new Position("D1"), new Position("H1"))
				.collect(Collectors.toSet());
		assertEquals(expected, result);
	}

}

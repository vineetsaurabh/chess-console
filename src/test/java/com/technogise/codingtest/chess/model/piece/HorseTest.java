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
import com.technogise.codingtest.chess.move.horse.HorseMove;

@SpringBootTest
class HorseTest {

	@Autowired
	Horse horse;

	@Test
	public void testGetMoves() {
		List<HorseMove> moves = horse.getMoves();
		assertEquals(4, moves.size());
	}

	@Test
	void testPossibleMoves() throws ChessException {
		Position position = new Position("D4");
		Set<Position> result = horse.possibleMoves(position);
		Set<Position> expected = Stream.of(new Position("B3"), new Position("B5"), new Position("C2"),
				new Position("C6"), new Position("E2"), new Position("E6"), new Position("F3"), new Position("F5"))
				.collect(Collectors.toSet());
		assertEquals(expected, result);
	}

}

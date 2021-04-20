package com.technogise.codingtest.chess.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StringUtils;

import com.technogise.codingtest.chess.exception.ChessException;

@SpringBootTest
class ChessControllerTest {

	@Autowired
	private ChessController chessController;

	@Test
	void testGetMoves() throws ChessException {
		String moves = chessController.getMoves("King", "D5");
		String[] results = moves.split(",");
		Arrays.sort(results);
		String result = StringUtils.arrayToCommaDelimitedString(results);
		String expected = "C4,C5,C6,D4,D6,E4,E5,E6";
		assertEquals(expected, result);
	}

}

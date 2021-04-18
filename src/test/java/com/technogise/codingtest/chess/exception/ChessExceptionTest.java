package com.technogise.codingtest.chess.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ChessExceptionTest {

	@Test
	void testChessException() {
		String message = "Test";
		ChessException exception = new ChessException(message);
		assertEquals(message, exception.getMessage());
	}

}

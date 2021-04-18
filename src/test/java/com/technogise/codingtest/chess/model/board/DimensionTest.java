package com.technogise.codingtest.chess.model.board;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DimensionTest {

	@Test
	void testGet() {
		assertEquals('1', Dimension.MIN_COL.get());
		assertEquals('8', Dimension.MAX_COL.get());
		assertEquals('A', Dimension.MIN_ROW.get());
		assertEquals('H', Dimension.MAX_ROW.get());
	}

}

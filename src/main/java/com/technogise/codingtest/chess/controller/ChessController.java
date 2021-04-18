package com.technogise.codingtest.chess.controller;

import com.technogise.codingtest.chess.exception.ChessException;

public interface ChessController {

	String getMoves(String pieceType, String position) throws ChessException;
}

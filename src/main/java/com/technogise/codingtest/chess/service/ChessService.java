package com.technogise.codingtest.chess.service;

import com.technogise.codingtest.chess.exception.ChessException;

public interface ChessService {

	String getMoves(String pieceType, String position) throws ChessException;
}

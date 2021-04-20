package com.technogise.codingtest.chess.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.technogise.codingtest.chess.exception.ChessException;
import com.technogise.codingtest.chess.service.ChessService;

@Controller
public class ChessController {

	@Autowired
	ChessService chessService;

	public String getMoves(String pieceType, String position) throws ChessException {
		return chessService.getMoves(pieceType, position);
	}

}

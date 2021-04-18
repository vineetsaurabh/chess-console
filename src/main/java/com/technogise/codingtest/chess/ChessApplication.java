package com.technogise.codingtest.chess;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.technogise.codingtest.chess.controller.ChessController;
import com.technogise.codingtest.chess.exception.ChessException;

@SpringBootApplication
public class ChessApplication implements CommandLineRunner {
	private static final Logger logger = LogManager.getLogger(ChessApplication.class);

	private static final String INPROPER_ARGUMENT_MESSAGE = "Argument is not proper";

	@Autowired
	private ChessController chessController;

	public static void main(String[] args) {
		SpringApplication.run(ChessApplication.class, args);
	}

	@Override
	public void run(String... args) {
		if (args.length > 1) {
			try {
				String possibleMoves = chessController.getMoves(args[0], args[1]);
				System.out.println("\n****************************************************************");
				System.out.println(possibleMoves);
				System.out.println("**************************************************************** \n");
			} catch (ChessException e) {
				logger.error(e.getMessage(), e);
			}
		} else {
			logger.error(INPROPER_ARGUMENT_MESSAGE);
		}
	}
}

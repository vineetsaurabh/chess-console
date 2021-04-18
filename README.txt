This is command line application based on SpringBoot Spring Boot 2.4.5

To build this application, you need maven on you local machine.

Build 
	Clone the project in your local machine.
	Open Command Prompt
	Go to the root directory (chess-console)
	Execute below command
		mvn clean compile package
	If build is successful
		A foler names target will be created under root directory
		There will be a jar named chess-console-1.jar
		
Run
	Go to the target in command prompt
	Execute below command
		java -jar chess-console-1.jar King D5

	(Here King is Type of chess piece and D5 is the Position (cell number) on the chessboard)
		

Output
	On the console the output will be 

	
****************************************************************
E6,C4,E5,D4,E4,C6,D6,C5
****************************************************************


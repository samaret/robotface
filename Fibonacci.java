package week2;

import acm.program.*;

public class Fibonacci extends ConsoleProgram {

	
	public void run() {
		println("This is the fibonacci method.");
		//these variables provide the starting points for the fibonacci method
		int x = 0;
		int y = 1;
		
		//this method loops and prints the outputs of the fibonacci method
		while (x <= MAX_TERM_VALUE) {
		println(x);
		int z = x + y;
		x=y; // the first number becomes the second
		y=z; // the second number becomes the third
		}
	}

	
	private static final int MAX_TERM_VALUE = 10000;
}

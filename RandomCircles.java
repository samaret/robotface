package week2;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class RandomCircles extends GraphicsProgram {
	private static final double MAX_NUM = 10;
	private static final double MAX_RAD = 50;
	private static final double MIN_RAD = 5;
	
	public void run() {
		for (int z = 0; z < MAX_NUM; z++) {
			double size = rgen.nextDouble(MIN_RAD, MAX_RAD);
			double x = rgen.nextDouble (0, getWidth());
			double y = rgen.nextDouble (0, getHeight());
			GOval circle = new GOval (x, y, size, size);
			circle.setFilled(true);
			circle.setFillColor(rgen.nextColor());
			add(circle);
			
			}
		
	
		
	}
private RandomGenerator rgen = RandomGenerator.getInstance();
}

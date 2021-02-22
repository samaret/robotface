package week2;

import java.awt.Color;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class RobotFace extends GraphicsProgram {

	private static final int HEAD_WIDTH = 500;
	private static final int HEAD_HEIGHT = 500;
	private static final int EYE_RADIUS = 30;
	private static final int MOUTH_HEIGHT = 150;
	private static final int MOUTH_WIDTH = 50;
	double x = getWidth();
	double y = getHeight();
	
	
	public void run() {
		
		
		 GRect head = new GRect (x + 225, y + 200, HEAD_WIDTH, HEAD_HEIGHT);
		 head.setColor(Color.blue);
		 head.setFilled(true);
		 head.setFillColor(Color.gray);
		 add (head);
		 
		 GOval eyes = new GOval (x + 300, y +300, EYE_RADIUS * 2, EYE_RADIUS * 2);
		 eyes.setFilled(true);
		 eyes.setFillColor(Color.YELLOW);
		 add (eyes);
		 
		 GOval eyes2 = new GOval (x + 600, y + 300, EYE_RADIUS * 2, EYE_RADIUS * 2);
		 eyes2.setFilled(true);
		 eyes2.setFillColor(Color.YELLOW);
		 add (eyes2);
		 
		 GRect mouth = new GRect (x + 400, y + 600, MOUTH_HEIGHT, MOUTH_WIDTH);
		 mouth.setFilled(true);
		 mouth.setFillColor(Color.white);
		 add (mouth);
		 
		}
	
	}
	

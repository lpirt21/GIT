//the art and science of java chapter 4 exercise 11

import acm.program.*;
import acm.graphics.*;
import java.awt.*;


public class Ch4Ex11 extends GraphicsProgram {
	public void run() {
		double middlex = (getWidth()- BRICK_WIDTH*BRICKS_IN_BASE)/2 ;
		double middley = (getHeight() + BRICK_HEIGHT*BRICKS_IN_BASE)/2;
		for(int i = 0; i<12; i++) {
			for(int j = 0; j<=i; j++) {
			Color myYellow = new Color(255,80 + i*15, 0);
			double x = middlex + i*BRICK_WIDTH - j *BRICK_WIDTH/2;
			double y = middley - j*BRICK_HEIGHT;
			GRect rect = new GRect(x,y, BRICK_WIDTH,BRICK_HEIGHT);
			rect.setFilled(true);
			rect.setFillColor(myYellow);
			add(rect);
			}
			
		}

	}
	
	/* private constants */
	private static final double BRICK_WIDTH = 40;
	private static final double BRICK_HEIGHT = 20;
	private static final int BRICKS_IN_BASE = 12;
	
	
}




//the art and science of java chapter 9 exercise 2

import acm.program.*;
import acm.util.*;
import acm.graphics.*;

public class Ch9Ex2 extends GraphicsProgram{

	private static final int PAUSE_TIME = 1000;
	private static final double squareSize = 200;
	RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
		double cx = getWidth()/2;
		double cy = getHeight()/2;
		double x = cx - squareSize/2;
		double y = cy - squareSize/2;
		GRect rect = new GRect(x, y, squareSize, squareSize);
		rect.setFilled(true);
		add(rect);
		waitForClick();
		while(true) {
			rect.setColor(rgen.nextColor());
			pause(PAUSE_TIME);
		}
		
	}
}

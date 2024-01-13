//the art and science of java chapter 4 exercise 15

import acm.program.*;
import acm.graphics.*;

public class Ch4Ex15 extends GraphicsProgram{
	public void run() {
		double x = (getWidth()-ball)/2;
		double y = (getHeight()-ball)/2;
		GOval oval = new GOval(x,y, ball,ball);
		oval.setFilled(true);
		add(oval);
		while(true) {
			if(dx > 0) {
				dx = (int)Math.min(dx, getWidth() - ball - oval.getX());
			}else {
				dx = (int)Math.max(dx, -oval.getX());
			}
			
			if(dy > 0) {
				dy = (int)Math.min(dy, getHeight() - ball - oval.getY());
			}else {
				dy = (int)Math.max(dy, -oval.getY());
			}
			
			oval.move(dx, dy);
			pause(PAUSE_TIME);
			
		if(oval.getY() >= getHeight()- ball || oval.getY() <=0) {
			dy = -dy;
		}
		if (oval.getX() >= getWidth() - ball || oval.getX() <=0) {
			dx = -dx;
		}
	
		}
	}
	/* private constants */
	private static int dx =10;
	private static int dy =10;
	private static final double ball = 50;
	private static final double PAUSE_TIME = 5;
	
}

import acm.program.*;
import java.awt.*;
import acm.graphics.*;


public class Ch4Ex15 extends GraphicsProgram{
	
	private static final double ball =50;
	private static final int PAUSE_TIME = 10;
	public void run() {
		double x = (getWidth()-ball)/2;
		double y = (getHeight()-ball)/2;
		GOval oval = new GOval(x,y,ball,ball);
		oval.setFilled(true);
		add(oval);
		double dx = 1;
		double dy = 1;
		while(true) {
			if(dx > 0) {
				dx = Math.min(dx, getWidth() - ball - oval.getX());
			}else {
				dx = Math.max(dx, -oval.getX());
			}
			
			if(dy > 0) {
				dy = Math.min(dy, getHeight() - ball - oval.getY());
			}else {
				dy =Math.max(dy, -oval.getY());
			}
			
			oval.move(dx,dy);
			if(oval.getX() >= (getWidth()-ball) || oval.getX() <= 0) {
				dx=-dx;
			}
			if(oval.getY() >= (getHeight()-ball) || oval.getY() <= 0) {
				dy=-dy;
			}
			pause(PAUSE_TIME);
		}
	}
}

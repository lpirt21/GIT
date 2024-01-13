//the art and science of java chapter 5 exercise 6

import acm.program.*;
import java.awt.*;
import acm.graphics.*;

public class Ch5Ex6  extends GraphicsProgram{
	public void run() {
		double x = getWidth()/2;
	    double x0 = getWidth()/2 - FRAME_WIDTH/2;
		double y = getHeight()/2 - FRAME_HEIGHT/2;
	    double diff = (FRAME_HEIGHT - LAMP_AMOUNT*2*LAMP_RADIUS)/(LAMP_AMOUNT+1);
	    double y1 = y + diff;
	    double dy = diff+2*LAMP_RADIUS;
	    add(createFilledRect(x0,y));
	    add(createFilledCircle(x,y1,LAMP_RADIUS,Color.RED)); 
	    add(createFilledCircle(x,y1 + dy,LAMP_RADIUS,Color.YELLOW)); 
	    add(createFilledCircle(x,y1 + 2*dy,LAMP_RADIUS,Color.GREEN)); 
		
	}
	
	private GRect createFilledRect(double x, double y) {
	
		GRect frame = new GRect(x,y,FRAME_WIDTH, FRAME_HEIGHT);
		frame.setFilled(true);
		frame.setFillColor(Color.gray);
	    return frame;
	}
	
	private GOval createFilledCircle(double x, double y, double r, Color color) {
		GOval circle = new GOval(x-r, y, 2*r, 2*r);
		circle.setFilled(true);
		circle.setColor(color);
		return circle;
		
	}
	
	/*private constants*/
	
	private static final double FRAME_WIDTH = 50;
	private static final double FRAME_HEIGHT = 100;
	private static final double LAMP_RADIUS = 10;
	private static final double LAMP_AMOUNT = 3;
}



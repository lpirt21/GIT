//the art and science of java chapter 5 exercise 5

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class Ch5Ex5 extends GraphicsProgram{
	public void run() {
		double x = getWidth()/2;
		double y = getHeight()/2;
		double RADIUS = (OUTER_RADIUS -INNER_RADIUS)/(N_CIRCLES-1);
	    for(int i = 0; i < N_CIRCLES; i++) {
	    	double x0 = x - OUTER_RADIUS + i * RADIUS;
	    	double y0 = y - OUTER_RADIUS + i * RADIUS;
	    	boolean odd = (i %2 !=0);
	    	double r = OUTER_RADIUS - i * RADIUS;
	    	add(createFilledCircle(x0,y0,r,odd));
	    }
		
		
	}
	
	
	private GOval createFilledCircle(double x, double y, double r, boolean odd) {
		GOval oval = new GOval(x, y,2*r,2*r);
        oval.setFilled(true);
		if(odd) {
			oval.setColor(Color.white);
		}else {
			oval.setColor(Color.RED);
		}
		return oval;
	}
	
	/*private constants*/
	private static final int N_CIRCLES = 5;
	private static final double OUTER_RADIUS = 75;
	private static final double INNER_RADIUS = 10;
}



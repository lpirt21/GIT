//the art and science of java chapter 9 exercise 6

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class Ch9Ex6 extends GraphicsProgram{

	public void run() {
		double angle  = (double)360/N_PIECES;
		double angle2 = 0;
		double rx = PIE_WIDTH/2;
		double ry = PIE_HEIGHT/2;
		for(int i = 0; i < N_PIECES; i++) {
			GArc arc = new GArc(2*rx, 2*ry,angle2, angle);
			arc.setFilled(true);
			arc.setFillColor(Color.white);
			add(arc,getWidth()/2-rx,getHeight()/2-ry);
			angle2+=angle;
		}
		
	}

    private static final int N_PIECES = 6;
    private static final double PIE_WIDTH = 400;
    private static final double PIE_HEIGHT = 400;
}

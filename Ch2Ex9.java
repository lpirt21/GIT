//the art and science of java chapter 2 exercise 9

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class Ch2Ex9 extends GraphicsProgram{


	private static final int r = 500;
	private static final int dx = 20;
	
	public void run() {
		GRect rect = new GRect (0, 0, 2000, 2000);
		rect.setFilled(true);
		rect.setColor(Color.CYAN);
		add(rect);
		double x = getWidth()/2-r;
		double y = 30;
		double radius = r;
		for(int i=0; i<7; i++) {
			drawCircle(x,y,color(i),2*radius);
			x = x +dx;
			y = y +dx;
			radius = radius-dx;
		}
	}
	
	private Color color(int i) {
		switch(i) {
			case 0 : return Color.red;
			case 1 : return Color.orange;
			case 2 : return Color.yellow;
			case 3 : return Color.green;
			case 4 : return Color.blue;
			case 5 : return Color.magenta;
			case 6 : return Color.cyan;
			default : return null;
		}
	}

	private void drawCircle(double x, double y, Color color, double circle) {
		GOval oval = new GOval(x,y,circle,circle);
		oval.setFilled(true);
		oval.setColor(color);
		add(oval);
	}
	
}


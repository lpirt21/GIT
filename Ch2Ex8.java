//the art and science of java chapter 2 exercise 8

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class Ch2Ex8 extends GraphicsProgram{

	private static final int circle = 100;
	private static final int dx = 10;
	
	public void run() {
		double x = getWidth()/6;
		double y1 = getHeight()/3;
		double y = y1;
		for(int i =0; i<5; i++) {
			drawCircle(x,y,color(i));
			if(i%2 == 0) {
				y = y + circle/2 + dx; 
			}else {
				y = y1;
			}
			x = x + circle/2 + dx;
		}
	}
	
	private Color color(int i) {
		switch(i) {
			case 0 : return Color.blue;
			case 1 : return Color.yellow;
			case 2 : return Color.black;
			case 3 : return Color.green;
			case 4 : return Color.red;
			default : return null;
		}
	}
	
	private void drawCircle(double x, double y, Color color) {
		GOval oval = new GOval(x,y,circle,circle);
		GOval oval1 = new GOval(x+1, y+1, circle - 2, circle-2);
		GOval oval2 = new GOval(x+2, y+2, circle - 4, circle-4);
		oval.setColor(color);
		add(oval);
		oval1.setColor(color);
		add(oval1);
		oval2.setColor(color);
		add(oval2);	
	}
	
}

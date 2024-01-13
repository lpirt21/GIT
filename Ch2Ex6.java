//the art and science of java chapter 2 exercise 6

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class Ch2Ex6 extends GraphicsProgram{

	private static final double BIG_R = 200;
	private static final int DX = 30;
	private static final int NUM = 7;
	
	public void run() {
		double x1 = getWidth()/2 - BIG_R;
		double y1 = getHeight()/2 - BIG_R;
		double r = BIG_R;
		for(int i = 0; i< NUM; i++) {
		if(i%2 == 0) {
			addOval(x1,y1,Color.RED,r);
		}else {
			addOval(x1,y1,Color.WHITE,r);
		}
		x1 = x1 + DX;
		y1 = y1 + DX;
		r = r - DX;
		}
	}
	
	private void addOval(double x, double y, Color color, double r) {
		GOval oval = new GOval(x,y,2*r,2*r);
		oval.setFilled(true);
		oval.setColor(color);
		add(oval);
	}
	
}

//the art and science of java chapter 9 exercise 12

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class Ch9Ex12 extends GraphicsProgram{

	private static final double PAUSE_TIME = 30;
	public void run() {
		double r = 60;
	
		double dx = 1;
		double dy = 0;
		int i = 1;
		GArc arc1 = new GArc(2*r,2*r,45, 270);
		arc1.setFilled(true);
		arc1.setFillColor(Color.white);
		add(arc1, 0, getHeight()/2-r);
		
	
		
		while(i<=45) {
			arc1.move(dx, dy);
			arc1.setStartAngle(45-i);
			arc1.setSweepAngle(270+2*i);
			pause(PAUSE_TIME);
			i++;
			if(i == 45) {
				for(int j = 0; j <45; j++) {
					arc1.move(dx, dy);
					arc1.setStartAngle(45-i);
					arc1.setSweepAngle(270+2*i);
					pause(PAUSE_TIME);
					i --;
				}
			}
		}
	}
}

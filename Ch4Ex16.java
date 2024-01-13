//the art and science of java chapter 4 exercise 16

import acm.program.*;
import acm.graphics.*;

public class Ch4Ex16 extends GraphicsProgram{
	
	private static final int PAUSE_TIME=3;
	
	public void run() {
		GLabel label = new GLabel("DEWEY DEFEATS TRUMAN");
		label.setFont("Serif-300");
		double x = getWidth();
		double y = getHeight() - label.getHeight()/2 + label.getDescent();
		add(label,x,y);
		int dx = -1;
		int dy =0;
		while(true) {
			label.move(dx, dy);
			pause(PAUSE_TIME);
			if(label.getX() == -label.getWidth()) {
				add(label,x,y);
			}
		}
	}
}

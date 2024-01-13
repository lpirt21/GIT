//the art and science of java chapter 9 exercise 7

import acm.program.*;
import acm.graphics.*;

public class Ch9Ex7 extends GraphicsProgram{

	public void run() {
		double r = 60;
		double cx = getWidth()/2;
	    double cy = getHeight()/2;
	    GArc arc1 = new GArc(2*r,2*r,-45,180);
	    add(arc1,cx-r+r/Math.sqrt(2),cy-r);
	    GArc arc2 = new GArc(2*r,2*r,45,180);
	    add(arc2, cx -r+r/Math.sqrt(2)-r*Math.sqrt(2), cy-r);
		add(new GLine(cx - r*Math.sqrt(2),cy + r/Math.sqrt(2),cx, cy+ 3*r/Math.sqrt(2)));
		add(new GLine(cx,cy+ 3*r/Math.sqrt(2),cx + r*Math.sqrt(2),cy+r/Math.sqrt(2)));
	}

}

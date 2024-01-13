//the art and science of java chapter 9 exercise 6

import acm.program.*;
import acm.graphics.*;
import java.awt.*;


public class Ch9Ex8 extends GraphicsProgram{

	public void run() {
		double r = 50;
		GPolygon heart = createHeart(r);
		add(heart,getWidth()/2+r,getHeight()/2);
	}

	private GPolygon createHeart(double r) {
		GPolygon poly = new GPolygon();
		poly.addArc(2*r,2*r,-45,180);
	    poly.addArc(2*r,2*r,45,180);
	    poly.addPolarEdge(2*r,-45);
	    poly.addPolarEdge(2*r, 45);
	    poly.setFilled(true);
	    poly.setFillColor(Color.red);
	    return poly;
	}
	
}

//the art and science of java chapter 9 exercise 4

import acm.program.*;
import acm.graphics.*;

public class Ch9Ex4  extends GraphicsProgram{

	private static final double side = 80;
	
	public void run() {
		double cx = getWidth()/2;
		double cy = getHeight()/2;
		GPolygon diamond = createDiamond(side);
		add(diamond,cx,cy);
	}
	
	private GPolygon createDiamond(double side) {
		GPolygon poly = new GPolygon();
		poly.addVertex(-side*GMath.sinDegrees(30), 0);
		poly.addPolarEdge(side, 60);
		poly.addPolarEdge(side, -60);
		poly.addPolarEdge(side, -120);
		poly.addPolarEdge(side,120);
		return poly;
	}


}

import acm.graphics.*;
import java.awt.*;

public class GNest extends GCompound{

	public GNest(double width) {
		rect1 = new GRect(0,0,width,width);
		rect1.setFilled(true);
		rect1.setFillColor(Color.CYAN);
		add(rect1);
		diamond1 = createDiamond(width);
		add(diamond1);
		rect2 = new GRect(width/4,width/4,width/2,width/2);
		rect2.setFilled(true);
		rect2.setFillColor(Color.CYAN);
		add(rect2);
		diamond2 = createDiamond(width/2);
		add(diamond2,width/4,width/4);
	}
	
	
	
	private GPolygon createDiamond(double size) {
		double side = size*Math.sqrt(2)/2;
		GPolygon poly = new GPolygon();
	    poly.addVertex(0,size/2);
	    poly.addPolarEdge(side,45);
	    poly.addPolarEdge(side,-45);
	    poly.addPolarEdge(side,-135);
	    poly.addPolarEdge(side,-225);
	    poly.setFilled(true);
	    poly.setFillColor(Color.magenta);
		return poly;
		

	}
	
	private GRect rect1;
	private GPolygon diamond1;
	private GRect rect2;
	private GPolygon diamond2;
	
}

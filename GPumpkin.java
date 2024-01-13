//the art and science of java chapter 9 exercise 5


import java.awt.*;
import acm.graphics.*;

public class GPumpkin extends GCompound {
	
	public GPumpkin(double width, double height) {
		head = new GOval(width,height);
		stem = new GRect(width * STEM_WIDTH, height * STEM_HEIGHT);
		lefteye = createEye(width * EYE_WIDTH, height * EYE_HEIGHT);
		righteye = createEye(width * EYE_WIDTH, height * EYE_HEIGHT);
		nose = createNose(width * NOSE_WIDTH , height * NOSE_HEIGHT);
		mouth = createMouth(width*MOUTH_WIDTH, height*MOUTH_HEIGHT);
		Color myOrange = new Color(255,155,0);
		head.setFilled(true);
		head.setFillColor(myOrange);
		stem.setFilled(true);
		add(head,0,0);
		add(stem,0.5*width - width*STEM_WIDTH/2, -height*STEM_HEIGHT);
		add(nose,0.5*width,0.5*height);
		add(lefteye,0.3*width - width * EYE_WIDTH/2,0.25*height);
		add(righteye,0.7*width - width * EYE_WIDTH/2,0.25*height);
		add(mouth,0.5*width-MOUTH_WIDTH*width/2, 0.65*height);
	}
	
	private GPolygon createEye(double width, double height) {
		GPolygon poly = new GPolygon();
		poly.addVertex(0, 0);
		poly.addEdge(width, 0);
		poly.addEdge(-width/2, height);
		poly.addEdge(-width/2, -height);	
		poly.setFilled(true);
		return poly;
	}
	
	private GPolygon createNose(double width, double height) {
		GPolygon poly = new GPolygon();
		poly.addVertex(-width/2, 0);
		poly.addEdge(width/2, -height);
		poly.addEdge(width/2, height);
		poly.addEdge(-width,0);	
		poly.setFilled(true);
		return poly;
	}
	

	private GPolygon createMouth(double width, double height) {
		double mouthL = 2*((width/5)/Math.sqrt(2));
		GPolygon poly = new GPolygon();
		poly.addVertex(0,(mouthL/2*Math.sqrt(2))/2);
		poly.addPolarEdge(mouthL, -45);
		poly.addPolarEdge(mouthL/2, 45);
		poly.addPolarEdge(mouthL/2, -45);
		poly.addPolarEdge(mouthL/2, 45);
		poly.addPolarEdge(mouthL/2, -45);
		poly.addPolarEdge(mouthL/2, 45);	
		poly.addPolarEdge(mouthL/2, -45);
		poly.addPolarEdge(mouthL, 45);
		poly.addPolarEdge(mouthL/2, 135);
		poly.addPolarEdge(mouthL/2, 225);
		poly.addPolarEdge(mouthL/2, 135);
		poly.addPolarEdge(mouthL/2, 225);
		poly.addPolarEdge(mouthL/2, 135);
		poly.addPolarEdge(mouthL/2, 225);
		poly.addPolarEdge(mouthL/2, 135);
		poly.addPolarEdge(mouthL/2, 225);
		poly.addPolarEdge(mouthL/2, 135);
		poly.addPolarEdge(mouthL/2, 225);
		poly.setFilled(true);
		return poly;
	}
	
	
	
	
	private static final double NOSE_WIDTH = 0.13;
	private static final double NOSE_HEIGHT = 0.13; 
	private static final double EYE_WIDTH =  0.13;
	private static final double EYE_HEIGHT = 0.13;
	private static final double MOUTH_WIDTH = 0.6;
	private static final double MOUTH_HEIGHT = 0.2;
	private static final double STEM_WIDTH = 0.05;
	private static final double STEM_HEIGHT = 0.08;
	
	
	private GOval head;
	private GRect stem;
	private GPolygon lefteye; 
	private GPolygon righteye;
	private GPolygon nose;
	private GPolygon mouth;
}



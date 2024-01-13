
//the art and science of java chapter 5 exercise 8

import acm.program.*;
import java.awt.*;
import acm.graphics.*;

public class Ch5Ex8 extends GraphicsProgram{
	public void run() {
		double trainWidth =  CAR_WIDTH * CARS + CONNECTOR*(CARS+1);
		double x = (getWidth()-trainWidth)/2;
		double y = getHeight();
		double dx = CONNECTOR + CAR_WIDTH;
	    drawEngine(x,y);
		drawBoxcar(x + dx, y, Color.GREEN);
		drawCaboose(x + 2*dx, y);
	}
	
	private void drawEngine(double x, double y) {
			drawCarFrame(x,y,Color.BLACK);
			drawSmokestack(x,y);
			drawCab(x,y);
			drawCowCatcher(x,y);
	}
	private void drawSmokestack(double x, double y ) {
	double x0 = x + CONNECTOR + SMOKESTACK_INSET;
	double y0 = y - CAR_BASELINE - CAR_HEIGHT - SMOKESTACK_HEIGHT;
	GRect rect = new GRect (x0,y0,SMOKESTACK_WIDTH, SMOKESTACK_HEIGHT);
	rect.setFilled(true);
	add(rect);
	}
	
	private void drawCab(double x, double y) {
		double x0 = x + CONNECTOR + CAR_WIDTH - CAB_WIDTH;
		double y0 = y - CAR_BASELINE - CAR_HEIGHT - CAB_HEIGHT;
	    GRect rect = new GRect(x0, y0, CAB_WIDTH, CAB_HEIGHT);
	    rect.setFilled(true);
	    add(rect);
	}
	
	private void drawCowCatcher(double x, double y) {
		double x0 = CONNECTOR/2;
		double x1 = x + x0;
		double x2 = x + 2*x0;
		double y1 = y - CAR_BASELINE;
		double y2 = y1 - CAR_HEIGHT/2;
		add(new GLine(x, y1, x2, y2));
		add(new GLine(x1, y1, x2, y2));
	}
	
	private void drawBoxcar(double x, double y, Color color) {
		drawCarFrame(x, y, color);
		double xRight =  x+ CONNECTOR + CAR_WIDTH/2;
		double doory = y -CAR_BASELINE- DOOR_HEIGHT;
		double xLeft = xRight - DOOR_WIDTH;
		add(new GRect(xLeft, doory, DOOR_WIDTH,DOOR_HEIGHT));
		add(new GRect(xRight, doory, DOOR_WIDTH, DOOR_HEIGHT));
	}
	
	private void drawCaboose(double x, double y) {
		drawCarFrame(x, y, Color.RED);
		double x0 = x + CONNECTOR + (CAR_WIDTH - CUPOLA_WIDTH)/2;
		double y0 = y - CAR_BASELINE - CAR_HEIGHT-CUPOLA_HEIGHT;
		GRect rect = new GRect(x0,y0,CUPOLA_WIDTH,CUPOLA_HEIGHT);
		rect.setFilled(true);
		rect.setFillColor(Color.RED);
	}
	
	private void drawCarFrame(double x, double y, Color color) {
		double x0 = x + CONNECTOR;
		double y0 = y - CAR_BASELINE;
		double top = y0 - CAR_HEIGHT;
		add(new GLine(x, y0, x + CAR_WIDTH + 2*CONNECTOR, y0));
		drawWheel(x0 + WHEEL_INSET, y - WHEEL_RADIUS);
		drawWheel(x0 + CAR_WIDTH - WHEEL_INSET, y - WHEEL_RADIUS);
		GRect rect = new GRect(x0, top, CAR_WIDTH, CAR_HEIGHT);
		rect.setFilled(true);
		rect.setFillColor(color);
		add(rect);
	}
	
	private void drawWheel(double x, double y) {
		double r = WHEEL_RADIUS;
		GOval wheel = new GOval(x-r, y-r, r,r);
		wheel.setFilled(true);
		wheel.setFillColor(Color.gray);
		add(wheel);
	}
	 /* The amount of cars */
		private static final double CARS = 3;
	
	 /* Dimensions of the frame of a train car */
		private static final double CAR_WIDTH = 75;
		private static final double CAR_HEIGHT = 36;
	
	 /* Distance from the bottom of a train car to the track below it */
		private static final double CAR_BASELINE = 10;
	
	/* Width of the connector, which overlaps between successive cars */
		private static final double CONNECTOR = 6;

	/* Radius of the wheels on each car */
		private static final double WHEEL_RADIUS = 8;
	
	/* Distance from the edge of the frame to the center of the wheel */
		private static final double WHEEL_INSET = 16;
	
	/* Dimension of the cab on the engine */
		private static final double CAB_WIDTH = 35;
		private static final double CAB_HEIGHT = 8;
		
	/* Dimensions of the smokestack and its distance from the front */
		private static final double SMOKESTACK_WIDTH = 8;
		private static final double SMOKESTACK_HEIGHT = 8;
		private static final double SMOKESTACK_INSET = 8;
		
	/* Dimensions of the door panels on the boxcar */
		private static final double DOOR_WIDTH = 18;
		private static final double DOOR_HEIGHT = 32;
		
	/* Dimensions of the cupola on the caboose*/
		private static final double CUPOLA_WIDTH = 35;
		private static final double CUPOLA_HEIGHT = 8;
	
}
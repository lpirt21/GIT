//the art and science of java chapter 5 exercise 9

import acm.program.*;
import acm.graphics.*;


public class Ch5Ex9 extends GraphicsProgram{
	public void run() {
		double x = getWidth()/2;
		double y = (getHeight()- 200)/2;
		double x0 = x - HOUSE_WIDTH/2;
	    GRect house = new GRect(x0, y, HOUSE_WIDTH, HOUSE_HEIGHT);
	    add(house);
	    add(new GLine(x0, y, x0 + ROOFLINE_WIDTH, y - ROOFLINE_HEIGHT));
	    add(new GLine(x0 + ROOFLINE_WIDTH, y - ROOFLINE_HEIGHT, x0 + 2*ROOFLINE_WIDTH, y));
	    double doory =  y + HOUSE_HEIGHT - DOOR_HEIGHT;
	    GRect door = new GRect(x - DOOR_WIDTH/2,doory, DOOR_WIDTH, DOOR_HEIGHT);
	    add(door);
	    double doorknobx = x + DOOR_WIDTH/2 - DOORKNOB_INSET - DOORKNOB;
	    double doorknoby = y + HOUSE_HEIGHT - DOOR_HEIGHT/2 - DOORKNOB/2;
	    GOval doorknob = new GOval(doorknobx,doorknoby, DOORKNOB, DOORKNOB);
	    add(doorknob);
	    upperWindow(x0,y);
	    upperWindow(x, y);
	    double lowerx1 = x0 + LOWER_WINDOW_INSETX;
	    double lowerx2 = x0 +HOUSE_WIDTH -WINDOW_WIDTH*3 - LOWER_WINDOW_INSETX;
	    double lowery = doory + LOWER_WINDOW_INSETY;
	    lowerWindow(lowerx1, lowery);
	    lowerWindow(lowerx2, lowery);
	  
	}
	
	private void upperWindow (double x, double y) {
		double x0 = x + UPPER_WINDOW_INSETX;
		double y0 = y + UPPER_WINDOW_INSETY;
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j <2; j++) {
				double x1 = x0 + i * WINDOW_WIDTH;
				double y1 = y0 + j * WINDOW_HEIGHT;
				GRect rect = new GRect(x1, y1, WINDOW_WIDTH, WINDOW_HEIGHT);
			    add(rect);
			}
		}
	}
	
	
	private void lowerWindow (double x, double y) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j <2; j++) {
				double x1 = x + i * WINDOW_WIDTH;
				double y1 = y + j * WINDOW_HEIGHT;
				GRect rect = new GRect(x1, y1, WINDOW_WIDTH, WINDOW_HEIGHT);
			    add(rect);
			}
		}
	}
	
	
	
	private static final double HOUSE_WIDTH = 450;
	private static final double HOUSE_HEIGHT = 300;
	
	private static final double DOOR_WIDTH = 50;
	private static final double DOOR_HEIGHT = 100;
	private static final double DOORKNOB= 8;
	private static final double DOORKNOB_INSET = 6;
	
	private static final double WINDOW_WIDTH = 30;
	private static final double WINDOW_HEIGHT = 40;
	
	private static final double LOWER_WINDOW_INSETX =  45;   
	private static final double LOWER_WINDOW_INSETY = 2; 
	
	private static final double UPPER_WINDOW_INSETX = 75;
	private static final double UPPER_WINDOW_INSETY = 45;
	
	private static final double ROOFLINE_WIDTH = 225;
	private static final double ROOFLINE_HEIGHT = 100;
	
}


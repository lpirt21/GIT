//the art and science of java chapter 2 exercise 4

import acm.program.*;
import acm.graphics.*;

public class Ch2Ex4 extends GraphicsProgram{

	private static final int HOUSE_WIDTH = 400;
	private static final int HOUSE_HEIGHT = 180;
	
	private static final int ROOF_HEIGHT = 50;
	
	private static final int WINDOW = 100;
	
	private static final int WINDOW_DX = 25;
	private static final int WINDOW_DY = 20;
	
	private static final int DOOR_WIDTH = 100;
	private static final int DOOR_HEIGHT = 130;
	
	private static final int DOOR_HANDLE = 16;
	private static final int DOOR_HANDLEDX = 8;
	
	public void run() {
		drawHouse();
		drawRoof();
		drawWindows();
		drawDoor();
	}
	
	private void drawHouse() {
		double x = (getWidth() - HOUSE_WIDTH)/2;
		double y = (getHeight() - (HOUSE_HEIGHT + ROOF_HEIGHT))/2 + ROOF_HEIGHT;
		add(new GRect(x,y,HOUSE_WIDTH,HOUSE_HEIGHT));
	}
	
	private void drawRoof() {
		double x1 = (getWidth() - HOUSE_WIDTH)/2;
		double x2 = getWidth()/2;
		double x3 = x1 + HOUSE_WIDTH;
		double y1 =(getHeight() - (HOUSE_HEIGHT + ROOF_HEIGHT))/2 + ROOF_HEIGHT;
	    double y2 = (getHeight() - (HOUSE_HEIGHT + ROOF_HEIGHT))/2;
	    add(new GLine(x1,y1,x2,y2));
	    add(new GLine(x2,y2,x3,y1));
	}
	
	private void drawWindows() {
		double x1 = (getWidth() - HOUSE_WIDTH)/2 + WINDOW_DX;
		double y = (getHeight() - (HOUSE_HEIGHT + ROOF_HEIGHT))/2 + ROOF_HEIGHT + WINDOW_DY;
		double x2 = (getWidth() + DOOR_WIDTH)/2 + WINDOW_DX;
		add(new GRect(x1,y,WINDOW,WINDOW));
		add(new GRect(x2,y,WINDOW,WINDOW));
	}
	
	private void drawDoor() {
		double x = (getWidth() -DOOR_WIDTH)/2;
		double y = getHeight()/2 + HOUSE_HEIGHT/2 +ROOF_HEIGHT/2 - DOOR_HEIGHT;
		double x0 = getWidth()/2 + DOOR_WIDTH/2 - DOOR_HANDLE - DOOR_HANDLEDX;
		double y0 = y + DOOR_HEIGHT/2 - DOOR_HANDLE/2;
		add(new GOval(x0,y0,DOOR_HANDLE,DOOR_HANDLE));
		add(new GRect(x,y,DOOR_WIDTH,DOOR_HEIGHT));
	}
	
}

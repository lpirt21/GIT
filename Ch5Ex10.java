//the art and science of java chapter 5 exercise 10

import acm.program.*;
import acm.graphics.*;

public class Ch5Ex10 extends GraphicsProgram{
	public void run() {
		double x = BIG_CASTLE_INSETX;
		double y0 = getHeight()- CASTLE_INSETY;
		double y1 = y0-BIG_CASTLE_HEIGHT; 
		drawBigCastle(x,y1);
		drawBigCastle(x+ BIG_CASTLE_WIDTH + CASTLE_WIDTH,y1);
		drawCastle(x + BIG_CASTLE_WIDTH,y0 - CASTLE_HEIGHT);
		double dx = x + BIG_CASTLE_WIDTH*2 +CASTLE_WIDTH+ LITTLE_CASTLE_INSET;
		double dx1 = LITTLE_CASTLE_INSET + LITTLE_CASTLE_WIDTH;
		double dy = y0 - LITTLE_CASTLE_HEIGHT;
		 drawlittleCastle(dx,dy);
		 drawlittleCastle(dx + dx1, dy);
		 drawlittleCastle(dx + 2*dx1, dy);
	}
	
	private void drawBigCastle(double x, double y) {
		GRect rect = new GRect(x,y,BIG_CASTLE_WIDTH,BIG_CASTLE_HEIGHT);
		add(rect);
		add(new GLine(x, y, x + BIG_CASTLE_WIDTH/2, y - BIG_CASTLE_ROOF_HEIGHT));
		add(new GLine(x + BIG_CASTLE_WIDTH/2, y - BIG_CASTLE_ROOF_HEIGHT, x +BIG_CASTLE_WIDTH, y));
	}
	
	private void drawCastle(double x, double y) {
		GRect rect = new GRect(x,y,CASTLE_WIDTH, CASTLE_HEIGHT);
		add(rect);
		add(new GLine(x,y,x + CASTLE_WIDTH/2, y - MEDIUM_CASTLE_ROOF_HEIGHT));
		add(new GLine(x + CASTLE_WIDTH/2, y - MEDIUM_CASTLE_ROOF_HEIGHT, x+ CASTLE_WIDTH, y));
		double x1 = (CASTLE_WIDTH/2 - OVAL)/2;
		add(new GOval(x + x1, y + OVAL_INSETY, OVAL,OVAL));
		add(new GOval(x +CASTLE_WIDTH/2 + x1, y + OVAL_INSETY, OVAL,OVAL));
		double doorx = x +  CASTLE_WIDTH/2 - DOOR_WIDTH/2;
		double doory =  y + CASTLE_HEIGHT -DOOR_HEIGHT;
		add(new GRect(doorx,doory, DOOR_WIDTH,DOOR_HEIGHT));
		add(new GLine(doorx,doory, doorx + DOOR_WIDTH/2, doory -DOOR_ROOF_HEIGHT));
		add(new GLine(doorx + DOOR_WIDTH/2, doory -DOOR_ROOF_HEIGHT, doorx + DOOR_WIDTH,doory));
	}
	
	private void drawlittleCastle(double x, double y) {
		GRect rect = new GRect(x,y,LITTLE_CASTLE_WIDTH,LITTLE_CASTLE_HEIGHT);
		add(rect);
		add(new GLine(x,y, x +LITTLE_CASTLE_WIDTH/2, y - LITTLE_CASTLE_ROOF_HEIGHT));
		add(new GLine(x +LITTLE_CASTLE_WIDTH/2, y - LITTLE_CASTLE_ROOF_HEIGHT, x +LITTLE_CASTLE_WIDTH,y));
	}
	
	private static final double BIG_CASTLE_HEIGHT = 320;
	private static final double BIG_CASTLE_WIDTH = 50;
	private static final double BIG_CASTLE_INSETX = 30;
	
	private static final double CASTLE_INSETY = 25;
	
	private static final double CASTLE_WIDTH = 200;
	private static final double CASTLE_HEIGHT = 230;
	
	private static final double OVAL = 40;
    private static final double OVAL_INSETY = 50;
	
	private static final double DOOR_HEIGHT = 70;
	private static final double DOOR_WIDTH = 30;
	
	private static final double DOOR_ROOF_HEIGHT = 25;
	
	private static final double BIG_CASTLE_ROOF_HEIGHT = 70;
	private static final double MEDIUM_CASTLE_ROOF_HEIGHT = 120;
	private static final double LITTLE_CASTLE_ROOF_HEIGHT = 100;
	
	private static final double LITTLE_CASTLE_HEIGHT = 160;
	private static final double LITTLE_CASTLE_WIDTH= 30;
	private static final double LITTLE_CASTLE_INSET = 50;
}



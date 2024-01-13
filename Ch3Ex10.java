//the art and science of java chapter 3 exercise 10

import acm.program.*;
import acm.graphics.*;

public class Ch3Ex10 extends GraphicsProgram{
	
	private static final int BOARD_SIZE = 90;
	
	public void run() {
		double x = (getWidth() -BOARD_SIZE)/2;
		double y = (getHeight() - BOARD_SIZE)/2;
		add(new GLine(x + BOARD_SIZE/3,y, x + BOARD_SIZE/3, y + BOARD_SIZE));
		add(new GLine(x + 2*BOARD_SIZE/3, y,x+2*BOARD_SIZE/3,y + BOARD_SIZE));
		add(new GLine(x,y +BOARD_SIZE/3, x + BOARD_SIZE, y + BOARD_SIZE/3));
		add(new GLine(x, y + 2*BOARD_SIZE/3, x+BOARD_SIZE, y+ 2*BOARD_SIZE/3));
	}
	
}
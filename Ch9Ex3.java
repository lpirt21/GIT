//the art and science of java chapter 9 exercise 3

import acm.program.*;
import acm.util.*;
import acm.graphics.*;
import java.awt.*;


public class Ch9Ex3 extends GraphicsProgram{

	RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
	
				
	while(true) {
		int n = rgen.nextInt(1,7);
		int m = rgen.nextInt(1,7);
		while(m==n) {
			m = rgen.nextInt(1,7);	
		}
		double labelx= getWidth() - label(n,m).getWidth();
		double labely = label(n,m).getAscent();
		double x0 = rgen.nextDouble(0,labelx);
		double y0 = rgen.nextDouble(labely,getHeight());
		pause(1000);
		removeAll();
		add(label(n,m),x0,y0);
	
		}
	}
	
	private GLabel label(int n, int m) {
		
		GLabel red = new GLabel("RED");
		GLabel orange = new GLabel("ORANGE");
		GLabel yellow = new GLabel("YELLOW");
		GLabel green = new GLabel("GREEN");
		GLabel cyan = new GLabel("CYAN");
		GLabel blue = new GLabel("BLUE");
		GLabel magenta = new GLabel("MAGENTA");
		GLabel nothing = new GLabel("");
		
		red.setFont("Helvetica-80");
		orange.setFont("Helvetica-80");
		yellow.setFont("Helvetica-80");
		green.setFont("Helvetica-80");
		cyan.setFont("Helvetica-80");
		blue.setFont("Helvetica-80");
		magenta.setFont("Helvetica-80");
		
		Color color = null;
		
		switch(m) {
		case 1 : color = Color.RED;break;
		case 2 : color = Color.ORANGE;break;
		case 3 : color = Color.YELLOW;break;
		case 4 : color = Color.GREEN;break;
		case 5 : color = Color.CYAN;break;
		case 6 : color = Color.BLUE;break;
		case 7 : color = Color.MAGENTA;break;
		}

		red.setColor(color);
		orange.setColor(color);
		yellow.setColor(color);
		green.setColor(color);
		cyan.setColor(color);
		blue.setColor(color);
		magenta.setColor(color);
		
		switch(n) {
		case 1 : return red;
		case 2 : return orange;
		case 3 : return yellow;
		case 4 : return green;
		case 5 : return cyan;
		case 6 : return blue;
		case 7 : return magenta;
		default: return nothing;
		}
	}

}




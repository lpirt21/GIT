
//the art and science of java chapter 10 exercise 1


import acm.program.*;
import acm.util.*;
import acm.graphics.*;
import java.awt.*;
import java.awt.event.*;


public class Ch10Ex1 extends GraphicsProgram{


	RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
	
		int n = rgen.nextInt(1,7);
		int m = rgen.nextInt(1,7);
		original = n;
		while(m==n) {
			m = rgen.nextInt(1,7);	
		}
		double labelx= getWidth() - label(n,m).getWidth();
		double labely = label(n,m).getAscent();
		double x0 = rgen.nextDouble(0,labelx);
		double y0 = rgen.nextDouble(labely,getHeight());
		label1 = label(n,m);
		add(label1,x0,y0);
		addMouseListeners();
	}
	
	
	public void mouseClicked(MouseEvent e) {
		Color col = color(original);
		if(e.getX() >= label1.getX() && e.getX() <= label1.getX() +label1.getWidth() &&
				e.getY() <= label1.getY() && e.getY() >= label1.getY() - label1.getHeight()) {
			label1.setColor(col);
		}
	}
	
	public void mouseReleased(MouseEvent e) {
		int k = rgen.nextInt(1,7);
		while(k==original) {
			k = rgen.nextInt(1,7);	
		}
		Color col = color(k);
		label1.setColor(col);
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
		
	
		red.setColor(color(m));
		orange.setColor(color(m));
		yellow.setColor(color(m));
		green.setColor(color(m));
		cyan.setColor(color(m));
		blue.setColor(color(m));
		magenta.setColor(color(m));
		
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

	
	
	private Color color(int m) {
		
		switch(m) {
		case 1 : return Color.RED;
		case 2 : return Color.ORANGE;
		case 3 : return Color.YELLOW;
		case 4 : return Color.GREEN;
		case 5 : return Color.CYAN;
		case 6 : return Color.BLUE;
		case 7 : return Color.MAGENTA;
		default : return Color.green;
		}
	}

	
	private GLabel label1;
	private int original;
}







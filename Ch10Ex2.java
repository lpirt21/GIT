
//the art and science of java chapter 10 exercise 2


import java.awt.event.*;
import acm.graphics.*;
import acm.program.*;

public class Ch10Ex2 extends GraphicsProgram{

	public void init() {
		addMouseListeners();
	}
	
	public void mouseClicked(MouseEvent e) {
		int a = e.getX();
		int b = e.getY();
		label = new GLabel("(" + a + ", " + b + ")");
		 add(label, e.getX()-label.getWidth(), e.getY());
	}
	
	public void mouseDragged(MouseEvent e) {
		removeAll();
		lastx = e.getX();
		lasty = e.getY();
		label = new GLabel("(" + lastx + ", " + lasty + ")");
		add(label, e.getX() - label.getWidth(), e.getY());
	}
	
	private int lastx;
	private int lasty;
	private GLabel label;
}



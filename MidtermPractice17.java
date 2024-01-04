import acm.program.*;
import acm.util.RandomGenerator;
import acm.graphics.*;
import java.awt.event.*;
import java.awt.*;

public class MidtermPractice17 extends GraphicsProgram{
	
	RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
		GRect rect = new GRect(120,120,200,170);
		rect.setFilled(true);
		rect.setColor(Color.BLUE);
		add(rect);
		GOval oval = new GOval(300,300,50,120);
		oval.setFilled(true);
		oval.setColor(Color.ORANGE);
		add(oval);
		addMouseListeners();
		addKeyListeners();
	}
	
	public void mousePressed(MouseEvent e) {
		last = new GPoint(e.getX(), e.getY());
		gobj = getElementAt(last);
	}
	
	public void mouseDragged(MouseEvent e) {
		if(gobj != null) {
			gobj.move(e.getX() - last.getX(), e.getY() - last.getY());
			last = new GPoint(e.getPoint());
		}
	}
	
	public void mouseClicked(MouseEvent e) {
		if(gobj != null) gobj.sendToFront();
	}
	

	public void keyPressed(KeyEvent e) {
		if(gobj != null) {
			gobj.setColor(rgen.nextColor());
		}
	}
	
	private GObject gobj;
	private GPoint last;
	
}

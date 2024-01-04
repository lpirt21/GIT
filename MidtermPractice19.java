import acm.program.*;
import acm.graphics.*;
import java.awt.event.*;
import java.awt.*;

public class MidtermPractice19 extends GraphicsProgram{
	
	
	public void run() {
		GOval oval = new GOval(300,300,100,100);
		oval.setFilled(true);
		oval.setColor(Color.ORANGE);
		add(oval);
		addMouseListeners();
		addKeyListeners();
	}
	
	public void mouseMoved(MouseEvent e) {
		boolean flag = e.getX()>=0 && e.getX()<=getWidth() && e.getY()>=0 &&e.getY()<=getHeight();
		if(gobj != null & flag) {
			gobj.move(e.getX() - last.getX(), e.getY() - last.getY());
			last = new GPoint(e.getPoint());
		}
	}
	
	public void mouseClicked(MouseEvent e) {
		last = new GPoint(e.getX(), e.getY());
		gobj = getElementAt(last);
	}

	private GObject gobj;
	private GPoint last;
	
}

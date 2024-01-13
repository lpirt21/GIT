//the art and science of java chapter 10 exercise 7


import java.awt.*;
import acm.graphics.*;
import acm.program.*;
import java.awt.event.*;
import acm.util.*;
import javax.swing.*;

public class Ch10Ex7 extends GraphicsProgram{
	
	RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void init() {
		add(new JButton("Clear"),SOUTH);
		name = new JTextField(MAXNAME);
		name.addActionListener(this);
		add(new JLabel("Star name"),SOUTH);
		add(name, SOUTH);
		comp = new GCompound();
		addMouseListeners();
		addActionListeners();
		addKeyListeners();
	}


	public void mousePressed(MouseEvent e) {
		last = new GPoint(e.getX(), e.getY());
		gobj = getElementAt(last);
		comp = (GCompound) getElementAt(last);
		star = new GStar(STAR, true, rgen.nextColor());
		if(gobj == null) {
		add(star, e.getX(), e.getY());
		}
	}
	

	
	public void keyPressed(KeyEvent e) {
		if(gobj != null) {
			switch(e.getKeyCode()) {
			case KeyEvent.VK_DOWN : gobj.move(0, +1);break;
			case KeyEvent.VK_UP : gobj.move(0, -1);break;
			case KeyEvent.VK_RIGHT : gobj.move(+1, 0);break;
			case KeyEvent.VK_LEFT : gobj.move(-1,  0);break;
			case KeyEvent.VK_DELETE : remove(gobj);break;
			}
		}
	}
	
	
	
	
	public void mouseDragged(MouseEvent e) {
		if(gobj != null) {
			gobj.move(e.getX() - last.getX(),e.getY() - last.getY());
			last = new GPoint(e.getX(), e.getY());
		}
		if(comp != null) {
			comp.move(e.getX() - last.getX(),e.getY() - last.getY());
			last = new GPoint(e.getX(), e.getY());
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Clear")) removeAll();
		if(e.getSource() == name) {
			label = new GLabel("");
			label.setLabel(name.getText());
			label.setFont("Helvetica-16");
			label.setColor(gobj.getColor());
			add(label, last.getX() +2*star.getWidth()/3, last.getY());
			comp = new GCompound();
			comp.add(gobj, last.getX(),last.getY());
			comp.add(label,last.getX() +2*star.getWidth()/3, last.getY());
			add(comp);
		}
	}
	
	


	private GCompound comp;
	private GStar star;
	private GLabel label;
	private static final int MAXNAME = 20;
	private JTextField name;
	private GPoint last;
	private GObject gobj;
	private static final double STAR = 50;
}



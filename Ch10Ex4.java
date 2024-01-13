//the art and science of java chapter 10 exercise 2

import acm.program.*;
import acm.graphics.*;
import java.awt.event.*;


public class Ch10Ex4 extends GraphicsProgram{

	private GRect rect;
	private GRect rect2;
	private GPoint last;
	private double rectW;
	private double rectH;
	private GPoint start;
	
	public void init() {
		addMouseListeners();	
	}
	
	public void mousePressed(MouseEvent e) {
		last = new GPoint(e.getX(), e.getY());
		start = new GPoint(e.getX(), e.getY());
	}
	
	
	public void mouseDragged(MouseEvent e) {
		//left and down
		if(e.getX() < start.getX() && e.getY()>start.getY()) {
			if(gobj != null) {
				remove(gobj);
			}
			rect = new GRect(last.getX(), start.getY(), rectW, rectH);
			rectH = e.getY() -start.getY();
			rectW = start.getX()-e.getX();
			rect.setFilled(true);
			rect2 = new GRect(last.getX(), start.getY(), rectW, rectH);
			rectH = e.getY() -start.getY();
			rectW = start.getX()-e.getX();
			rect2.setFilled(true);
			gobj = rect;
			add(gobj);
			if(e.getX() > last.getX()) {
				if(gobj != null) {
					remove(gobj);
				}
				rect = new GRect(last.getX(), start.getY(), rectW, rectH);
				rectW = start.getX()-e.getX();
				rect.setSize(rectW, rectH);
				rect.setFilled(true);
				rect2 = new GRect(last.getX(), start.getY(), rectW, rectH);
				rectW = start.getX()-e.getX();
				rect2.setSize(rectW, rectH);
				rect2.setFilled(true);
				gobj = rect;
				add(gobj);
			}else if(e.getY()< last.getY()) {
				if(gobj != null) {
					remove(gobj);
				}
				rect = new GRect(last.getX(), start.getY(), rectW, rectH);
				rectH = e.getY()-start.getY();
				rect.setSize(rectW, rectH);
				rect.setFilled(true);
				rect2 = new GRect(last.getX(), start.getY(), rectW, rectH);
				rectH = e.getY()-start.getY();
				rect2.setSize(rectW, rectH);
				rect2.setFilled(true);
				gobj = rect;
				add(gobj);
			}
		//left and up
		}else if(e.getX() < start.getX() && e.getY()< start.getY()) {
			if(gobj != null) {
				remove(gobj);
			}
				rect = new GRect(last.getX(), last.getY(), rectW, rectH);
				rectH = start.getY()-e.getY();
				rectW = start.getX()-e.getX();
				rect.setFilled(true);
				rect2 = new GRect(last.getX(), last.getY(), rectW, rectH);
				rectH = start.getY()-e.getY();
				rectW = start.getX()-e.getX();
				rect2.setFilled(true);
				gobj = rect;
				add(gobj);
			if(e.getX() > last.getX()) {
				if(gobj != null) {
					remove(gobj);
				}
				rect = new GRect(last.getX(), last.getY(), rectW, rectH);
				rectW = start.getX()-e.getX();
				rect.setSize(rectW, rectH);
				rect.setFilled(true);
				rect2 = new GRect(last.getX(), last.getY(), rectW, rectH);
				rectW = start.getX()-e.getX();
				rect2.setSize(rectW, rectH);
				rect2.setFilled(true);
				gobj = rect;
				add(gobj);
			}else if(e.getY() > last.getY()) {
				if(gobj != null) {
					remove(gobj);
				}
				rect = new GRect(last.getX(), last.getY(), rectW, rectH);
				rectH =  start.getY()-e.getY();
				rect.setSize(rectW, rectH);
				rect.setFilled(true);
				rect2 = new GRect(last.getX(), last.getY(), rectW, rectH);
				rectH =  start.getY()-e.getY();
				rect2.setSize(rectW, rectH);
				rect2.setFilled(true);
				gobj = rect;
				add(gobj);
			}
		//right and up
		}else if(e.getX() > start.getX() && e.getY()< start.getY()) {
			if(gobj != null) {
				remove(gobj);
			}
			rect = new GRect(start.getX(), last.getY(), rectW, rectH);
			rectH = start.getY()-e.getY();
			rectW = e.getX()-start.getX();
			rect.setFilled(true);
			rect2 = new GRect(start.getX(), last.getY(), rectW, rectH);
			rectH = start.getY()-e.getY();
			rectW = e.getX()-start.getX();
			rect2.setFilled(true);
			gobj = rect;
			add(gobj);
			if(e.getX()< last.getX()) {
				if(gobj != null) {
					remove(gobj);
				}
				rect = new GRect(start.getX(), last.getY(), rectW, rectH);
				rectW = e.getX()-start.getX();
				rect.setSize(rectW, rectH);
				rect.setFilled(true);
				rect2 = new GRect(start.getX(), last.getY(), rectW, rectH);
				rectW = e.getX()-start.getX();
				rect2.setSize(rectW, rectH);
				rect2.setFilled(true);
				gobj = rect;
				add(gobj);
			}else if(e.getY() > last.getY()) {
				if(gobj != null) {
					remove(gobj);
				}
				rect = new GRect(start.getX(), last.getY(), rectW, rectH);
				rectH =  start.getY()-e.getY();
				rect.setSize(rectW, rectH);
				rect.setFilled(true);
				rect2 = new GRect(start.getX(), last.getY(), rectW, rectH);
				rectH =  start.getY()-e.getY();
				rect2.setSize(rectW, rectH);
				rect2.setFilled(true);
				gobj = rect;
				add(gobj);
			}
		//right and down
		}else {
			if(gobj != null) {
				remove(gobj);
			}
				rect = new GRect(start.getX(), start.getY(), rectW, rectH);
				rectH = e.getY() -start.getY();
				rectW = e.getX()-start.getX();
				rect.setFilled(true);
				rect2 = new GRect(start.getX(), start.getY(), rectW, rectH);
				rectH = e.getY() -start.getY();
				rectW = e.getX()-start.getX();
				rect2.setFilled(true);
				gobj = rect;
				add(gobj);
			if(e.getX()< last.getX()) {
				if(gobj != null) {
					remove(gobj);
				}
				rect = new GRect(start.getX(), start.getY(), rectW, rectH);
				rectW = e.getX()-start.getX();
				rect.setSize(rectW, rectH);
				rect.setFilled(true);
				rect2 = new GRect(start.getX(), start.getY(), rectW, rectH);
				rectW = e.getX()-start.getX();
				rect2.setSize(rectW, rectH);
				rect2.setFilled(true);
				gobj = rect;
				add(gobj);
			}else if(e.getY()< last.getY()) {
				if(gobj != null) {
					remove(gobj);
				}
				rect = new GRect(start.getX(), start.getY(), rectW, rectH);
				rectH = e.getY()-start.getY();
				rect.setSize(rectW, rectH);
				rect.setFilled(true);
				rect2 = new GRect(start.getX(), start.getY(), rectW, rectH);
				rectH = e.getY()-start.getY();
				rect2.setSize(rectW, rectH);
				rect2.setFilled(true);
				gobj = rect;
				add(gobj);
				}
		}
	
	last = new GPoint(e.getX(), e.getY());
	
	}
	
	public void mouseReleased(MouseEvent e) {
		add(rect2);
	}
	
	private GObject gobj;
}
